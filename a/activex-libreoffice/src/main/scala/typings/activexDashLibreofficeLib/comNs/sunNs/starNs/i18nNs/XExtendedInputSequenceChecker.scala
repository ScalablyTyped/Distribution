package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface perform input sequence correction for the languages like Thai and Hindi
  *
  * It is derived from {@link com.sun.star.i18n.XInputSequenceChecker} and provides additional functionality to correct input sequence.
  * @since OOo 2.0.1
  */
trait XExtendedInputSequenceChecker extends XInputSequenceChecker {
  /**
    * @param aText Text to be checked and corrected.
    * @param nPos Index in aText where checking starts.
    * @param cInputChar The input character. Or at least, a UTF16 code unit thereof. It looks like this interface was not designed with non-BMP characters in
    * @param nInputCheckMode One of {@link InputSequenceCheckMode} constants.
    * @returns Next nPos, or length of aText if nothing is corrected.
    */
  def correctInputSequence(
    aText: js.Array[java.lang.String],
    nPos: scala.Double,
    cInputChar: java.lang.String,
    nInputCheckMode: scala.Double
  ): scala.Double
}

object XExtendedInputSequenceChecker {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    checkInputSequence: (java.lang.String, scala.Double, java.lang.String, scala.Double) => scala.Boolean,
    correctInputSequence: (js.Array[java.lang.String], scala.Double, java.lang.String, scala.Double) => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XExtendedInputSequenceChecker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInputSequence = js.Any.fromFunction4(checkInputSequence), correctInputSequence = js.Any.fromFunction4(correctInputSequence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XExtendedInputSequenceChecker]
  }
}

