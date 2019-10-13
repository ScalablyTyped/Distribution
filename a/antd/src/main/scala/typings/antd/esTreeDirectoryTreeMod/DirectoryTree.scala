package typings.antd.esTreeDirectoryTreeMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esTreeTreeMod.AntTreeNode
import typings.antd.esTreeTreeMod.AntTreeNodeExpandedEvent
import typings.antd.esTreeTreeMod.AntTreeNodeSelectedEvent
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typings.antd.esTreeTreeMod.default = js.native
  def expandFolderNode(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onClick(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onDebounceExpand(event: typings.react.reactMod.MouseEvent[HTMLElement, NativeMouseEvent], node: AntTreeNode): Unit = js.native
  def onDoubleClick(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AntTreeNodeExpandedEvent): Unit | js.Thenable[Unit] = js.native
  def onSelect(keys: js.Array[String], event: AntTreeNodeSelectedEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typings.antd.esTreeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

