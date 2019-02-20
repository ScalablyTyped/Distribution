package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the mark of a document index entry.
  * @see DocumentIndexMark
  */
trait XDocumentIndexMark extends XTextContent {
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  var MarkEntry: java.lang.String
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  def getMarkEntry(): java.lang.String
  /**
    * sets an explicit string for this index mark to use in the index.
    *
    * If empty, the string of the {@link TextRange} to which the {@link TextContent} refers is used in the index.
    */
  def setMarkEntry(aIndexEntry: java.lang.String): scala.Unit
}

