package typings
package antdLib.libTreeDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[T /* <: antdLib.libTreeDashSelectInterfaceMod.TreeNodeValue */]
  extends reactLib.reactMod.Component[antdLib.libTreeDashSelectInterfaceMod.TreeSelectProps[T], js.Any, js.Any] {
  var rcTreeSelect: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def renderSwitcherIcon(prefixCls: java.lang.String, hasIsLeafLoading: antdLib.libTreeTreeMod.AntTreeNodeProps): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderTreeSelect(hasGetPopupContainerGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveTreeSelect(node: js.Any): scala.Unit = js.native
}

