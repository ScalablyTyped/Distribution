package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives access to the results of failed spell checking attempts and may provide spelling alternatives.
  *
  * This is used by the {@link com.sun.star.linguistic2.XSpellChecker.spell()} function when the word was not found to be correct. Suggestions for other
  * words to be used may be provided along with a failure-type that may specify why the word was not correct.
  * @see com.sun.star.linguistic2.SpellFailure
  */
@js.native
trait XSpellAlternatives extends XInterface {
  /** @returns the sequence of suggested spelling alternatives. */
  val Alternatives: SafeArray[String] = js.native
  /** @returns the number of suggested spelling alternatives available. */
  val AlternativesCount: Double = js.native
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  val FailureType: Double = js.native
  /** @returns the Locale which specifies the language of the misspelled word. */
  val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** @returns the word that was misspelled. */
  val Word: String = js.native
  /** @returns the sequence of suggested spelling alternatives. */
  def getAlternatives(): SafeArray[String] = js.native
  /** @returns the number of suggested spelling alternatives available. */
  def getAlternativesCount(): Double = js.native
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  def getFailureType(): Double = js.native
  /** @returns the Locale which specifies the language of the misspelled word. */
  def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** @returns the word that was misspelled. */
  def getWord(): String = js.native
}

object XSpellAlternatives {
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSpellAlternatives = {
    val __obj = js.Dynamic.literal(Alternatives = Alternatives.asInstanceOf[js.Any], AlternativesCount = AlternativesCount.asInstanceOf[js.Any], FailureType = FailureType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAlternatives = js.Any.fromFunction0(getAlternatives), getAlternativesCount = js.Any.fromFunction0(getAlternativesCount), getFailureType = js.Any.fromFunction0(getFailureType), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpellAlternatives]
  }
  @scala.inline
  implicit class XSpellAlternativesOps[Self <: XSpellAlternatives] (val x: Self) extends AnyVal {
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
    def setAlternatives(value: SafeArray[String]): Self = this.set("Alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternativesCount(value: Double): Self = this.set("AlternativesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureType(value: Double): Self = this.set("FailureType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: String): Self = this.set("Word", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAlternatives(value: () => SafeArray[String]): Self = this.set("getAlternatives", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAlternativesCount(value: () => Double): Self = this.set("getAlternativesCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFailureType(value: () => Double): Self = this.set("getFailureType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocale(value: () => Locale): Self = this.set("getLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWord(value: () => String): Self = this.set("getWord", js.Any.fromFunction0(value))
  }
  
}

