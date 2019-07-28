package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animationsNs {
  /** @since LibreOffice 4.1 */
  type AnimateColor = XAnimate
  /** @since LibreOffice 4.1 */
  type AnimateMotion = XAnimationNode
  /** @since LibreOffice 4.1 */
  type AnimateSet = XAnimate
  /** @since LibreOffice 4.1 */
  type Audio = XAudio
  /** @since LibreOffice 4.1 */
  type Command = XCommand
  /** @since LibreOffice 4.1 */
  type IterateContainer = XTimeContainer
  /** @since LibreOffice 4.1 */
  type ParallelTimeContainer = XParallelTimeContainer
  /** @since LibreOffice 4.1 */
  type SequenceTimeContainer = XTimeContainer
  /**
    * Interface for animation by simply setting the value of the target attribute to a constant value. This interface provides a simple means of just
    * setting the value of an attribute for a specified duration.
    *
    * When using {@link XAnimateSet} , the following members are ignored {@link XAnimate.Values}{@link XAnimate.KeyTimes}{@link XAnimate.CalcMode}{@link
    * XAnimate.Accumulate}{@link XAnimate.Additive}{@link XAnimate.From}{@link XAnimate.By}{@link XAnimate.TimeFilter}
    * @see http://www.w3.org/TR/smil20/animation.html#edef-set
    */
  type XAnimateSet = XAnimate
}
