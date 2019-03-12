package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners, which are called whenever an animation event occurs.
  * @since OOo 3.0
  */
trait XAnimationListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * This event is raised when the element local timeline begins to play.
    *
    * It will be raised each time the element begins the active duration (i.e. when it restarts, but not when it repeats).
    *
    * It may be raised both in the course of normal (i.e. scheduled or interactive) timeline play, as well as in the case that the element was begun with an
    * interface method.
    * @param Node The node that begins to play.
    */
  def beginEvent(Node: XAnimationNode): scala.Unit
  /**
    * This event is raised at the active end of the element.
    *
    * Note that this event is not raised at the simple end of each repeat.
    *
    * This event may be raised both in the course of normal (i.e. scheduled or interactive) timeline play, as well as in the case that the element was ended
    * with a DOM method.
    * @param Node The node that stops playing.
    */
  def endEvent(Node: XAnimationNode): scala.Unit
  /**
    * This event is raised when the element local timeline repeats.
    *
    * It will be raised each time the element repeats, after the first iteration.
    *
    * Associated with the repeat event is an integer that indicates which repeat iteration is beginning.
    * @param Node The node that repeats.
    * @param Repeat The value is a 0-based integer, but the repeat event is not raised for the first iteration and so the observed values will be >= 1.
    */
  def repeat(Node: XAnimationNode, Repeat: scala.Double): scala.Unit
}

object XAnimationListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    beginEvent: XAnimationNode => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    endEvent: XAnimationNode => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    repeat: (XAnimationNode, scala.Double) => scala.Unit
  ): XAnimationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginEvent = js.Any.fromFunction1(beginEvent), disposing = js.Any.fromFunction1(disposing), endEvent = js.Any.fromFunction1(endEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), repeat = js.Any.fromFunction2(repeat))
  
    __obj.asInstanceOf[XAnimationListener]
  }
}

