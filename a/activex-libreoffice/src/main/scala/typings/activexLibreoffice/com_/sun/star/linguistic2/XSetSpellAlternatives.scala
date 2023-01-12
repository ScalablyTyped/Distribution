package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to modify the suggestion list returned by a spell checker.
  *
  * Basically this is needed to post-add further suggestions while keeping the originally returned reference from the spell checker. E.g. from the user
  * dictionaries.
  * @see com.sun.star.linguistic2.XSpellAlternatives
  */
trait XSetSpellAlternatives
  extends StObject
     with XInterface {
  
  /**
    * set the list of suggestions to be returned.
    * @since OOo 3.0.1
    */
  def setAlternatives(aAlternatives: SeqEquiv[String]): Unit
  
  /**
    * set the type of error found.
    * @see com.sun.star.linguistic2.SpellFailure
    * @since OOo 3.0.1
    */
  def setFailureType(nFailureType: Double): Unit
}
object XSetSpellAlternatives {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setAlternatives: SeqEquiv[String] => Unit,
    setFailureType: Double => Unit
  ): XSetSpellAlternatives = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlternatives = js.Any.fromFunction1(setAlternatives), setFailureType = js.Any.fromFunction1(setFailureType))
    __obj.asInstanceOf[XSetSpellAlternatives]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSetSpellAlternatives] (val x: Self) extends AnyVal {
    
    inline def setSetAlternatives(value: SeqEquiv[String] => Unit): Self = StObject.set(x, "setAlternatives", js.Any.fromFunction1(value))
    
    inline def setSetFailureType(value: Double => Unit): Self = StObject.set(x, "setFailureType", js.Any.fromFunction1(value))
  }
}
