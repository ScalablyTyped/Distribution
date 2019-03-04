package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the routine to check Thai input sequence checking
  * @since OOo 1.1.2
  */
trait XInputSequenceChecker
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param aText Text to be checked.
    * @param nPos Index in aText where checking starts.
    * @param cInputChar The input character. Or at least, a UTF16 code unit thereof. It looks like this interface was not designed with non-BMP characters in
    * @param nInputCheckMode One of {@link InputSequenceCheckMode} constants.
    * @returns true/false for the input check
    */
  def checkInputSequence(
    aText: java.lang.String,
    nPos: scala.Double,
    cInputChar: java.lang.String,
    nInputCheckMode: scala.Double
  ): scala.Boolean
}

object XInputSequenceChecker {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    checkInputSequence: js.Function4[java.lang.String, scala.Double, java.lang.String, scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInputSequenceChecker = {
    val __obj = js.Dynamic.literal(acquire = acquire, checkInputSequence = checkInputSequence, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInputSequenceChecker]
  }
}

