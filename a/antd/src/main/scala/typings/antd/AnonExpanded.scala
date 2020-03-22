package typings.antd

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpanded extends js.Object {
  var expanded: Boolean
  var nativeEvent: MouseEvent
  var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
}

object AnonExpanded {
  @scala.inline
  def apply(
    expanded: Boolean,
    nativeEvent: MouseEvent,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): AnonExpanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpanded]
  }
}

