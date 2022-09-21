package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives access to the results of failed spell checking attempts and may provide spelling alternatives.
  *
  * This is used by the {@link com.sun.star.linguistic2.XSpellChecker.spell()} function when the word was not found to be correct. Suggestions for other
  * words to be used may be provided along with a failure-type that may specify why the word was not correct.
  * @see com.sun.star.linguistic2.SpellFailure
  */
trait XSpellAlternatives
  extends StObject
     with XInterface {
  
  /** @returns the sequence of suggested spelling alternatives. */
  val Alternatives: SafeArray[String]
  
  /** @returns the number of suggested spelling alternatives available. */
  val AlternativesCount: Double
  
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  val FailureType: Double
  
  /** @returns the Locale which specifies the language of the misspelled word. */
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was misspelled. */
  val Word: String
  
  /** @returns the sequence of suggested spelling alternatives. */
  def getAlternatives(): SafeArray[String]
  
  /** @returns the number of suggested spelling alternatives available. */
  def getAlternativesCount(): Double
  
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  def getFailureType(): Double
  
  /** @returns the Locale which specifies the language of the misspelled word. */
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was misspelled. */
  def getWord(): String
}
object XSpellAlternatives {
  
  inline def apply(
    Alternatives: SafeArray[String],
    AlternativesCount: Double,
    FailureType: Double,
    Locale: Locale,
    Word: String,
    acquire: () => Unit,
    getAlternatives: () => SafeArray[String],
    getAlternativesCount: () => Double,
    getFailureType: () => Double,
    getLocale: () => Locale,
    getWord: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSpellAlternatives = {
    val __obj = js.Dynamic.literal(Alternatives = Alternatives.asInstanceOf[js.Any], AlternativesCount = AlternativesCount.asInstanceOf[js.Any], FailureType = FailureType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAlternatives = js.Any.fromFunction0(getAlternatives), getAlternativesCount = js.Any.fromFunction0(getAlternativesCount), getFailureType = js.Any.fromFunction0(getFailureType), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpellAlternatives]
  }
  
  extension [Self <: XSpellAlternatives](x: Self) {
    
    inline def setAlternatives(value: SafeArray[String]): Self = StObject.set(x, "Alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesCount(value: Double): Self = StObject.set(x, "AlternativesCount", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: Double): Self = StObject.set(x, "FailureType", value.asInstanceOf[js.Any])
    
    inline def setGetAlternatives(value: () => SafeArray[String]): Self = StObject.set(x, "getAlternatives", js.Any.fromFunction0(value))
    
    inline def setGetAlternativesCount(value: () => Double): Self = StObject.set(x, "getAlternativesCount", js.Any.fromFunction0(value))
    
    inline def setGetFailureType(value: () => Double): Self = StObject.set(x, "getFailureType", js.Any.fromFunction0(value))
    
    inline def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetWord(value: () => String): Self = StObject.set(x, "getWord", js.Any.fromFunction0(value))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
