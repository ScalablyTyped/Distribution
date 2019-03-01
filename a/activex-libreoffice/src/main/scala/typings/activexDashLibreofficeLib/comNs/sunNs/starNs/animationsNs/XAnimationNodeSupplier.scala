package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAnimationNodeSupplier extends js.Object {
  val AnimationNode: XAnimationNode
  def getAnimationNode(): XAnimationNode
}

object XAnimationNodeSupplier {
  @scala.inline
  def apply(AnimationNode: XAnimationNode, getAnimationNode: js.Function0[XAnimationNode]): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnimationNode")(AnimationNode)
    __obj.updateDynamic("getAnimationNode")(getAnimationNode)
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
}

