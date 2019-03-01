package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this interface does not conform to the SAX-standard.
  *
  * Note: Whether or not every callback is supported is dependent on the parser implementation.
  */
trait XExtendedDocumentHandler extends XDocumentHandler {
  /** informs a writer that it is allowable to insert a line break and indentation before the next XDocumentHandler-call. */
  def allowLineBreak(): scala.Unit
  /** receives notification about a comment in the XML-source. */
  def comment(sComment: java.lang.String): scala.Unit
  /**
    * informs about the end of a CDATA-Section.
    *
    * Note that `startCDATA/endCDATA` MUST NOT enclose any `startElement/endElement` -call!
    */
  def endCDATA(): scala.Unit
  /**
    * receives notification about the start of a CDATA section in the XML-source.
    *
    * Any string coming in via character handler may include chars, that would otherwise be interpreted as markup.
    */
  def startCDATA(): scala.Unit
  /** notifies that any characters that cannot be handled by other callback methods are announced through this method. */
  def unknown(sString: java.lang.String): scala.Unit
}

object XExtendedDocumentHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    allowLineBreak: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    comment: js.Function1[java.lang.String, scala.Unit],
    endCDATA: js.Function0[scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[XLocator, scala.Unit],
    startCDATA: js.Function0[scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[java.lang.String, XAttributeList, scala.Unit],
    unknown: js.Function1[java.lang.String, scala.Unit]
  ): XExtendedDocumentHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("allowLineBreak")(allowLineBreak)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("endCDATA")(endCDATA)
    __obj.updateDynamic("endDocument")(endDocument)
    __obj.updateDynamic("endElement")(endElement)
    __obj.updateDynamic("ignorableWhitespace")(ignorableWhitespace)
    __obj.updateDynamic("processingInstruction")(processingInstruction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDocumentLocator")(setDocumentLocator)
    __obj.updateDynamic("startCDATA")(startCDATA)
    __obj.updateDynamic("startDocument")(startDocument)
    __obj.updateDynamic("startElement")(startElement)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[XExtendedDocumentHandler]
  }
}

