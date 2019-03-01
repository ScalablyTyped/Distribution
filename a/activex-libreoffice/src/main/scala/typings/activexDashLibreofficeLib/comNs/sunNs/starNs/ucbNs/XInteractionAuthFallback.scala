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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setCode: js.Function1[java.lang.String, scala.Unit]
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setCode")(setCode)
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
}

