package typings.antd.libTreeDirectoryTreeMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libTreeTreeMod.AntTreeNode
import typings.antd.libTreeTreeMod.AntTreeNodeExpandedEvent
import typings.antd.libTreeTreeMod.AntTreeNodeSelectedEvent
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typings.antd.libTreeTreeMod.default = js.native
  def expandFolderNode(event: MouseEvent[HTMLElement, typings.std.MouseEvent], node: AntTreeNode): Unit = js.native
  def onClick(event: MouseEvent[HTMLElement, typings.std.MouseEvent], node: AntTreeNode): Unit = js.native
  def onDebounceExpand(event: MouseEvent[HTMLElement, NativeMouseEvent], node: AntTreeNode): Unit = js.native
  def onDoubleClick(event: MouseEvent[HTMLElement, typings.std.MouseEvent], node: AntTreeNode): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AntTreeNodeExpandedEvent): Unit | js.Thenable[Unit] = js.native
  def onSelect(keys: js.Array[String], event: AntTreeNodeSelectedEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typings.antd.libTreeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

