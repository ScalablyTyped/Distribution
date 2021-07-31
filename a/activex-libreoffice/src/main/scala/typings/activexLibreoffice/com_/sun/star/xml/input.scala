package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object input {
  
  /**
    * This service helps parsing files by providing a SAX document handler interface for a SAX parsers. You have to instantiate this service passing an
    * {@link XRoot} instance.
    */
  trait SaxDocumentHandler
    extends StObject
       with XDocumentHandler
       with XInitialization
  object SaxDocumentHandler {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      characters: String => Unit,
      endDocument: () => Unit,
      endElement: String => Unit,
      ignorableWhitespace: String => Unit,
      initialize: SeqEquiv[js.Any] => Unit,
      processingInstruction: (String, String) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setDocumentLocator: XLocator => Unit,
      startDocument: () => Unit,
      startElement: (String, XAttributeList) => Unit
    ): SaxDocumentHandler = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), initialize = js.Any.fromFunction1(initialize), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
      __obj.asInstanceOf[SaxDocumentHandler]
    }
  }
  
  /** An element's attributes */
  trait XAttributes
    extends StObject
       with XInterface {
    
    /**
      * Gets the number of attributes.
      * @returns number of attributes
      */
    val Length: Double
    
    /**
      * Gets attribute index passing a QName.
      * @param qName QName
      * @returns attribute index or -1, if not found
      */
    def getIndexByQName(qName: String): Double
    
    /**
      * Gets attribute index passing a namespace uid and a local name.
      * @param uid namespace uid
      * @param localName local name
      * @returns attribute index or -1, if not found
      */
    def getIndexByUidName(uid: Double, localName: String): Double
    
    /**
      * Gets the number of attributes.
      * @returns number of attributes
      */
    def getLength(): Double
    
    /**
      * Gets the local name of an attribute.
      * @param nIndex index
      * @returns local name of attribute or empty string, if invalid index
      */
    def getLocalNameByIndex(nIndex: Double): String
    
    /**
      * Gets the QName of an attribute.
      * @param nIndex index
      * @returns QName of attribute or empty string, if invalid index
      */
    def getQNameByIndex(nIndex: Double): String
    
    /**
      * Gets the type of an attribute, if possible.
      * @param nIndex index
      * @returns type of attribute (if possible, else empty string)
      */
    def getTypeByIndex(nIndex: Double): String
    
    /**
      * Gets the namespace uid of an attribute.
      * @param nIndex index
      * @returns namespace uid of attribute or -1, if invalid index
      */
    def getUidByIndex(nIndex: Double): Double
    
    /**
      * Gets the value of an attribute.
      * @param nIndex index
      * @returns value string or empty string, if invalid index
      */
    def getValueByIndex(nIndex: Double): String
    
    /**
      * For convenience: Gets the value of an attribute passing uid, local name.
      * @param uid namespace uid
      * @param localName local name
      * @returns value string or empty string, if invalid uid/local name
      */
    def getValueByUidName(uid: Double, localName: String): String
  }
  object XAttributes {
    
    @scala.inline
    def apply(
      Length: Double,
      acquire: () => Unit,
      getIndexByQName: String => Double,
      getIndexByUidName: (Double, String) => Double,
      getLength: () => Double,
      getLocalNameByIndex: Double => String,
      getQNameByIndex: Double => String,
      getTypeByIndex: Double => String,
      getUidByIndex: Double => Double,
      getValueByIndex: Double => String,
      getValueByUidName: (Double, String) => String,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XAttributes = {
      val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIndexByQName = js.Any.fromFunction1(getIndexByQName), getIndexByUidName = js.Any.fromFunction2(getIndexByUidName), getLength = js.Any.fromFunction0(getLength), getLocalNameByIndex = js.Any.fromFunction1(getLocalNameByIndex), getQNameByIndex = js.Any.fromFunction1(getQNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getUidByIndex = js.Any.fromFunction1(getUidByIndex), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByUidName = js.Any.fromFunction2(getValueByUidName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XAttributes]
    }
    
    @scala.inline
    implicit class XAttributesMutableBuilder[Self <: XAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndexByQName(value: String => Double): Self = StObject.set(x, "getIndexByQName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIndexByUidName(value: (Double, String) => Double): Self = StObject.set(x, "getIndexByUidName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLocalNameByIndex(value: Double => String): Self = StObject.set(x, "getLocalNameByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetQNameByIndex(value: Double => String): Self = StObject.set(x, "getQNameByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTypeByIndex(value: Double => String): Self = StObject.set(x, "getTypeByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUidByIndex(value: Double => Double): Self = StObject.set(x, "getUidByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueByIndex(value: Double => String): Self = StObject.set(x, "getValueByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueByUidName(value: (Double, String) => String): Self = StObject.set(x, "getValueByUidName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    }
  }
  
  /** Capsule around an XML element. */
  trait XElement
    extends StObject
       with XInterface {
    
    /**
      * Gets the attributes of this element.
      * @returns attributes of this element
      */
    val Attributes: XAttributes
    
    /**
      * Gets the local name of this element.
      * @returns local name of this element
      */
    val LocalName: String
    
    /**
      * Gets the parent context.
      * @returns parent context
      */
    val Parent: XElement
    
    /**
      * Gets the namespace uid of this element.
      * @returns namespace uid of this element
      */
    val Uid: Double
    
    /**
      * Called upon retrieval of characters.
      * @param chars characters
      */
    def characters(chars: String): Unit
    
    /** Receives notification of element closing. */
    def endElement(): Unit
    
    /**
      * Gets the attributes of this element.
      * @returns attributes of this element
      */
    def getAttributes(): XAttributes
    
    /**
      * Gets the local name of this element.
      * @returns local name of this element
      */
    def getLocalName(): String
    
    /**
      * Gets the parent context.
      * @returns parent context
      */
    def getParent(): XElement
    
    /**
      * Gets the namespace uid of this element.
      * @returns namespace uid of this element
      */
    def getUid(): Double
    
    /**
      * Receives notification of white space that can be ignored.
      * @param whitespace white space characters
      */
    def ignorableWhitespace(whitespace: String): Unit
    
    /**
      * Receives notification of a processing instruction.
      * @param target target
      * @param data data
      */
    def processingInstruction(target: String, data: String): Unit
    
    /**
      * Called upon each occurring child element.
      * @param uid namespace uid of element
      * @param localName local name of element
      * @param xAttributes attributes of element
      * @returns child import context
      */
    def startChildElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
  }
  object XElement {
    
    @scala.inline
    def apply(
      Attributes: XAttributes,
      LocalName: String,
      Parent: XElement,
      Uid: Double,
      acquire: () => Unit,
      characters: String => Unit,
      endElement: () => Unit,
      getAttributes: () => XAttributes,
      getLocalName: () => String,
      getParent: () => XElement,
      getUid: () => Double,
      ignorableWhitespace: String => Unit,
      processingInstruction: (String, String) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      startChildElement: (Double, String, XAttributes) => XElement
    ): XElement = {
      val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endElement = js.Any.fromFunction0(endElement), getAttributes = js.Any.fromFunction0(getAttributes), getLocalName = js.Any.fromFunction0(getLocalName), getParent = js.Any.fromFunction0(getParent), getUid = js.Any.fromFunction0(getUid), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startChildElement = js.Any.fromFunction3(startChildElement))
      __obj.asInstanceOf[XElement]
    }
    
    @scala.inline
    implicit class XElementMutableBuilder[Self <: XElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: XAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacters(value: String => Unit): Self = StObject.set(x, "characters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndElement(value: () => Unit): Self = StObject.set(x, "endElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttributes(value: () => XAttributes): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLocalName(value: () => String): Self = StObject.set(x, "getLocalName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => XElement): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUid(value: () => Double): Self = StObject.set(x, "getUid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIgnorableWhitespace(value: String => Unit): Self = StObject.set(x, "ignorableWhitespace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "LocalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: XElement): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingInstruction(value: (String, String) => Unit): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartChildElement(value: (Double, String, XAttributes) => XElement): Self = StObject.set(x, "startChildElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    }
  }
  
  /** Interface to map XML namespace URI strings to ordinals (URI-id, short uid). */
  trait XNamespaceMapping
    extends StObject
       with XInterface {
    
    /**
      * Creates a unique ordinal passing an XML namespace URI.
      * @param uri XML namespace URI
      * @returns uid
      */
    def getUidByUri(uri: String): Double
    
    /**
      * Gets the corresponding XML namespace URI passing a uid (created using {@link getUidByUri()} ).
      * @param uid uid
      * @returns XML namespace URI
      */
    def getUriByUid(uid: Double): String
  }
  object XNamespaceMapping {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      getUidByUri: String => Double,
      getUriByUid: Double => String,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XNamespaceMapping = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUidByUri = js.Any.fromFunction1(getUidByUri), getUriByUid = js.Any.fromFunction1(getUriByUid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XNamespaceMapping]
    }
    
    @scala.inline
    implicit class XNamespaceMappingMutableBuilder[Self <: XNamespaceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUidByUri(value: String => Double): Self = StObject.set(x, "getUidByUri", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUriByUid(value: Double => String): Self = StObject.set(x, "getUriByUid", js.Any.fromFunction1(value))
    }
  }
  
  /** Root interface being passed to {@link SaxDocumentHandler} service upon instantiation. */
  trait XRoot
    extends StObject
       with XInterface {
    
    /** Receives notification of the end of a document. */
    def endDocument(): Unit
    
    /**
      * Receives notification of a processing instruction.
      * @param target target
      * @param data data
      */
    def processingInstruction(target: String, data: String): Unit
    
    /**
      * Receives an object for locating the origin of SAX document events.
      * @param locator locator
      */
    def setDocumentLocator(locator: XLocator): Unit
    
    /**
      * Receives notification of the beginning of a document.
      * @param xMapping mapping to obtain ids out of XML namespace URIs and vice versa
      */
    def startDocument(xMapping: XNamespaceMapping): Unit
    
    /**
      * Called upon root element.
      * @param uid namespace uid of element
      * @param localName local name of element
      * @param xAttributes attributes of element
      */
    def startRootElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
  }
  object XRoot {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      endDocument: () => Unit,
      processingInstruction: (String, String) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setDocumentLocator: XLocator => Unit,
      startDocument: XNamespaceMapping => Unit,
      startRootElement: (Double, String, XAttributes) => XElement
    ): XRoot = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endDocument = js.Any.fromFunction0(endDocument), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction1(startDocument), startRootElement = js.Any.fromFunction3(startRootElement))
      __obj.asInstanceOf[XRoot]
    }
    
    @scala.inline
    implicit class XRootMutableBuilder[Self <: XRoot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDocument(value: () => Unit): Self = StObject.set(x, "endDocument", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProcessingInstruction(value: (String, String) => Unit): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDocumentLocator(value: XLocator => Unit): Self = StObject.set(x, "setDocumentLocator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartDocument(value: XNamespaceMapping => Unit): Self = StObject.set(x, "startDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartRootElement(value: (Double, String, XAttributes) => XElement): Self = StObject.set(x, "startRootElement", js.Any.fromFunction3(value))
    }
  }
}
