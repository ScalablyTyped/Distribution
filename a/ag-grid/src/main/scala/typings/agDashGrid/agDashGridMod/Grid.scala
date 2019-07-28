package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibEntitiesGridOptionsMod.GridOptions
import typings.agDashGrid.distLibGridMod.GridParams
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Grid")
@js.native
class Grid protected ()
  extends typings.agDashGrid.distLibGridMod.Grid {
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions) = this()
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions, params: GridParams) = this()
}

/* static members */
@JSImport("ag-grid", "Grid")
@js.native
object Grid extends js.Object {
  var RowModelClasses: js.Any = js.native
  var enterpriseBeans: js.Any = js.native
  var enterpriseComponents: js.Any = js.native
  var frameworkBeans: js.Any = js.native
  def setEnterpriseBeans(enterpriseBeans: js.Array[_], rowModelClasses: js.Any): Unit = js.native
  def setEnterpriseComponents(components: js.Array[_]): Unit = js.native
  def setFrameworkBeans(frameworkBeans: js.Array[_]): Unit = js.native
}

