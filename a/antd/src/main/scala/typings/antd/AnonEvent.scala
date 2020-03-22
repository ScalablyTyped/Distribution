package typings.antd

import typings.antd.antdStrings.select
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: select
  var nativeEvent: MouseEvent
  var node: js.Any
  var selected: Boolean
  var selectedNodes: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
  ]
}

object AnonEvent {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: js.Any,
    selected: Boolean,
    selectedNodes: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ]
  ): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

