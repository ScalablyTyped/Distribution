package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXContentHandler interface */
trait IVBSAXContentHandler extends js.Object {
  @JSName("MSXML2.IVBSAXContentHandler_typekey")
  var MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler
  /** Receive an object for locating the origin of SAX document events. */
  val documentLocator: IVBSAXLocator
  /** Receive notification of character data. */
  def characters(strChars: String): Unit
  /** Receive notification of the end of a document. */
  def endDocument(): Unit
  /** Receive notification of the end of an element. */
  def endElement(strNamespaceURI: String, strLocalName: String, strQName: String): Unit
  /** End the scope of a prefix-URI mapping. */
  def endPrefixMapping(strPrefix: String): Unit
  /** Receive notification of ignorable whitespace in element content. */
  def ignorableWhitespace(strChars: String): Unit
  /** Receive notification of a processing instruction. */
  def processingInstruction(strTarget: String, strData: String): Unit
  /** Receive notification of a skipped entity. */
  def skippedEntity(strName: String): Unit
  /** Receive notification of the beginning of a document. */
  def startDocument(): Unit
  /** Receive notification of the beginning of an element. */
  def startElement(strNamespaceURI: String, strLocalName: String, strQName: String, oAttributes: IVBSAXAttributes): Unit
  /** Begin the scope of a prefix-URI Namespace mapping. */
  def startPrefixMapping(strPrefix: String, strURI: String): Unit
}

object IVBSAXContentHandler {
  @scala.inline
  def apply(
    MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler,
    characters: String => Unit,
    documentLocator: IVBSAXLocator,
    endDocument: () => Unit,
    endElement: (String, String, String) => Unit,
    endPrefixMapping: String => Unit,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    skippedEntity: String => Unit,
    startDocument: () => Unit,
    startElement: (String, String, String, IVBSAXAttributes) => Unit,
    startPrefixMapping: (String, String) => Unit
  ): IVBSAXContentHandler = {
    val __obj = js.Dynamic.literal(characters = js.Any.fromFunction1(characters), documentLocator = documentLocator.asInstanceOf[js.Any], endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction3(endElement), endPrefixMapping = js.Any.fromFunction1(endPrefixMapping), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), skippedEntity = js.Any.fromFunction1(skippedEntity), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction4(startElement), startPrefixMapping = js.Any.fromFunction2(startPrefixMapping))
    __obj.updateDynamic("MSXML2.IVBSAXContentHandler_typekey")(MSXML2DotIVBSAXContentHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXContentHandler]
  }
}

