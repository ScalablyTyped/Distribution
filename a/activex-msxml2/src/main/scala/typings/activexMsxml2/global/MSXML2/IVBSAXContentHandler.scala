package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXContentHandler interface */
@JSGlobal("MSXML2.IVBSAXContentHandler")
@js.native
class IVBSAXContentHandler protected ()
  extends typings.activexMsxml2.MSXML2.IVBSAXContentHandler {
  /* CompleteClass */
  @JSName("MSXML2.IVBSAXContentHandler_typekey")
  override var MSXML2DotIVBSAXContentHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXContentHandler = js.native
  /** Receive an object for locating the origin of SAX document events. */
  /* CompleteClass */
  override val documentLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator = js.native
  /** Receive notification of character data. */
  /* CompleteClass */
  override def characters(strChars: String): Unit = js.native
  /** Receive notification of the end of a document. */
  /* CompleteClass */
  override def endDocument(): Unit = js.native
  /** Receive notification of the end of an element. */
  /* CompleteClass */
  override def endElement(strNamespaceURI: String, strLocalName: String, strQName: String): Unit = js.native
  /** End the scope of a prefix-URI mapping. */
  /* CompleteClass */
  override def endPrefixMapping(strPrefix: String): Unit = js.native
  /** Receive notification of ignorable whitespace in element content. */
  /* CompleteClass */
  override def ignorableWhitespace(strChars: String): Unit = js.native
  /** Receive notification of a processing instruction. */
  /* CompleteClass */
  override def processingInstruction(strTarget: String, strData: String): Unit = js.native
  /** Receive notification of a skipped entity. */
  /* CompleteClass */
  override def skippedEntity(strName: String): Unit = js.native
  /** Receive notification of the beginning of a document. */
  /* CompleteClass */
  override def startDocument(): Unit = js.native
  /** Receive notification of the beginning of an element. */
  /* CompleteClass */
  override def startElement(
    strNamespaceURI: String,
    strLocalName: String,
    strQName: String,
    oAttributes: typings.activexMsxml2.MSXML2.IVBSAXAttributes
  ): Unit = js.native
  /** Begin the scope of a prefix-URI Namespace mapping. */
  /* CompleteClass */
  override def startPrefixMapping(strPrefix: String, strURI: String): Unit = js.native
}

