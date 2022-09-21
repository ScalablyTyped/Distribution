package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.animations.XAnimationListener
import typings.activexLibreoffice.com_.sun.star.animations.XAnimationNode
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener interface to receive global slide show events.
  * @see XShapeEventListener
  * @since OOo 3.0
  */
trait XSlideShowListener
  extends StObject
     with XAnimationListener {
  
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
  
  inline def apply(
    acquire: () => Unit,
    beginEvent: XAnimationNode => Unit,
    disposing: EventObject => Unit,
    endEvent: XAnimationNode => Unit,
    hyperLinkClicked: String => Unit,
    paused: () => Unit,
    queryInterface: `type` => Any,
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
  
  extension [Self <: XSlideShowListener](x: Self) {
    
    inline def setHyperLinkClicked(value: String => Unit): Self = StObject.set(x, "hyperLinkClicked", js.Any.fromFunction1(value))
    
    inline def setPaused(value: () => Unit): Self = StObject.set(x, "paused", js.Any.fromFunction0(value))
    
    inline def setResumed(value: () => Unit): Self = StObject.set(x, "resumed", js.Any.fromFunction0(value))
    
    inline def setSlideAnimationsEnded(value: () => Unit): Self = StObject.set(x, "slideAnimationsEnded", js.Any.fromFunction0(value))
    
    inline def setSlideEnded(value: Boolean => Unit): Self = StObject.set(x, "slideEnded", js.Any.fromFunction1(value))
    
    inline def setSlideTransitionEnded(value: () => Unit): Self = StObject.set(x, "slideTransitionEnded", js.Any.fromFunction0(value))
    
    inline def setSlideTransitionStarted(value: () => Unit): Self = StObject.set(x, "slideTransitionStarted", js.Any.fromFunction0(value))
  }
}
