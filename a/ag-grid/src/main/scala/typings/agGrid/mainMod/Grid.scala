package typings.agGrid.mainMod

import typings.agGrid.gridMod.GridParams
import typings.agGrid.gridOptionsMod.GridOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "Grid")
@js.native
class Grid protected ()
  extends typings.agGrid.gridMod.Grid {
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions) = this()
  def this(eGridDiv: HTMLElement, gridOptions: GridOptions, params: GridParams) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "Grid")
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

