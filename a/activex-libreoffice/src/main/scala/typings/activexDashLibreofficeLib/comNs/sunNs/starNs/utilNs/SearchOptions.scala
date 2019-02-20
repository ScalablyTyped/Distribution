package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /** The locale for case insensitive search. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** search type */
  var algorithmType: SearchAlgorithms
  /** This many characters can be different (as a replacement) between the found word and the search pattern in a "Weighted Levenshtein; Distance" search. */
  var changedChars: scala.Double
  /** This many characters can be missing in the found word in a "Weighted Levenshtein Distance" search. */
  var deletedChars: scala.Double
  /** This many characters can be additional in the found word in a "Weighted Levenshtein Distance" search. */
  var insertedChars: scala.Double
  /** The replacement text (is for optional replacing - SearchOption is only the data container for it) */
  var replaceString: java.lang.String
  /**
    * some flags - can be mixed
    * @see SearchFlags
    */
  var searchFlag: scala.Double
  /** The text or pattern to be searched. */
  var searchString: java.lang.String
  /** Flags for the transliteration. Same meaning as the enum of {@link com.sun.star.i18n.TransliterationModules} */
  var transliterateFlags: scala.Double
}

