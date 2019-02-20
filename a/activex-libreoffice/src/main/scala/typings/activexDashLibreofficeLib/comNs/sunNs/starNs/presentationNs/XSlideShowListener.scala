package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener interface to receive global slide show events.
  * @see XShapeEventListener
  * @since OOo 3.0
  */
trait XSlideShowListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationListener {
  /**
    * Notifies that a hyperlink has been clicked.
    * @param hyperLink hyperlink URL
    */
  def hyperLinkClicked(hyperLink: java.lang.String): scala.Unit
  /** Notify that the slide show is paused */
  def paused(): scala.Unit
  /** Notify that the slide show is resumed from a paused state */
  def resumed(): scala.Unit
  /** Notify that the last animation from the main sequence of the current slide has ended. */
  def slideAnimationsEnded(): scala.Unit
  /**
    * Notify that the current slide has ended, e.g. the user has clicked on the slide. Calling displaySlide() twice will not issue this event.
    * @param reverse For the default order (forward) this flag is `FALSE` . When the main sequence was traversed in reverse order then this flag is `TRUE` .
    */
  def slideEnded(reverse: scala.Boolean): scala.Unit
  /** Notify that the slide transition of the current slide ended. */
  def slideTransitionEnded(): scala.Unit
  /** Notify that a new slide starts to become visible. */
  def slideTransitionStarted(): scala.Unit
}

