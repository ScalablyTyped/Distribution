package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Grid")
@js.native
class Grid protected ()
  extends agDashGridLib.distLibGridMod.Grid {
  def this(eGridDiv: stdLib.HTMLElement, gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions) = this()
  def this(eGridDiv: stdLib.HTMLElement, gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions, params: agDashGridLib.distLibGridMod.GridParams) = this()
}

/* static members */
@JSImport("ag-grid", "Grid")
@js.native
object Grid extends js.Object {
  var RowModelClasses: js.Any = js.native
  var enterpriseBeans: js.Any = js.native
  var enterpriseComponents: js.Any = js.native
  var frameworkBeans: js.Any = js.native
  def setEnterpriseBeans(enterpriseBeans: js.Array[_], rowModelClasses: js.Any): scala.Unit = js.native
  def setEnterpriseComponents(components: js.Array[_]): scala.Unit = js.native
  def setFrameworkBeans(frameworkBeans: js.Array[_]): scala.Unit = js.native
}

