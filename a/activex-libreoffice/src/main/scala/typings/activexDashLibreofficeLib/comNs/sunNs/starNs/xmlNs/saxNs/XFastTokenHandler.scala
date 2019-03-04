package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to translate XML strings to integer tokens.
  *
  * An instance of this interface can be registered at a {@link XFastParser} . It should be able to translate all XML names (element local names,
  * attribute local names and constant attribute values) to integer tokens.
  *
  * A token value must be greater or equal to zero and less than {@link FastToken.NAMESPACE} . If a string identifier is not known to this instance,
  * {@link FastToken.DONTKNOW} is returned.
  */
trait XFastTokenHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a integer token for the given string
    * @param Identifier the string given as a byte sequence encoded in UTF-8
    * @returns a unique integer token for the given String or {@link FastToken.DONTKNOW} if the identifier is not known to this instance.
    */
  def getTokenFromUTF8(Identifier: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Double
  /** returns a identifier for the given integer token as a byte sequence encoded in UTF-8. */
  def getUTF8Identifier(Token: scala.Double): activexDashInteropLib.SafeArray[scala.Double]
}

object XFastTokenHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getTokenFromUTF8: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double],
    getUTF8Identifier: js.Function1[scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFastTokenHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, getTokenFromUTF8 = getTokenFromUTF8, getUTF8Identifier = getUTF8Identifier, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFastTokenHandler]
  }
}

