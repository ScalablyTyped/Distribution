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

