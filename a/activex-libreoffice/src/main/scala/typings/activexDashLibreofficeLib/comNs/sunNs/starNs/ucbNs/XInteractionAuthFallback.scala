package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation specifying authentication success.
  * @since LibreOffice 4.4
  */
trait XInteractionAuthFallback
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  def setCode(code: java.lang.String): scala.Unit
}

object XInteractionAuthFallback {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    select: () => scala.Unit,
    setCode: java.lang.String => scala.Unit
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setCode = js.Any.fromFunction1(setCode))
  
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
}

