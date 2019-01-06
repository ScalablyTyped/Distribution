package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends reactLib.reactMod.Component[TreeProps, js.Any, js.Any] {
  var tree: js.Any = js.native
  def renderSwitcherIcon(
    prefixCls: java.lang.String,
    switcherIcon: js.UndefOr[scala.Nothing],
    hasIsLeafExpandedLoading: AntTreeNodeProps
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def renderSwitcherIcon(
    prefixCls: java.lang.String,
    switcherIcon: reactLib.reactMod.ReactNs.ReactElement[_],
    hasIsLeafExpandedLoading: AntTreeNodeProps
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def renderTree(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setTreeRef(node: js.Any): scala.Unit = js.native
}

