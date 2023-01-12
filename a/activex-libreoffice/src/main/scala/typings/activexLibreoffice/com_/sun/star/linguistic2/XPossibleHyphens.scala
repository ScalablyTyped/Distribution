package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives information about a word's possible hyphenation points.
  *
  * Example: In German pre-spelling-reform you may have the following: getWord: Dampfschiffahrt getPossibleHyphens: Dampf=schiff=fahrt
  * getOrigHyphensPositions: 4, 9 That is "Dampfschiffahrt" can be hyphenated after the "pf" (4) and between the double "ff" (9). And if you are going to
  * hyphenate it at position 9 you will get an additional "f" before the hyphen character.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XPossibleHyphens
  extends StObject
     with XInterface {
  
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  val HyphenationPositions: SafeArray[Double]
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  val PossibleHyphens: String
  
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  val Word: String
  
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  def getHyphenationPositions(): SafeArray[Double]
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  def getPossibleHyphens(): String
  
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  def getWord(): String
}
object XPossibleHyphens {
  
  inline def apply(
    HyphenationPositions: SafeArray[Double],
    Locale: Locale,
    PossibleHyphens: String,
    Word: String,
    acquire: () => Unit,
    getHyphenationPositions: () => SafeArray[Double],
    getLocale: () => Locale,
    getPossibleHyphens: () => String,
    getWord: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal(HyphenationPositions = HyphenationPositions.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], PossibleHyphens = PossibleHyphens.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHyphenationPositions = js.Any.fromFunction0(getHyphenationPositions), getLocale = js.Any.fromFunction0(getLocale), getPossibleHyphens = js.Any.fromFunction0(getPossibleHyphens), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPossibleHyphens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPossibleHyphens] (val x: Self) extends AnyVal {
    
    inline def setGetHyphenationPositions(value: () => SafeArray[Double]): Self = StObject.set(x, "getHyphenationPositions", js.Any.fromFunction0(value))
    
    inline def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetPossibleHyphens(value: () => String): Self = StObject.set(x, "getPossibleHyphens", js.Any.fromFunction0(value))
    
    inline def setGetWord(value: () => String): Self = StObject.set(x, "getWord", js.Any.fromFunction0(value))
    
    inline def setHyphenationPositions(value: SafeArray[Double]): Self = StObject.set(x, "HyphenationPositions", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setPossibleHyphens(value: String): Self = StObject.set(x, "PossibleHyphens", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
