package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait ContentIndex extends BaseIndex {
  /** contains `TRUE` if the document index marks are included in this index. */
  var CreateFromMarks: scala.Boolean
  /** determines if the document index is created from outlines. */
  var CreateFromOutline: scala.Boolean
  /** determines the depth of outline levels that are included into the content index. */
  var Level: scala.Double
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
}

