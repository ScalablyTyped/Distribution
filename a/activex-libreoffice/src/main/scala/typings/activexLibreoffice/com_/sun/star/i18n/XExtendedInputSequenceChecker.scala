package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface perform input sequence correction for the languages like Thai and Hindi
  *
  * It is derived from {@link com.sun.star.i18n.XInputSequenceChecker} and provides additional functionality to correct input sequence.
  * @since OOo 2.0.1
  */
trait XExtendedInputSequenceChecker
  extends StObject
     with XInputSequenceChecker {
  
  /**
    * @param aText Text to be checked and corrected.
    * @param nPos Index in aText where checking starts.
    * @param cInputChar The input character. Or at least, a UTF16 code unit thereof. It looks like this interface was not designed with non-BMP characters in
    * @param nInputCheckMode One of {@link InputSequenceCheckMode} constants.
    * @returns Next nPos, or length of aText if nothing is corrected.
    */
  def correctInputSequence(aText: js.Array[String], nPos: Double, cInputChar: String, nInputCheckMode: Double): Double
}
object XExtendedInputSequenceChecker {
  
  inline def apply(
    acquire: () => Unit,
    checkInputSequence: (String, Double, String, Double) => Boolean,
    correctInputSequence: (js.Array[String], Double, String, Double) => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XExtendedInputSequenceChecker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInputSequence = js.Any.fromFunction4(checkInputSequence), correctInputSequence = js.Any.fromFunction4(correctInputSequence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExtendedInputSequenceChecker]
  }
  
  extension [Self <: XExtendedInputSequenceChecker](x: Self) {
    
    inline def setCorrectInputSequence(value: (js.Array[String], Double, String, Double) => Double): Self = StObject.set(x, "correctInputSequence", js.Any.fromFunction4(value))
  }
}
