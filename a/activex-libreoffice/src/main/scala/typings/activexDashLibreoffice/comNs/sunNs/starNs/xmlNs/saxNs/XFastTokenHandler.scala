package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XFastTokenHandler extends XInterface {
  /**
    * returns a integer token for the given string
    * @param Identifier the string given as a byte sequence encoded in UTF-8
    * @returns a unique integer token for the given String or {@link FastToken.DONTKNOW} if the identifier is not known to this instance.
    */
  def getTokenFromUTF8(Identifier: SeqEquiv[Double]): Double
  /** returns a identifier for the given integer token as a byte sequence encoded in UTF-8. */
  def getUTF8Identifier(Token: Double): SafeArray[Double]
}

object XFastTokenHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getTokenFromUTF8: SeqEquiv[Double] => Double,
    getUTF8Identifier: Double => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFastTokenHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getTokenFromUTF8 = js.Any.fromFunction1(getTokenFromUTF8), getUTF8Identifier = js.Any.fromFunction1(getUTF8Identifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFastTokenHandler]
  }
}

