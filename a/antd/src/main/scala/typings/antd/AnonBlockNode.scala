package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockNode extends js.Object {
  var blockNode: Boolean
  var checkable: Boolean
  var motion: AnonLeavedClassName
  var showIcon: Boolean
}

object AnonBlockNode {
  @scala.inline
  def apply(blockNode: Boolean, checkable: Boolean, motion: AnonLeavedClassName, showIcon: Boolean): AnonBlockNode = {
    val __obj = js.Dynamic.literal(blockNode = blockNode.asInstanceOf[js.Any], checkable = checkable.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlockNode]
  }
}

