package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXContentHandler interface */
@JSGlobal("MSXML2.IVBSAXContentHandler")
@js.native
class IVBSAXContentHandler protected () extends js.Object {
  var `MSXML2.IVBSAXContentHandler_typekey`: IVBSAXContentHandler = js.native
  /** Receive an object for locating the origin of SAX document events. */
  val documentLocator: IVBSAXLocator = js.native
  /** Receive notification of character data. */
  def characters(strChars: java.lang.String): scala.Unit = js.native
  /** Receive notification of the end of a document. */
  def endDocument(): scala.Unit = js.native
  /** Receive notification of the end of an element. */
  def endElement(strNamespaceURI: java.lang.String, strLocalName: java.lang.String, strQName: java.lang.String): scala.Unit = js.native
  /** End the scope of a prefix-URI mapping. */
  def endPrefixMapping(strPrefix: java.lang.String): scala.Unit = js.native
  /** Receive notification of ignorable whitespace in element content. */
  def ignorableWhitespace(strChars: java.lang.String): scala.Unit = js.native
  /** Receive notification of a processing instruction. */
  def processingInstruction(strTarget: java.lang.String, strData: java.lang.String): scala.Unit = js.native
  /** Receive notification of a skipped entity. */
  def skippedEntity(strName: java.lang.String): scala.Unit = js.native
  /** Receive notification of the beginning of a document. */
  def startDocument(): scala.Unit = js.native
  /** Receive notification of the beginning of an element. */
  def startElement(
    strNamespaceURI: java.lang.String,
    strLocalName: java.lang.String,
    strQName: java.lang.String,
    oAttributes: IVBSAXAttributes
  ): scala.Unit = js.native
  /** Begin the scope of a prefix-URI Namespace mapping. */
  def startPrefixMapping(strPrefix: java.lang.String, strURI: java.lang.String): scala.Unit = js.native
}

