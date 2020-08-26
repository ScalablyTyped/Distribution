package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces gives access to a dictionary entry.
  *
  * A dictionary entry can supply a word and its hyphenation and indicate if it is a negative word. If it is a negative entry it may supply a replacement
  * text to be used instead of the entry word.
  *
  * Hyphenation positions are represented by an "=" in the word. If the "=" is the last character of the word this means it should not be hyphenated. If
  * there is no "=" charter in the word, hyphenation positions will be determined automatically (i.e., from the hyphenator service alone).
  *
  * Entries whose words only differ in hyphenation are considered to be equal. Also a "." at the end of the word will make no difference.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.uno.XInterface
  */
@js.native
trait XDictionaryEntry extends XInterface {
  /** @returns the word defining this entry. */
  val DictionaryWord: String = js.native
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  val ReplacementText: String = js.native
  /** @returns the word defining this entry. */
  def getDictionaryWord(): String = js.native
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  def getReplacementText(): String = js.native
  /** @returns `TRUE` if the word (entry) is a negative one and should not be used, `FALSE` otherwise. */
  def isNegative(): Boolean = js.native
}

object XDictionaryEntry {
  @scala.inline
  def apply(
    DictionaryWord: String,
    ReplacementText: String,
    acquire: () => Unit,
    getDictionaryWord: () => String,
    getReplacementText: () => String,
    isNegative: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDictionaryEntry = {
    val __obj = js.Dynamic.literal(DictionaryWord = DictionaryWord.asInstanceOf[js.Any], ReplacementText = ReplacementText.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDictionaryWord = js.Any.fromFunction0(getDictionaryWord), getReplacementText = js.Any.fromFunction0(getReplacementText), isNegative = js.Any.fromFunction0(isNegative), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDictionaryEntry]
  }
  @scala.inline
  implicit class XDictionaryEntryOps[Self <: XDictionaryEntry] (val x: Self) extends AnyVal {
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
    def setDictionaryWord(value: String): Self = this.set("DictionaryWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacementText(value: String): Self = this.set("ReplacementText", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDictionaryWord(value: () => String): Self = this.set("getDictionaryWord", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReplacementText(value: () => String): Self = this.set("getReplacementText", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNegative(value: () => Boolean): Self = this.set("isNegative", js.Any.fromFunction0(value))
  }
  
}

