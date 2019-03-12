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
    acquire: () => scala.Unit,
    allowLineBreak: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    comment: java.lang.String => scala.Unit,
    endCDATA: () => scala.Unit,
    endDocument: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    ignorableWhitespace: java.lang.String => scala.Unit,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDocumentLocator: XLocator => scala.Unit,
    startCDATA: () => scala.Unit,
    startDocument: () => scala.Unit,
    startElement: (java.lang.String, XAttributeList) => scala.Unit,
    unknown: java.lang.String => scala.Unit
  ): XExtendedDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allowLineBreak = js.Any.fromFunction0(allowLineBreak), characters = js.Any.fromFunction1(characters), comment = js.Any.fromFunction1(comment), endCDATA = js.Any.fromFunction0(endCDATA), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startCDATA = js.Any.fromFunction0(startCDATA), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement), unknown = js.Any.fromFunction1(unknown))
  
    __obj.asInstanceOf[XExtendedDocumentHandler]
  }
}

