package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link TransitionFactory} interface to request optional custom Transition instances for slide show transitions.
  *
  * This interface provides the necessary methods to query and create optional transition effects for a {@link SlideShow}
  * @since OOo 2.4
  */
trait XTransitionFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Actually create a transition for the given transition id
    * @param transitionType Main type of transition (
    * @param transitionSubType Subtype for the transition (
    * @param view Slide show view to display on
    * @param leavingBitmap Bitmap of the slide that's going to leave the screen
    * @param enteringBitmap Bitmap of the slide that's going to enter the screen
    * @see com.sun.star.animations.TransitionType)
    * @see com.sun.star.animations.TransitionSubType)
    */
  def createTransition(
    transitionType: scala.Double,
    transitionSubType: scala.Double,
    view: XSlideShowView,
    leavingBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap,
    enteringBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
  ): XTransition
  /** Checks whether this instance provides an implementation for given transition id. */
  def hasTransition(transitionType: scala.Double, transitionSubType: scala.Double): scala.Boolean
}

object XTransitionFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createTransition: (scala.Double, scala.Double, XSlideShowView, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap) => XTransition,
    hasTransition: (scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTransitionFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createTransition = js.Any.fromFunction5(createTransition), hasTransition = js.Any.fromFunction2(hasTransition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransitionFactory]
  }
}

