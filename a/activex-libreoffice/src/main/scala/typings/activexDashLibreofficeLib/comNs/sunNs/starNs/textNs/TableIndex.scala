package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of table indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait TableIndex extends BaseIndex {
  /** determines if the name or the label of an object is used to create the index. */
  var CreateFromLabels: scala.Boolean
  /** determines the name of the sequence field that is evaluated to create the index. */
  var LabelCategory: java.lang.String
  /**
    * determines the way the paragraph containing a label is included in the index.
    * @see ReferenceFieldPart allowed constant values: only TEXT, CATEGORY_AND_NUMBER and ONLY_CAPTION
    */
  var LabelDisplayType: scala.Double
}

