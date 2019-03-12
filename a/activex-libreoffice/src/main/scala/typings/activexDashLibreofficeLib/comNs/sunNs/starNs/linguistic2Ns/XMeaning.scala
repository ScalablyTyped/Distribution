package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * one of the possible meanings for a word.
  *
  * Represents one of the possible meanings that may be returned from a {@link com.sun.star.linguistic2.XThesaurus.queryMeanings()} call and allows for
  * retrieval of its synonyms.
  * @see com.sun.star.linguistic2.XThesaurus
  */
trait XMeaning
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the meaning represented by this object. */
  val Meaning: java.lang.String
  /** @returns the meaning represented by this object. */
  def getMeaning(): java.lang.String
  /** @returns a sequence of strings where each entry is a synonym of the current objects meaning. */
  def querySynonyms(): stdLib.SafeArray[java.lang.String]
}

object XMeaning {
  @scala.inline
  def apply(
    Meaning: java.lang.String,
    acquire: () => scala.Unit,
    getMeaning: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    querySynonyms: () => stdLib.SafeArray[java.lang.String],
    release: () => scala.Unit
  ): XMeaning = {
    val __obj = js.Dynamic.literal(Meaning = Meaning, acquire = js.Any.fromFunction0(acquire), getMeaning = js.Any.fromFunction0(getMeaning), queryInterface = js.Any.fromFunction1(queryInterface), querySynonyms = js.Any.fromFunction0(querySynonyms), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMeaning]
  }
}

