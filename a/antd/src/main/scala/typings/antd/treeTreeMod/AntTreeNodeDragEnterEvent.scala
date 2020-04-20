package typings.antd.treeTreeMod

import typings.react.mod.DragEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: DragEvent[HTMLElement],
    expandedKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ],
    node: AntTreeNode
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
}

