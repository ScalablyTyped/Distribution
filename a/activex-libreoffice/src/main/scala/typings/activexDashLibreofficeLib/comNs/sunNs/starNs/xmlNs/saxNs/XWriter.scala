package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style {@link Writer} service to implement.
  * @since LibreOffice 4.0
  */
trait XWriter
  extends XExtendedDocumentHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XActiveDataSource

object XWriter {
  @scala.inline
  def apply(
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    acquire: js.Function0[scala.Unit],
    allowLineBreak: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    comment: js.Function1[java.lang.String, scala.Unit],
    endCDATA: js.Function0[scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    getOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[XLocator, scala.Unit],
    setOutputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, scala.Unit],
    startCDATA: js.Function0[scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[java.lang.String, XAttributeList, scala.Unit],
    unknown: js.Function1[java.lang.String, scala.Unit]
  ): XWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OutputStream")(OutputStream)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("allowLineBreak")(allowLineBreak)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("endCDATA")(endCDATA)
    __obj.updateDynamic("endDocument")(endDocument)
    __obj.updateDynamic("endElement")(endElement)
    __obj.updateDynamic("getOutputStream")(getOutputStream)
    __obj.updateDynamic("ignorableWhitespace")(ignorableWhitespace)
    __obj.updateDynamic("processingInstruction")(processingInstruction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDocumentLocator")(setDocumentLocator)
    __obj.updateDynamic("setOutputStream")(setOutputStream)
    __obj.updateDynamic("startCDATA")(startCDATA)
    __obj.updateDynamic("startDocument")(startDocument)
    __obj.updateDynamic("startElement")(startElement)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[XWriter]
  }
}

