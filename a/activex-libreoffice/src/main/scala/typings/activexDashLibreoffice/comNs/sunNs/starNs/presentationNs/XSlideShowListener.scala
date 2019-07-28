package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs.XAnimationListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs.XAnimationNode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener interface to receive global slide show events.
  * @see XShapeEventListener
  * @since OOo 3.0
  */
trait XSlideShowListener extends XAnimationListener {
  /**
    * Notifies that a hyperlink has been clicked.
    * @param hyperLink hyperlink URL
    */
  def hyperLinkClicked(hyperLink: String): Unit
  /** Notify that the slide show is paused */
  def paused(): Unit
  /** Notify that the slide show is resumed from a paused state */
  def resumed(): Unit
  /** Notify that the last animation from the main sequence of the current slide has ended. */
  def slideAnimationsEnded(): Unit
  /**
    * Notify that the current slide has ended, e.g. the user has clicked on the slide. Calling displaySlide() twice will not issue this event.
    * @param reverse For the default order (forward) this flag is `FALSE` . When the main sequence was traversed in reverse order then this flag is `TRUE` .
    */
  def slideEnded(reverse: Boolean): Unit
  /** Notify that the slide transition of the current slide ended. */
  def slideTransitionEnded(): Unit
  /** Notify that a new slide starts to become visible. */
  def slideTransitionStarted(): Unit
}

object XSlideShowListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    beginEvent: XAnimationNode => Unit,
    disposing: EventObject => Unit,
    endEvent: XAnimationNode => Unit,
    hyperLinkClicked: String => Unit,
    paused: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    repeat: (XAnimationNode, Double) => Unit,
    resumed: () => Unit,
    slideAnimationsEnded: () => Unit,
    slideEnded: Boolean => Unit,
    slideTransitionEnded: () => Unit,
    slideTransitionStarted: () => Unit
  ): XSlideShowListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginEvent = js.Any.fromFunction1(beginEvent), disposing = js.Any.fromFunction1(disposing), endEvent = js.Any.fromFunction1(endEvent), hyperLinkClicked = js.Any.fromFunction1(hyperLinkClicked), paused = js.Any.fromFunction0(paused), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), repeat = js.Any.fromFunction2(repeat), resumed = js.Any.fromFunction0(resumed), slideAnimationsEnded = js.Any.fromFunction0(slideAnimationsEnded), slideEnded = js.Any.fromFunction1(slideEnded), slideTransitionEnded = js.Any.fromFunction0(slideTransitionEnded), slideTransitionStarted = js.Any.fromFunction0(slideTransitionStarted))
  
    __obj.asInstanceOf[XSlideShowListener]
  }
}

