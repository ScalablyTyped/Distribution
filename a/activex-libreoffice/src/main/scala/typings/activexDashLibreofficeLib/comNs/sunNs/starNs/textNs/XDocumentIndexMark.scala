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

object XDocumentIndexMark {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    MarkEntry: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getMarkEntry: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setMarkEntry: js.Function1[java.lang.String, scala.Unit]
  ): XDocumentIndexMark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, MarkEntry = MarkEntry, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getMarkEntry = getMarkEntry, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setMarkEntry = setMarkEntry)
  
    __obj.asInstanceOf[XDocumentIndexMark]
  }
}

