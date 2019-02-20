package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait DocumentIndex extends BaseIndex {
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: activexDashInteropLib.SafeArray[XDocumentIndexMark]
  /** determines if the similarity of index entries is checked case sensitively. */
  var IsCaseSensitive: scala.Boolean
  /** contains the locale of the index. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** determines the name of the character style that is applied to the number of a page where main index entry is located. */
  var MainEntryCharacterStyleName: java.lang.String
  /** contains the name of the sort algorithm that is used to sort the entries. */
  var SortAlgorithm: java.lang.String
  /** determines if alphabetical separators are generated. */
  var UseAlphabeticalSeparators: scala.Boolean
  /** determines if same entries on different pages are combined into one index entry. */
  var UseCombinedEntries: scala.Boolean
  /** determines if following page numbers are displayed using a dash. */
  var UseDash: scala.Boolean
  /** determines if a index entry is generated for each primary/secondary key. */
  var UseKeyAsEntry: scala.Boolean
  /** determines if following page numbers are displayed using a "pp.". */
  var UsePP: scala.Boolean
  /** determines if all entries start with a capital letter. */
  var UseUpperCase: scala.Boolean
}

