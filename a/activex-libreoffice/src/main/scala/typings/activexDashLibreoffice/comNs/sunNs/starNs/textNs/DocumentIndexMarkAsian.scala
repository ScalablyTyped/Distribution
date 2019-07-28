package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . For Asian languages the user can provide an
  * additional string which is used for sorting. If the user does not provide these strings, they are not considered for sorting.
  * @since OOo 1.1.2
  */
trait DocumentIndexMarkAsian extends js.Object {
  /** contains the reading of the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKeyReading: String
  /** contains the reading the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKeyReading: String
  /** contains the reading of the string which has been chosen for the index entry. */
  var TextReading: String
}

object DocumentIndexMarkAsian {
  @scala.inline
  def apply(PrimaryKeyReading: String, SecondaryKeyReading: String, TextReading: String): DocumentIndexMarkAsian = {
    val __obj = js.Dynamic.literal(PrimaryKeyReading = PrimaryKeyReading, SecondaryKeyReading = SecondaryKeyReading, TextReading = TextReading)
  
    __obj.asInstanceOf[DocumentIndexMarkAsian]
  }
}

