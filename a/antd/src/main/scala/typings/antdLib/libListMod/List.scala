package typings
package antdLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List
  extends reactLib.reactMod.Component[ListProps, js.Object, js.Any] {
  var defaultPaginationProps: antdLib.Anon_CurrentOnChange = js.native
  var keys: js.Any = js.native
  @JSName("state")
  var state_List: antdLib.Anon_PaginationCurrent = js.native
  def getChildContext(): antdLib.Anon_Grid = js.native
  def isSomethingAfterLastItem(): scala.Boolean = js.native
  def renderEmpty(
    prefixCls: java.lang.String,
    renderEmpty: js.Function1[
      /* componentName */ js.UndefOr[java.lang.String], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderItem(item: js.Any, index: scala.Double): js.Any = js.native
  def renderList(hasGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

