package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait DictionaryType extends js.Object

object DictionaryType {
  /** @deprecated Deprecated */
  @scala.inline
  def MIXED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** all entries in the dictionary are negative. */
  @scala.inline
  def NEGATIVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** all entries in the dictionary are positive. */
  @scala.inline
  def POSITIVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

