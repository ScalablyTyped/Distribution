package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the type of a personal dictionary.
  *
  * This defines the type of a dictionary. It may be positive or negative. A positive dictionary may hold only positive entries (words defined to be
  * correct for spell checking) and a negative one only negative entries (words defined to be reported as incorrect by the spell checker).
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.linguistic2.XDictionaryEntry
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait DictionaryType extends js.Object

object DictionaryType {
  /** @deprecated Deprecated */
  @scala.inline
  def MIXED: `2` = 2.asInstanceOf[`2`]
  /** all entries in the dictionary are negative. */
  @scala.inline
  def NEGATIVE: `1` = 1.asInstanceOf[`1`]
  /** all entries in the dictionary are positive. */
  @scala.inline
  def POSITIVE: `0` = 0.asInstanceOf[`0`]
}

