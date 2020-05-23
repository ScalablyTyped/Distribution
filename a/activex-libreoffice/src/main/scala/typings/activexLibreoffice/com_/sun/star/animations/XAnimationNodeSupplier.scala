package typings.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAnimationNodeSupplier extends js.Object {
  val AnimationNode: XAnimationNode
  def getAnimationNode(): XAnimationNode
}

object XAnimationNodeSupplier {
  @scala.inline
  def apply(AnimationNode: XAnimationNode, getAnimationNode: () => XAnimationNode): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal(AnimationNode = AnimationNode.asInstanceOf[js.Any], getAnimationNode = js.Any.fromFunction0(getAnimationNode))
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
}

