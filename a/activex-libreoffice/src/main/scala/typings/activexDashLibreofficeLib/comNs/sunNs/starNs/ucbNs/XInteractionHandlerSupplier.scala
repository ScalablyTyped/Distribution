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

object XInteractionHandlerSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    hasInteractionHandler: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInteractionHandlerSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("hasInteractionHandler")(hasInteractionHandler)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XInteractionHandlerSupplier]
  }
}

