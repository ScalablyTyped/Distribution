package typings
package agDashGridLib.distLibGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/grid", "Grid")
@js.native
class Grid protected () extends js.Object {
  def this(eGridDiv: stdLib.HTMLElement, gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions) = this()
  def this(eGridDiv: stdLib.HTMLElement, gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions, params: GridParams) = this()
  var context: js.Any = js.native
  def destroy(): scala.Unit = js.native
  /* private */ def dispatchGridReadyEvent(gridOptions: js.Any): js.Any = js.native
  /* private */ def getRowModelClass(gridOptions: js.Any): js.Any = js.native
  /* private */ def setColumnsAndData(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/grid", "Grid")
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

