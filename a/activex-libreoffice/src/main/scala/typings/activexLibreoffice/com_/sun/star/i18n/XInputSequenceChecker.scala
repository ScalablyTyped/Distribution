package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the routine to check Thai input sequence checking
  * @since OOo 1.1.2
  */
trait XInputSequenceChecker
  extends StObject
     with XInterface {
  
  /**
    * @param aText Text to be checked.
    * @param nPos Index in aText where checking starts.
    * @param cInputChar The input character. Or at least, a UTF16 code unit thereof. It looks like this interface was not designed with non-BMP characters in
    * @param nInputCheckMode One of {@link InputSequenceCheckMode} constants.
    * @returns true/false for the input check
    */
  def checkInputSequence(aText: String, nPos: Double, cInputChar: String, nInputCheckMode: Double): Boolean
}
object XInputSequenceChecker {
  
  inline def apply(
    acquire: () => Unit,
    checkInputSequence: (String, Double, String, Double) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInputSequenceChecker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInputSequence = js.Any.fromFunction4(checkInputSequence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInputSequenceChecker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInputSequenceChecker] (val x: Self) extends AnyVal {
    
    inline def setCheckInputSequence(value: (String, Double, String, Double) => Boolean): Self = StObject.set(x, "checkInputSequence", js.Any.fromFunction4(value))
  }
}
