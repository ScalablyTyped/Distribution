package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
trait XDictionaryEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the word defining this entry. */
  val DictionaryWord: java.lang.String
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  val ReplacementText: java.lang.String
  /** @returns the word defining this entry. */
  def getDictionaryWord(): java.lang.String
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  def getReplacementText(): java.lang.String
  /** @returns `TRUE` if the word (entry) is a negative one and should not be used, `FALSE` otherwise. */
  def isNegative(): scala.Boolean
}

