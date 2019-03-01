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

object XSlideShowListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    beginEvent: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationNode, 
      scala.Unit
    ],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    endEvent: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationNode, 
      scala.Unit
    ],
    hyperLinkClicked: js.Function1[java.lang.String, scala.Unit],
    paused: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    repeat: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationNode, 
      scala.Double, 
      scala.Unit
    ],
    resumed: js.Function0[scala.Unit],
    slideAnimationsEnded: js.Function0[scala.Unit],
    slideEnded: js.Function1[scala.Boolean, scala.Unit],
    slideTransitionEnded: js.Function0[scala.Unit],
    slideTransitionStarted: js.Function0[scala.Unit]
  ): XSlideShowListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("beginEvent")(beginEvent)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("endEvent")(endEvent)
    __obj.updateDynamic("hyperLinkClicked")(hyperLinkClicked)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("repeat")(repeat)
    __obj.updateDynamic("resumed")(resumed)
    __obj.updateDynamic("slideAnimationsEnded")(slideAnimationsEnded)
    __obj.updateDynamic("slideEnded")(slideEnded)
    __obj.updateDynamic("slideTransitionEnded")(slideTransitionEnded)
    __obj.updateDynamic("slideTransitionStarted")(slideTransitionStarted)
    __obj.asInstanceOf[XSlideShowListener]
  }
}

