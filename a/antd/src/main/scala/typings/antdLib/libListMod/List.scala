package typings
package antdLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends reactLib.reactMod.Component[ListProps[T], ListState, js.Any] {
  var defaultPaginationProps: antdLib.Anon_CurrentTotal = js.native
  var keys: js.Any = js.native
  var onPaginationChange: js.Any = js.native
  var onPaginationShowSizeChange: js.Any = js.native
  @JSName("state")
  var state_List: antdLib.Anon_PaginationCurrent = js.native
  def getChildContext(): antdLib.Anon_GridHorizontal = js.native
  def isSomethingAfterLastItem(): scala.Boolean = js.native
  def renderEmpty(
    prefixCls: java.lang.String,
    renderEmpty: js.Function1[
      /* componentName */ js.UndefOr[java.lang.String], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderItem(item: js.Any, index: scala.Double): reactLib.reactMod.ReactNs.ReactNode = js.native
  def renderList(hasGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def triggerPaginationEvent(eventName: java.lang.String): js.Function2[/* page */ scala.Double, /* pageSize */ scala.Double, scala.Unit] = js.native
}

