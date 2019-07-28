package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealSize2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains attributes needed to run an animation.
  * @since OOo 2.0
  */
trait AnimationAttributes extends js.Object {
  var Duration: Double
  /**
    * Repeat mode of the animation sequence.
    *
    * This value determines how the [0,1] parameter space of the animation should be swept through. Permissible values are given in {@link AnimationRepeat}
    * .
    * @see AnimationRepeat.
    */
  var RepeatMode: Double
  /**
    * Size of the untransformed animation sequence.
    *
    * This value specifies the size of the animation when rendered with the identity view transform. This permits e.g. {@link XSprite} implementations to
    * cache rendered animation content in finite-sized bitmaps.
    */
  var UntransformedSize: RealSize2D
}

object AnimationAttributes {
  @scala.inline
  def apply(Duration: Double, RepeatMode: Double, UntransformedSize: RealSize2D): AnimationAttributes = {
    val __obj = js.Dynamic.literal(Duration = Duration, RepeatMode = RepeatMode, UntransformedSize = UntransformedSize)
  
    __obj.asInstanceOf[AnimationAttributes]
  }
}

