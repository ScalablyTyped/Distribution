package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interfaces allows to retrieve suggestions for spell checking from a dictionary. */
trait XSearchableDictionary extends XDictionary {
  /**
    * search for similar entries in the dictionary.
    * @param aWord the word to find similar written entries for.
    * @returns the list of similar entries found.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionaryList
    * @since OOo 3.0.1
    */
  def searchSimilarEntries(aWord: java.lang.String): activexDashInteropLib.SafeArray[XDictionaryEntry]
}

