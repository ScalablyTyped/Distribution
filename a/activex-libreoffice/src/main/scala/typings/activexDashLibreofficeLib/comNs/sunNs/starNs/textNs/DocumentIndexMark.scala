package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . */
trait DocumentIndexMark extends BaseIndexMark {
  /** determines if this entry is a main entry. In a document index this entry will be emphasized by assigning a character style to it. */
  var IsMainEntry: scala.Boolean
  /** contains the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKey: java.lang.String
  /** contains the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKey: java.lang.String
}

