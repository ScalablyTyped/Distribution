package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
@js.native
trait XHyphenatedWord extends XInterface {
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: Double = js.native
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: String = js.native
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: Double = js.native
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** @returns the word that was hyphenated. */
  val Word: String = js.native
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): Double = js.native
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): String = js.native
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): Double = js.native
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** @returns the word that was hyphenated. */
  def getWord(): String = js.native
  
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): Boolean = js.native
}
object XHyphenatedWord {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHyphenatedWord = {
    val __obj = js.Dynamic.literal(HyphenPos = HyphenPos.asInstanceOf[js.Any], HyphenatedWord = HyphenatedWord.asInstanceOf[js.Any], HyphenationPos = HyphenationPos.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHyphenPos = js.Any.fromFunction0(getHyphenPos), getHyphenatedWord = js.Any.fromFunction0(getHyphenatedWord), getHyphenationPos = js.Any.fromFunction0(getHyphenationPos), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), isAlternativeSpelling = js.Any.fromFunction0(isAlternativeSpelling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHyphenatedWord]
  }
  
  @scala.inline
  implicit class XHyphenatedWordOps[Self <: XHyphenatedWord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHyphenPos(value: Double): Self = this.set("HyphenPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphenatedWord(value: String): Self = this.set("HyphenatedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphenationPos(value: Double): Self = this.set("HyphenationPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = this.set("Word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHyphenPos(value: () => Double): Self = this.set("getHyphenPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHyphenatedWord(value: () => String): Self = this.set("getHyphenatedWord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHyphenationPos(value: () => Double): Self = this.set("getHyphenationPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocale(value: () => Locale): Self = this.set("getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWord(value: () => String): Self = this.set("getWord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAlternativeSpelling(value: () => Boolean): Self = this.set("isAlternativeSpelling", js.Any.fromFunction0(value))
  }
}
