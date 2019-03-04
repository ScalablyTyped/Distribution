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
  def querySynonyms(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XMeaning {
  @scala.inline
  def apply(
    Meaning: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getMeaning: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    querySynonyms: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    release: js.Function0[scala.Unit]
  ): XMeaning = {
    val __obj = js.Dynamic.literal(Meaning = Meaning, acquire = acquire, getMeaning = getMeaning, queryInterface = queryInterface, querySynonyms = querySynonyms, release = release)
  
    __obj.asInstanceOf[XMeaning]
  }
}

