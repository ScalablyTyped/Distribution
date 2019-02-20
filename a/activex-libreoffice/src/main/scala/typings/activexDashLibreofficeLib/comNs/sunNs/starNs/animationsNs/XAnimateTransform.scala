package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * animates a transformation attribute on a target element, thereby allowing animations to control translation, scaling, rotation and/or skewing.
  *
  * The member XAnimate::Attributes contains a short from {@link AnimationTransformType} .
  *
  * Depending on the value in XAnimate::Attributes, the members {@link XAnimate.From} , {@link XAnimate.To} , {@link XAnimate.By} or {@link
  * XAnimate.Values} contain the following
  *
  * {@link AnimationTransformType.TRANSLATE}; {@link ValuePair} of **tx** and **ty**{@link AnimationTransformType.SCALE}; {@link ValuePair} of **sx** and
  * **sy**{@link AnimationTransformType.ROTATE};  Values for a rotation angle{@link AnimationTransformType.SKEWX};  Values for a skew-angle{@link
  * AnimationTransformType.SKEWY};  Values for a skew-angle
  * @see http://www.w3.org/TR/SVG/animate.html#AnimateTransformElement
  */
trait XAnimateTransform extends XAnimate {
  /** @see AnimationTransformType */
  var TransformType: scala.Double
}

