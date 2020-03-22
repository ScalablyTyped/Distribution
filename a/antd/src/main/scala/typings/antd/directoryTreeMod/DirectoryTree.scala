package typings.antd.directoryTreeMod

import typings.antd.AnonEvent
import typings.antd.AnonExpanded
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
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
  var tree: typings.antd.treeTreeMod.default = js.native
  def expandFolderNode(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], node: js.Any): Unit = js.native
  def onClick(
    event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDebounceExpand(
    event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDoubleClick(
    event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AnonExpanded): Unit = js.native
  def onSelect(keys: js.Array[String], event: AnonEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typings.antd.treeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

