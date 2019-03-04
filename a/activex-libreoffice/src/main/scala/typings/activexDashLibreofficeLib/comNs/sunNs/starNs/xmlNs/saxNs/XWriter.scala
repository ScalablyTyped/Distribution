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
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = acquire, allowLineBreak = allowLineBreak, characters = characters, comment = comment, endCDATA = endCDATA, endDocument = endDocument, endElement = endElement, getOutputStream = getOutputStream, ignorableWhitespace = ignorableWhitespace, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, setOutputStream = setOutputStream, startCDATA = startCDATA, startDocument = startDocument, startElement = startElement, unknown = unknown)
  
    __obj.asInstanceOf[XWriter]
  }
}

