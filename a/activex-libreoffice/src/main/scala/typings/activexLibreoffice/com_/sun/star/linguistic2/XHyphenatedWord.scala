package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XHyphenatedWord
  extends StObject
     with XInterface {
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: Double
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: String
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: Double
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was hyphenated. */
  val Word: String
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): Double
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): String
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): Double
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was hyphenated. */
  def getWord(): String
  
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): Boolean
}
object XHyphenatedWord {
  
  inline def apply(
    HyphenPos: Double,
    HyphenatedWord: String,
    HyphenationPos: Double,
    Locale: Locale,
    Word: String,
    acquire: () => Unit,
    getHyphenPos: () => Double,
    getHyphenatedWord: () => String,
    getHyphenationPos: () => Double,
    getLocale: () => Locale,
    getWord: () => String,
    isAlternativeSpelling: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XHyphenatedWord = {
    val __obj = js.Dynamic.literal(HyphenPos = HyphenPos.asInstanceOf[js.Any], HyphenatedWord = HyphenatedWord.asInstanceOf[js.Any], HyphenationPos = HyphenationPos.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHyphenPos = js.Any.fromFunction0(getHyphenPos), getHyphenatedWord = js.Any.fromFunction0(getHyphenatedWord), getHyphenationPos = js.Any.fromFunction0(getHyphenationPos), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), isAlternativeSpelling = js.Any.fromFunction0(isAlternativeSpelling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHyphenatedWord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XHyphenatedWord] (val x: Self) extends AnyVal {
    
    inline def setGetHyphenPos(value: () => Double): Self = StObject.set(x, "getHyphenPos", js.Any.fromFunction0(value))
    
    inline def setGetHyphenatedWord(value: () => String): Self = StObject.set(x, "getHyphenatedWord", js.Any.fromFunction0(value))
    
    inline def setGetHyphenationPos(value: () => Double): Self = StObject.set(x, "getHyphenationPos", js.Any.fromFunction0(value))
    
    inline def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetWord(value: () => String): Self = StObject.set(x, "getWord", js.Any.fromFunction0(value))
    
    inline def setHyphenPos(value: Double): Self = StObject.set(x, "HyphenPos", value.asInstanceOf[js.Any])
    
    inline def setHyphenatedWord(value: String): Self = StObject.set(x, "HyphenatedWord", value.asInstanceOf[js.Any])
    
    inline def setHyphenationPos(value: Double): Self = StObject.set(x, "HyphenationPos", value.asInstanceOf[js.Any])
    
    inline def setIsAlternativeSpelling(value: () => Boolean): Self = StObject.set(x, "isAlternativeSpelling", js.Any.fromFunction0(value))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
