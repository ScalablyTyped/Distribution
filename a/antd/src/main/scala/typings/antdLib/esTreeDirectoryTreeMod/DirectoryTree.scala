package typings
package antdLib.esTreeDirectoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends reactLib.reactMod.Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.native
  var lastSelectedKey: js.UndefOr[java.lang.String] = js.native
  @JSName("state")
  var state_DirectoryTree: DirectoryTreeState = js.native
  var tree: antdLib.esTreeTreeMod.default = js.native
  def expandFolderNode(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent],
    node: antdLib.esTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onClick(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent],
    node: antdLib.esTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onDebounceExpand(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent],
    node: antdLib.esTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onDoubleClick(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent],
    node: antdLib.esTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onExpand(expandedKeys: js.Array[java.lang.String], info: antdLib.esTreeTreeMod.AntTreeNodeExpandedEvent): scala.Unit | js.Thenable[_] = js.native
  def onSelect(keys: js.Array[java.lang.String], event: antdLib.esTreeTreeMod.AntTreeNodeSelectedEvent): scala.Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setTreeRef(node: antdLib.esTreeTreeMod.default): scala.Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): scala.Unit = js.native
}

