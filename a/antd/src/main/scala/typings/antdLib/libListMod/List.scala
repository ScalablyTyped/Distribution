package typings
package antdLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List
  extends reactLib.reactMod.Component[ListProps, js.Object, js.Any] {
  var defaultPaginationProps: antdLib.Anon_Total = js.native
  var keys: js.Any = js.native
  @JSName("state")
  var state_List: antdLib.Anon_PaginationCurrent = js.native
  def getChildContext(): antdLib.Anon_GridListGridType = js.native
  def isSomethingAfterLastItem(): scala.Boolean = js.native
  def renderEmpty(contextLocale: ListLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderItem(item: reactLib.reactMod.ReactNs.ReactElement[_], index: scala.Double): js.Any = js.native
}

