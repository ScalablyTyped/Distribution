package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionContinuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation specifying authentication success.
  * @since LibreOffice 4.4
  */
trait XInteractionAuthFallback extends XInteractionContinuation {
  def setCode(code: String): Unit
}

object XInteractionAuthFallback {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setCode: String => Unit
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setCode = js.Any.fromFunction1(setCode))
  
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
}

