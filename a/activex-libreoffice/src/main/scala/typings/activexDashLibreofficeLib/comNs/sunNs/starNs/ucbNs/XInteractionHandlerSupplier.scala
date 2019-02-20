package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface should be implemented by an internal {@link XCommandEnvironment} that can not supply an {@link com.sun.star.task.XInteractionHandler} ,
  * but instead wants interaction requests to be handled by other internal error handling mechanism.
  */
trait XInteractionHandlerSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns whether an {@link com.sun.star.task.XInteractionHandler} can be supplied.
    * @returns `TRUE` , if an {@link com.sun.star.task.XInteractionHandler} can be supplied, `FALSE` otherwise.
    */
  def hasInteractionHandler(): scala.Boolean
}

