package typings.antd.baseMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseState extends js.Object {
  var clientRendered: Boolean
  var copied: Boolean
  var edit: Boolean
  var ellipsisContent: ReactNode
  var ellipsisText: String
  var expanded: Boolean
  var isEllipsis: Boolean
}

object BaseState {
  @scala.inline
  def apply(
    clientRendered: Boolean,
    copied: Boolean,
    edit: Boolean,
    ellipsisText: String,
    expanded: Boolean,
    isEllipsis: Boolean,
    ellipsisContent: ReactNode = null
  ): BaseState = {
    val __obj = js.Dynamic.literal(clientRendered = clientRendered.asInstanceOf[js.Any], copied = copied.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], ellipsisText = ellipsisText.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEllipsis = isEllipsis.asInstanceOf[js.Any])
    if (ellipsisContent != null) __obj.updateDynamic("ellipsisContent")(ellipsisContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseState]
  }
}

