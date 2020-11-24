package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXContentHandler interface */
@js.native
trait IVBSAXContentHandler extends js.Object {
  
  @JSName("MSXML2.IVBSAXContentHandler_typekey")
  var MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler = js.native
  
  /** Receive notification of character data. */
  def characters(strChars: String): Unit = js.native
  
  /** Receive an object for locating the origin of SAX document events. */
  val documentLocator: IVBSAXLocator = js.native
  
  /** Receive notification of the end of a document. */
  def endDocument(): Unit = js.native
  
  /** Receive notification of the end of an element. */
  def endElement(strNamespaceURI: String, strLocalName: String, strQName: String): Unit = js.native
  
  /** End the scope of a prefix-URI mapping. */
  def endPrefixMapping(strPrefix: String): Unit = js.native
  
  /** Receive notification of ignorable whitespace in element content. */
  def ignorableWhitespace(strChars: String): Unit = js.native
  
  /** Receive notification of a processing instruction. */
  def processingInstruction(strTarget: String, strData: String): Unit = js.native
  
  /** Receive notification of a skipped entity. */
  def skippedEntity(strName: String): Unit = js.native
  
  /** Receive notification of the beginning of a document. */
  def startDocument(): Unit = js.native
  
  /** Receive notification of the beginning of an element. */
  def startElement(strNamespaceURI: String, strLocalName: String, strQName: String, oAttributes: IVBSAXAttributes): Unit = js.native
  
  /** Begin the scope of a prefix-URI Namespace mapping. */
  def startPrefixMapping(strPrefix: String, strURI: String): Unit = js.native
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
  
  @scala.inline
  implicit class IVBSAXContentHandlerOps[Self <: IVBSAXContentHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSXML2DotIVBSAXContentHandler_typekey(value: IVBSAXContentHandler): Self = this.set("MSXML2.IVBSAXContentHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacters(value: String => Unit): Self = this.set("characters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDocumentLocator(value: IVBSAXLocator): Self = this.set("documentLocator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDocument(value: () => Unit): Self = this.set("endDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndElement(value: (String, String, String) => Unit): Self = this.set("endElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndPrefixMapping(value: String => Unit): Self = this.set("endPrefixMapping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnorableWhitespace(value: String => Unit): Self = this.set("ignorableWhitespace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessingInstruction(value: (String, String) => Unit): Self = this.set("processingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkippedEntity(value: String => Unit): Self = this.set("skippedEntity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDocument(value: () => Unit): Self = this.set("startDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartElement(value: (String, String, String, IVBSAXAttributes) => Unit): Self = this.set("startElement", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStartPrefixMapping(value: (String, String) => Unit): Self = this.set("startPrefixMapping", js.Any.fromFunction2(value))
  }
}
