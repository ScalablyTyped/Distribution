package typings
package agDashGridLib.distLibHeaderRenderingHeaderHeaderCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi = js.native
  var column: agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi = js.native
  var context: js.Any = js.native
  var displayName: java.lang.String = js.native
  var enableMenu: scala.Boolean = js.native
  var enableSorting: scala.Boolean = js.native
  var template: java.lang.String = js.native
  def progressSort(): scala.Unit = js.native
  def progressSort(multiSort: scala.Boolean): scala.Unit = js.native
  def setSort(sort: java.lang.String): scala.Unit = js.native
  def setSort(sort: java.lang.String, multiSort: scala.Boolean): scala.Unit = js.native
  def showColumnMenu(source: stdLib.HTMLElement): scala.Unit = js.native
}

