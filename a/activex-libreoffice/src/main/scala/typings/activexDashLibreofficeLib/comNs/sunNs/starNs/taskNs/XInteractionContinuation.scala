package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a way of how to continue from an {@link com.sun.star.task.XInteractionRequest} .
  *
  * Different sub-interfaces of this interface specify different ways of continuing.
  */
trait XInteractionContinuation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Select this way of continuing from an {@link com.sun.star.task.XInteractionRequest} (given a choice of various instances of {@link
    * com.sun.star.task.XInteractionContinuation} ).
    */
  def select(): scala.Unit
}

