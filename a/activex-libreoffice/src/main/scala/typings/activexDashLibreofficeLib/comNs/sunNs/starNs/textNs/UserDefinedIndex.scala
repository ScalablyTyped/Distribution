package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of user defined indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait UserDefinedIndex extends BaseIndex {
  /** determines if embedded objects are included in the index. */
  var CreateFromEmbeddedObjects: scala.Boolean
  /** determines if graphic objects are included in the index. */
  var CreateFromGraphicObjects: scala.Boolean
  /** determines if the document index marks are included in this index. */
  var CreateFromMarks: scala.Boolean
  /** determines if tables are included in the index. */
  var CreateFromTables: scala.Boolean
  /** determines if text frames are included in the index. */
  var CreateFromTextFrames: scala.Boolean
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: activexDashInteropLib.SafeArray[XDocumentIndexMark]
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** determines if the outline level of the location of the indexed object is used as index level of the index entry. */
  var UseLevelFromSource: scala.Boolean
}

