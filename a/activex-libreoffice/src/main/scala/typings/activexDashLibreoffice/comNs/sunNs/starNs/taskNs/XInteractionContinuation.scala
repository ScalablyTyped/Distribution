package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a way of how to continue from an {@link com.sun.star.task.XInteractionRequest} .
  *
  * Different sub-interfaces of this interface specify different ways of continuing.
  */
trait XInteractionContinuation extends XInterface {
  /**
    * Select this way of continuing from an {@link com.sun.star.task.XInteractionRequest} (given a choice of various instances of {@link
    * com.sun.star.task.XInteractionContinuation} ).
    */
  def select(): Unit
}

object XInteractionContinuation {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, select: () => Unit): XInteractionContinuation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select))
  
    __obj.asInstanceOf[XInteractionContinuation]
  }
}

