package typings.activexMsxml2

import typings.activexMsxml2.MSXML2.DOMNodeType
import typings.activexMsxml2.MSXML2.ISchemaItemCollection
import typings.activexMsxml2.MSXML2.ISchemaStringCollection
import typings.activexMsxml2.MSXML2.IXMLDOMNamedNodeMap
import typings.activexMsxml2.MSXML2.IXMLDOMNodeList
import typings.activexMsxml2.MSXML2.IXMLDOMSchemaCollection
import typings.activexMsxml2.MSXML2.SOMITEMTYPE
import typings.activexMsxml2.MSXML2.XHR_PROPERTY
import typings.activexMsxml2.MSXML2.tagXHRCOOKIE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MSXML2 {
    
    /** W3C-DOM XML Document 6.0 (Apartment) */
    @JSGlobal("MSXML2.DOMDocument60")
    @js.native
    /* private */ class DOMDocument60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.DOMDocument60
    
    /** W3C-DOM XML Document 6.0 (Free threaded) */
    @JSGlobal("MSXML2.FreeThreadedDOMDocument60")
    @js.native
    /* private */ class FreeThreadedDOMDocument60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.FreeThreadedDOMDocument60 {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.FreeThreadedDOMDocument60_typekey")
      var MSXML2DotFreeThreadedDOMDocument60_typekey: typings.activexMsxml2.MSXML2.FreeThreadedDOMDocument60 = js.native
      
      /** abort an asynchronous download */
      /* CompleteClass */
      override def abort(): Unit = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** flag for asynchronous download */
      /* CompleteClass */
      var async: Boolean = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** create an attribute node */
      /* CompleteClass */
      override def createAttribute(name: String): typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** create a CDATA section node */
      /* CompleteClass */
      override def createCDATASection(data: String): typings.activexMsxml2.MSXML2.IXMLDOMCDATASection = js.native
      
      /** create a comment node */
      /* CompleteClass */
      override def createComment(data: String): typings.activexMsxml2.MSXML2.IXMLDOMComment = js.native
      
      /** create a DocumentFragment node */
      /* CompleteClass */
      override def createDocumentFragment(): typings.activexMsxml2.MSXML2.IXMLDOMDocumentFragment = js.native
      
      /** create an Element node */
      /* CompleteClass */
      override def createElement(tagName: String): typings.activexMsxml2.MSXML2.IXMLDOMElement = js.native
      
      /** create an entity reference node */
      /* CompleteClass */
      override def createEntityReference(name: String): typings.activexMsxml2.MSXML2.IXMLDOMEntityReference = js.native
      
      /** create a node of the specified node type and name */
      /* CompleteClass */
      override def createNode(`type`: js.Any, name: String, namespaceURI: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** create a processing instruction node */
      /* CompleteClass */
      override def createProcessingInstruction(target: String, data: String): typings.activexMsxml2.MSXML2.IXMLDOMProcessingInstruction = js.native
      
      /** create a text node */
      /* CompleteClass */
      override def createTextNode(data: String): typings.activexMsxml2.MSXML2.IXMLDOMText = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** node corresponding to the DOCTYPE */
      /* CompleteClass */
      override val doctype: typings.activexMsxml2.MSXML2.IXMLDOMDocumentType = js.native
      
      /** the root of the tree */
      /* CompleteClass */
      var documentElement: typings.activexMsxml2.MSXML2.IXMLDOMElement = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** build a list of elements by name */
      /* CompleteClass */
      override def getElementsByTagName(tagName: String): IXMLDOMNodeList = js.native
      
      /** get the value of the named property */
      /* CompleteClass */
      override def getProperty(name: String): js.Any = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** info on this DOM implementation */
      /* CompleteClass */
      override val implementation: typings.activexMsxml2.MSXML2.IXMLDOMImplementation = js.native
      
      /** clone node such that clones ownerDocument is this document */
      /* CompleteClass */
      override def importNode(node: typings.activexMsxml2.MSXML2.IXMLDOMNode, deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** load document from the specified XML source */
      /* CompleteClass */
      override def load(xmlSource: js.Any): Boolean = js.native
      
      /** load the document from a string */
      /* CompleteClass */
      override def loadXML(bstrXML: String): Boolean = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** Get namespaceURI for schema by index */
      /** A collection of all namespaces for this document */
      /* CompleteClass */
      override def namespaces(index: Double): String = js.native
      /** A collection of all namespaces for this document */
      /* CompleteClass */
      @JSName("namespaces")
      override val namespaces_Original: IXMLDOMSchemaCollection = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** retrieve node from it's ID */
      /* CompleteClass */
      override def nodeFromID(idString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** register an ondataavailable event handler */
      /* CompleteClass */
      override val ondataavailable: js.Any = js.native
      
      /** register a readystatechange event handler */
      /* CompleteClass */
      override val onreadystatechange: js.Any = js.native
      
      /** register an ontransformnode event handler */
      /* CompleteClass */
      override val ontransformnode: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** get the last parser error */
      /* CompleteClass */
      override val parseError: typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** indicates whether the parser preserves whitespace */
      /* CompleteClass */
      var preserveWhiteSpace: Boolean = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** get the state of the XML document */
      /* CompleteClass */
      override val readyState: Double = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether the parser resolves references to external DTD/Entities/Schema */
      /* CompleteClass */
      var resolveExternals: Boolean = js.native
      
      /** save the document to a specified destination */
      /* CompleteClass */
      override def save(destination: js.Any): Unit = js.native
      
      /** The associated schema cache */
      /* CompleteClass */
      var schemas: js.Any = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** set the value of the named property */
      /* CompleteClass */
      override def setProperty(name: String, value: js.Any): Unit = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** get the URL for the loaded XML document */
      /* CompleteClass */
      override val url: String = js.native
      
      /** perform runtime validation on the currently loaded XML document */
      /* CompleteClass */
      override def validate(): typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
      
      /** perform runtime validation on the currently loaded XML document node */
      /* CompleteClass */
      override def validateNode(node: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
      
      /** indicates whether the parser performs validation */
      /* CompleteClass */
      var validateOnParse: Boolean = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    /** Free Threaded XML HTTP Request class 6.0 */
    @JSGlobal("MSXML2.FreeThreadedXMLHTTP60")
    @js.native
    /* private */ class FreeThreadedXMLHTTP60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60 {
      
      /* CompleteClass */
      override def GetCookie(pwszUrl: String, pwszName: String, dwFlags: Double, pcCookies: Double, ppCookies: tagXHRCOOKIE): Unit = js.native
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.FreeThreadedXMLHTTP60_typekey")
      var MSXML2DotFreeThreadedXMLHTTP60_typekey: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60 = js.native
      
      /* CompleteClass */
      override def SetCookie(pCookie: tagXHRCOOKIE, pdwCookieState: Double): Unit = js.native
      
      /* CompleteClass */
      override def SetCustomResponseStream(pSequentialStream: typings.activexMsxml2.MSXML2.ISequentialStream): Unit = js.native
      
      /* CompleteClass */
      override def abort(): Unit = js.native
      
      /* CompleteClass */
      override def getAllResponseHeaders(ppwszHeaders: String): Unit = js.native
      
      /* CompleteClass */
      override def getResponseHeader(pwszHeader: String, ppwszValue: String): Unit = js.native
      
      /* CompleteClass */
      override def open(
        pwszMethod: String,
        pwszUrl: String,
        pStatusCallback: typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback,
        pwszUserName: String,
        pwszPassword: String,
        pwszProxyUserName: String,
        pwszProxyPassword: String
      ): Unit = js.native
      
      /* CompleteClass */
      override def send(pBody: typings.activexMsxml2.MSXML2.ISequentialStream, cbBody: Double): Unit = js.native
      
      /* CompleteClass */
      override def setProperty(eProperty: XHR_PROPERTY, ullValue: Double): Unit = js.native
      
      /* CompleteClass */
      override def setRequestHeader(pwszHeader: String, pwszValue: String): Unit = js.native
    }
    
    /** XML Schema */
    @JSGlobal("MSXML2.ISchema")
    @js.native
    /* private */ class ISchema ()
      extends StObject
         with typings.activexMsxml2.MSXML2.ISchema {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.ISchema_typekey")
      var MSXML2DotISchema_typekey: typings.activexMsxml2.MSXML2.ISchema = js.native
      
      /* CompleteClass */
      override def attributeGroups(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("attributeGroups")
      override val attributeGroups_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override def elements(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("elements")
      override val elements_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override val id: String = js.native
      
      /* CompleteClass */
      override val itemType: SOMITEMTYPE = js.native
      
      /* CompleteClass */
      override def modelGroups(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("modelGroups")
      override val modelGroups_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override val name: String = js.native
      
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /* CompleteClass */
      override def notations(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("notations")
      override val notations_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override val schema: typings.activexMsxml2.MSXML2.ISchema = js.native
      
      /* CompleteClass */
      override def schemaLocations(index: Double): String = js.native
      /* CompleteClass */
      @JSName("schemaLocations")
      override val schemaLocations_Original: ISchemaStringCollection = js.native
      
      /* CompleteClass */
      override val targetNamespace: String = js.native
      
      /* CompleteClass */
      override def types(index: Double): typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      /* CompleteClass */
      @JSName("types")
      override val types_Original: ISchemaItemCollection = js.native
      
      /* CompleteClass */
      override val unhandledAttributes: typings.activexMsxml2.MSXML2.IVBSAXAttributes = js.native
      
      /* CompleteClass */
      override val version: String = js.native
      
      /* CompleteClass */
      override def writeAnnotation(annotationSink: js.Any): Boolean = js.native
    }
    
    /** XML Schema Item */
    @JSGlobal("MSXML2.ISchemaItem")
    @js.native
    /* private */ class ISchemaItem ()
      extends StObject
         with typings.activexMsxml2.MSXML2.ISchemaItem {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.ISchemaItem_typekey")
      var MSXML2DotISchemaItem_typekey: typings.activexMsxml2.MSXML2.ISchemaItem = js.native
      
      /* CompleteClass */
      override val id: String = js.native
      
      /* CompleteClass */
      override val itemType: SOMITEMTYPE = js.native
      
      /* CompleteClass */
      override val name: String = js.native
      
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /* CompleteClass */
      override val schema: typings.activexMsxml2.MSXML2.ISchema = js.native
      
      /* CompleteClass */
      override val unhandledAttributes: typings.activexMsxml2.MSXML2.IVBSAXAttributes = js.native
      
      /* CompleteClass */
      override def writeAnnotation(annotationSink: js.Any): Boolean = js.native
    }
    
    @JSGlobal("MSXML2.ISequentialStream")
    @js.native
    /* private */ class ISequentialStream ()
      extends StObject
         with typings.activexMsxml2.MSXML2.ISequentialStream {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.ISequentialStream_typekey")
      var MSXML2DotISequentialStream_typekey: typings.activexMsxml2.MSXML2.ISequentialStream = js.native
      
      /* CompleteClass */
      override def RemoteRead(pv: Double, cb: Double, pcbRead: Double): Unit = js.native
      
      /* CompleteClass */
      override def RemoteWrite(pv: Double, cb: Double, pcbWritten: Double): Unit = js.native
    }
    
    /** IVBSAXAttributes interface */
    @JSGlobal("MSXML2.IVBSAXAttributes")
    @js.native
    /* private */ class IVBSAXAttributes ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXAttributes {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXAttributes_typekey")
      var MSXML2DotIVBSAXAttributes_typekey: typings.activexMsxml2.MSXML2.IVBSAXAttributes = js.native
      
      /** Look up the index of an attribute by Namespace name. */
      /* CompleteClass */
      override def getIndexFromName(strURI: String, strLocalName: String): Double = js.native
      
      /** Look up the index of an attribute by XML 1.0 qualified name. */
      /* CompleteClass */
      override def getIndexFromQName(strQName: String): Double = js.native
      
      /** Look up an attribute's local name by index. */
      /* CompleteClass */
      override def getLocalName(nIndex: Double): String = js.native
      
      /** Look up an attribute's XML 1.0 qualified name by index. */
      /* CompleteClass */
      override def getQName(nIndex: Double): String = js.native
      
      /** Look up an attribute's type by index. */
      /* CompleteClass */
      override def getType(nIndex: Double): String = js.native
      
      /** Look up an attribute's type by Namespace name. */
      /* CompleteClass */
      override def getTypeFromName(strURI: String, strLocalName: String): String = js.native
      
      /** Look up an attribute's type by XML 1.0 qualified name. */
      /* CompleteClass */
      override def getTypeFromQName(strQName: String): String = js.native
      
      /** Look up an attribute's Namespace URI by index. */
      /* CompleteClass */
      override def getURI(nIndex: Double): String = js.native
      
      /** Look up an attribute's value by index. */
      /* CompleteClass */
      override def getValue(nIndex: Double): String = js.native
      
      /** Look up an attribute's value by Namespace name. */
      /* CompleteClass */
      override def getValueFromName(strURI: String, strLocalName: String): String = js.native
      
      /** Look up an attribute's value by XML 1.0 qualified name. */
      /* CompleteClass */
      override def getValueFromQName(strQName: String): String = js.native
      
      /** Get the number of attributes in the list. */
      /* CompleteClass */
      override val length: Double = js.native
    }
    
    /** IVBSAXContentHandler interface */
    @JSGlobal("MSXML2.IVBSAXContentHandler")
    @js.native
    /* private */ class IVBSAXContentHandler ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXContentHandler {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXContentHandler_typekey")
      var MSXML2DotIVBSAXContentHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXContentHandler = js.native
      
      /** Receive notification of character data. */
      /* CompleteClass */
      override def characters(strChars: String): Unit = js.native
      
      /** Receive an object for locating the origin of SAX document events. */
      /* CompleteClass */
      override val documentLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator = js.native
      
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
    
    /** IVBSAXDTDHandler interface */
    @JSGlobal("MSXML2.IVBSAXDTDHandler")
    @js.native
    /* private */ class IVBSAXDTDHandler ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXDTDHandler {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXDTDHandler_typekey")
      var MSXML2DotIVBSAXDTDHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXDTDHandler = js.native
      
      /** Receive notification of a notation declaration event. */
      /* CompleteClass */
      override def notationDecl(strName: String, strPublicId: String, strSystemId: String): Unit = js.native
      
      /** Receive notification of an unparsed entity declaration event. */
      /* CompleteClass */
      override def unparsedEntityDecl(strName: String, strPublicId: String, strSystemId: String, strNotationName: String): Unit = js.native
    }
    
    /** IVBSAXEntityResolver interface */
    @JSGlobal("MSXML2.IVBSAXEntityResolver")
    @js.native
    /* private */ class IVBSAXEntityResolver ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXEntityResolver {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXEntityResolver_typekey")
      var MSXML2DotIVBSAXEntityResolver_typekey: typings.activexMsxml2.MSXML2.IVBSAXEntityResolver = js.native
      
      /** Allow the application to resolve external entities. */
      /* CompleteClass */
      override def resolveEntity(strPublicId: String, strSystemId: String): js.Any = js.native
    }
    
    /** IVBSAXErrorHandler interface */
    @JSGlobal("MSXML2.IVBSAXErrorHandler")
    @js.native
    /* private */ class IVBSAXErrorHandler ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXErrorHandler {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXErrorHandler_typekey")
      var MSXML2DotIVBSAXErrorHandler_typekey: typings.activexMsxml2.MSXML2.IVBSAXErrorHandler = js.native
      
      /** Receive notification of a recoverable error. */
      /* CompleteClass */
      override def error(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
      
      /** Receive notification of a non-recoverable error. */
      /* CompleteClass */
      override def fatalError(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
      
      /** Receive notification of an ignorable warning. */
      /* CompleteClass */
      override def ignorableWarning(oLocator: typings.activexMsxml2.MSXML2.IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
    }
    
    /** IVBSAXLocator interface */
    @JSGlobal("MSXML2.IVBSAXLocator")
    @js.native
    /* private */ class IVBSAXLocator ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IVBSAXLocator {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IVBSAXLocator_typekey")
      var MSXML2DotIVBSAXLocator_typekey: typings.activexMsxml2.MSXML2.IVBSAXLocator = js.native
      
      /** Get the column number where the current document event ends. */
      /* CompleteClass */
      override val columnNumber: Double = js.native
      
      /** Get the line number where the current document event ends. */
      /* CompleteClass */
      override val lineNumber: Double = js.native
      
      /** Get the public identifier for the current document event. */
      /* CompleteClass */
      override val publicId: String = js.native
      
      /** Get the system identifier for the current document event. */
      /* CompleteClass */
      override val systemId: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMAttribute")
    @js.native
    /* private */ class IXMLDOMAttribute ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMAttribute {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMAttribute_typekey")
      var MSXML2DotIXMLDOMAttribute_typekey: typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** get name of the attribute */
      /* CompleteClass */
      override val name: String = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** string value of the attribute */
      /* CompleteClass */
      var value: js.Any = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMCDATASection")
    @js.native
    /* private */ class IXMLDOMCDATASection ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMCDATASection {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMCDATASection_typekey")
      var MSXML2DotIXMLDOMCDATASection_typekey: typings.activexMsxml2.MSXML2.IXMLDOMCDATASection = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** append string to value */
      /* CompleteClass */
      override def appendData(data: String): Unit = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** value of the node */
      /* CompleteClass */
      var data: String = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** delete string within the value */
      /* CompleteClass */
      override def deleteData(offset: Double, count: Double): Unit = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** insert string into value */
      /* CompleteClass */
      override def insertData(offset: Double, data: String): Unit = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** number of characters in value */
      /* CompleteClass */
      override val length: Double = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace string within the value */
      /* CompleteClass */
      override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** split the text node into two text nodes at the position specified */
      /* CompleteClass */
      override def splitText(offset: Double): typings.activexMsxml2.MSXML2.IXMLDOMText = js.native
      
      /** retrieve substring of value */
      /* CompleteClass */
      override def substringData(offset: Double, count: Double): String = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMComment")
    @js.native
    /* private */ class IXMLDOMComment ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMComment {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMComment_typekey")
      var MSXML2DotIXMLDOMComment_typekey: typings.activexMsxml2.MSXML2.IXMLDOMComment = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** append string to value */
      /* CompleteClass */
      override def appendData(data: String): Unit = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** value of the node */
      /* CompleteClass */
      var data: String = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** delete string within the value */
      /* CompleteClass */
      override def deleteData(offset: Double, count: Double): Unit = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** insert string into value */
      /* CompleteClass */
      override def insertData(offset: Double, data: String): Unit = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** number of characters in value */
      /* CompleteClass */
      override val length: Double = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace string within the value */
      /* CompleteClass */
      override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** retrieve substring of value */
      /* CompleteClass */
      override def substringData(offset: Double, count: Double): String = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMDocument")
    @js.native
    /* private */ class IXMLDOMDocument ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMDocument {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMDocument_typekey")
      var MSXML2DotIXMLDOMDocument_typekey: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** abort an asynchronous download */
      /* CompleteClass */
      override def abort(): Unit = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** flag for asynchronous download */
      /* CompleteClass */
      var async: Boolean = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** create an attribute node */
      /* CompleteClass */
      override def createAttribute(name: String): typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** create a CDATA section node */
      /* CompleteClass */
      override def createCDATASection(data: String): typings.activexMsxml2.MSXML2.IXMLDOMCDATASection = js.native
      
      /** create a comment node */
      /* CompleteClass */
      override def createComment(data: String): typings.activexMsxml2.MSXML2.IXMLDOMComment = js.native
      
      /** create a DocumentFragment node */
      /* CompleteClass */
      override def createDocumentFragment(): typings.activexMsxml2.MSXML2.IXMLDOMDocumentFragment = js.native
      
      /** create an Element node */
      /* CompleteClass */
      override def createElement(tagName: String): typings.activexMsxml2.MSXML2.IXMLDOMElement = js.native
      
      /** create an entity reference node */
      /* CompleteClass */
      override def createEntityReference(name: String): typings.activexMsxml2.MSXML2.IXMLDOMEntityReference = js.native
      
      /** create a node of the specified node type and name */
      /* CompleteClass */
      override def createNode(`type`: js.Any, name: String, namespaceURI: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** create a processing instruction node */
      /* CompleteClass */
      override def createProcessingInstruction(target: String, data: String): typings.activexMsxml2.MSXML2.IXMLDOMProcessingInstruction = js.native
      
      /** create a text node */
      /* CompleteClass */
      override def createTextNode(data: String): typings.activexMsxml2.MSXML2.IXMLDOMText = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** node corresponding to the DOCTYPE */
      /* CompleteClass */
      override val doctype: typings.activexMsxml2.MSXML2.IXMLDOMDocumentType = js.native
      
      /** the root of the tree */
      /* CompleteClass */
      var documentElement: typings.activexMsxml2.MSXML2.IXMLDOMElement = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** build a list of elements by name */
      /* CompleteClass */
      override def getElementsByTagName(tagName: String): IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** info on this DOM implementation */
      /* CompleteClass */
      override val implementation: typings.activexMsxml2.MSXML2.IXMLDOMImplementation = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** load document from the specified XML source */
      /* CompleteClass */
      override def load(xmlSource: js.Any): Boolean = js.native
      
      /** load the document from a string */
      /* CompleteClass */
      override def loadXML(bstrXML: String): Boolean = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** retrieve node from it's ID */
      /* CompleteClass */
      override def nodeFromID(idString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** register an ondataavailable event handler */
      /* CompleteClass */
      override val ondataavailable: js.Any = js.native
      
      /** register a readystatechange event handler */
      /* CompleteClass */
      override val onreadystatechange: js.Any = js.native
      
      /** register an ontransformnode event handler */
      /* CompleteClass */
      override val ontransformnode: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** get the last parser error */
      /* CompleteClass */
      override val parseError: typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** indicates whether the parser preserves whitespace */
      /* CompleteClass */
      var preserveWhiteSpace: Boolean = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** get the state of the XML document */
      /* CompleteClass */
      override val readyState: Double = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether the parser resolves references to external DTD/Entities/Schema */
      /* CompleteClass */
      var resolveExternals: Boolean = js.native
      
      /** save the document to a specified destination */
      /* CompleteClass */
      override def save(destination: js.Any): Unit = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** get the URL for the loaded XML document */
      /* CompleteClass */
      override val url: String = js.native
      
      /** indicates whether the parser performs validation */
      /* CompleteClass */
      var validateOnParse: Boolean = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMDocumentFragment")
    @js.native
    /* private */ class IXMLDOMDocumentFragment ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMDocumentFragment {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMDocumentFragment_typekey")
      var MSXML2DotIXMLDOMDocumentFragment_typekey: typings.activexMsxml2.MSXML2.IXMLDOMDocumentFragment = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMDocumentType")
    @js.native
    /* private */ class IXMLDOMDocumentType ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMDocumentType {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMDocumentType_typekey")
      var MSXML2DotIXMLDOMDocumentType_typekey: typings.activexMsxml2.MSXML2.IXMLDOMDocumentType = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** a list of entities in the document */
      /* CompleteClass */
      override def entities(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** a list of entities in the document */
      /* CompleteClass */
      @JSName("entities")
      override val entities_Original: IXMLDOMNamedNodeMap = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the document type (root of the tree) */
      /* CompleteClass */
      override val name: String = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** collection of nodes */
      /** a list of notations in the document */
      /* CompleteClass */
      override def notations(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** a list of notations in the document */
      /* CompleteClass */
      @JSName("notations")
      override val notations_Original: IXMLDOMNamedNodeMap = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMElement")
    @js.native
    /* private */ class IXMLDOMElement ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMElement {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMElement_typekey")
      var MSXML2DotIXMLDOMElement_typekey: typings.activexMsxml2.MSXML2.IXMLDOMElement = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** look up the string value of an attribute by name */
      /* CompleteClass */
      override def getAttribute(name: String): js.Any = js.native
      
      /** look up the attribute node by name */
      /* CompleteClass */
      override def getAttributeNode(name: String): typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** build a list of elements by name */
      /* CompleteClass */
      override def getElementsByTagName(tagName: String): IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** collapse all adjacent text nodes in sub-tree */
      /* CompleteClass */
      override def normalize(): Unit = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove an attribute by name */
      /* CompleteClass */
      override def removeAttribute(name: String): Unit = js.native
      
      /** remove the specified attribute */
      /* CompleteClass */
      override def removeAttributeNode(DOMAttribute: typings.activexMsxml2.MSXML2.IXMLDOMAttribute): typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** set the string value of an attribute by name */
      /* CompleteClass */
      override def setAttribute(name: String, value: js.Any): Unit = js.native
      
      /** set the specified attribute on the element */
      /* CompleteClass */
      override def setAttributeNode(DOMAttribute: typings.activexMsxml2.MSXML2.IXMLDOMAttribute): typings.activexMsxml2.MSXML2.IXMLDOMAttribute = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** get the tagName of the element */
      /* CompleteClass */
      override val tagName: String = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMEntityReference")
    @js.native
    /* private */ class IXMLDOMEntityReference ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMEntityReference {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMEntityReference_typekey")
      var MSXML2DotIXMLDOMEntityReference_typekey: typings.activexMsxml2.MSXML2.IXMLDOMEntityReference = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMImplementation")
    @js.native
    /* private */ class IXMLDOMImplementation ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMImplementation {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMImplementation_typekey")
      var MSXML2DotIXMLDOMImplementation_typekey: typings.activexMsxml2.MSXML2.IXMLDOMImplementation = js.native
      
      /* CompleteClass */
      override def hasFeature(feature: String, version: String): Boolean = js.native
    }
    
    /** Core DOM node interface */
    @JSGlobal("MSXML2.IXMLDOMNode")
    @js.native
    /* private */ class IXMLDOMNode ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMNode {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMNode_typekey")
      var MSXML2DotIXMLDOMNode_typekey: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    /** structure for reporting parser errors */
    @JSGlobal("MSXML2.IXMLDOMParseError")
    @js.native
    /* private */ class IXMLDOMParseError ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMParseError {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMParseError_typekey")
      var MSXML2DotIXMLDOMParseError_typekey: typings.activexMsxml2.MSXML2.IXMLDOMParseError = js.native
      
      /** the error code */
      /* CompleteClass */
      override val errorCode: Double = js.native
      
      /** the absolute file position in the XML document containing the error */
      /* CompleteClass */
      override val filepos: Double = js.native
      
      /** the line number in the XML document where the error occurred */
      /* CompleteClass */
      override val line: Double = js.native
      
      /** the character position in the line containing the error */
      /* CompleteClass */
      override val linepos: Double = js.native
      
      /** the cause of the error */
      /* CompleteClass */
      override val reason: String = js.native
      
      /** the data where the error occurred */
      /* CompleteClass */
      override val srcText: String = js.native
      
      /** the URL of the XML document containing the error */
      /* CompleteClass */
      override val url: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMProcessingInstruction")
    @js.native
    /* private */ class IXMLDOMProcessingInstruction ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMProcessingInstruction {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMProcessingInstruction_typekey")
      var MSXML2DotIXMLDOMProcessingInstruction_typekey: typings.activexMsxml2.MSXML2.IXMLDOMProcessingInstruction = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the data */
      /* CompleteClass */
      var data: String = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** the target */
      /* CompleteClass */
      override val target: String = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    @JSGlobal("MSXML2.IXMLDOMText")
    @js.native
    /* private */ class IXMLDOMText ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLDOMText {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLDOMText_typekey")
      var MSXML2DotIXMLDOMText_typekey: typings.activexMsxml2.MSXML2.IXMLDOMText = js.native
      
      /** append a child node */
      /* CompleteClass */
      override def appendChild(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** append string to value */
      /* CompleteClass */
      override def appendData(data: String): Unit = js.native
      
      /** collection of nodes */
      /** the collection of the node's attributes */
      /* CompleteClass */
      override def attributes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's attributes */
      /* CompleteClass */
      @JSName("attributes")
      override val attributes_Original: IXMLDOMNamedNodeMap = js.native
      
      /** the base name of the node (nodename with the prefix stripped off) */
      /* CompleteClass */
      override val baseName: String = js.native
      
      /** collection of nodes */
      /** the collection of the node's children */
      /* CompleteClass */
      override def childNodes(index: Double): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      /** the collection of the node's children */
      /* CompleteClass */
      @JSName("childNodes")
      override val childNodes_Original: IXMLDOMNodeList = js.native
      
      /* CompleteClass */
      override def cloneNode(deep: Boolean): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** value of the node */
      /* CompleteClass */
      var data: String = js.native
      
      /** the data type of the node */
      /* CompleteClass */
      var dataType: js.Any = js.native
      
      /** pointer to the definition of the node in the DTD or schema */
      /* CompleteClass */
      override val definition: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** delete string within the value */
      /* CompleteClass */
      override def deleteData(offset: Double, count: Double): Unit = js.native
      
      /** first child of the node */
      /* CompleteClass */
      override val firstChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /* CompleteClass */
      override def hasChildNodes(): Boolean = js.native
      
      /** insert a child node */
      /* CompleteClass */
      override def insertBefore(newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode, refChild: js.Any): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** insert string into value */
      /* CompleteClass */
      override def insertData(offset: Double, data: String): Unit = js.native
      
      /** last child of the node */
      /* CompleteClass */
      override val lastChild: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** number of characters in value */
      /* CompleteClass */
      override val length: Double = js.native
      
      /** the URI for the namespace applying to the node */
      /* CompleteClass */
      override val namespaceURI: String = js.native
      
      /** right sibling of the node */
      /* CompleteClass */
      override val nextSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** name of the node */
      /* CompleteClass */
      override val nodeName: String = js.native
      
      /** the node's type */
      /* CompleteClass */
      override val nodeType: DOMNodeType = js.native
      
      /** the type of node in string form */
      /* CompleteClass */
      override val nodeTypeString: String = js.native
      
      /** get the strongly typed value of the node */
      /* CompleteClass */
      var nodeTypedValue: js.Any = js.native
      
      /** value stored in the node */
      /* CompleteClass */
      var nodeValue: js.Any = js.native
      
      /** document that contains the node */
      /* CompleteClass */
      override val ownerDocument: typings.activexMsxml2.MSXML2.IXMLDOMDocument = js.native
      
      /** parent of the node */
      /* CompleteClass */
      override val parentNode: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** has sub-tree been completely parsed */
      /* CompleteClass */
      override val parsed: Boolean = js.native
      
      /** the prefix for the namespace applying to the node */
      /* CompleteClass */
      override val prefix: String = js.native
      
      /** left sibling of the node */
      /* CompleteClass */
      override val previousSibling: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** remove a child node */
      /* CompleteClass */
      override def removeChild(childNode: typings.activexMsxml2.MSXML2.IXMLDOMNode): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace a child node */
      /* CompleteClass */
      override def replaceChild(
        newChild: typings.activexMsxml2.MSXML2.IXMLDOMNode,
        oldChild: typings.activexMsxml2.MSXML2.IXMLDOMNode
      ): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** replace string within the value */
      /* CompleteClass */
      override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectNodes(queryString: String): IXMLDOMNodeList = js.native
      
      /** execute query on the subtree */
      /* CompleteClass */
      override def selectSingleNode(queryString: String): typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
      
      /** indicates whether node is a default value */
      /* CompleteClass */
      override val specified: Boolean = js.native
      
      /** split the text node into two text nodes at the position specified */
      /* CompleteClass */
      override def splitText(offset: Double): typings.activexMsxml2.MSXML2.IXMLDOMText = js.native
      
      /** retrieve substring of value */
      /* CompleteClass */
      override def substringData(offset: Double, count: Double): String = js.native
      
      /** text content of the node and subtree */
      /* CompleteClass */
      var text: String = js.native
      
      /** apply the stylesheet to the subtree */
      /* CompleteClass */
      override def transformNode(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode): String = js.native
      
      /** apply the stylesheet to the subtree, returning the result through a document or a stream */
      /* CompleteClass */
      override def transformNodeToObject(stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode, outputObject: js.Any): Unit = js.native
      
      /** return the XML source for the node and each of its descendants */
      /* CompleteClass */
      override val xml: String = js.native
    }
    
    /** IXMLHTTPRequest2Callback Interface */
    @JSGlobal("MSXML2.IXMLHTTPRequest2Callback")
    @js.native
    /* private */ class IXMLHTTPRequest2Callback ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
      var MSXML2DotIXMLHTTPRequest2Callback_typekey: typings.activexMsxml2.MSXML2.IXMLHTTPRequest2Callback = js.native
      
      /* CompleteClass */
      override def OnError(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60, hrError: Unit): Unit = js.native
      
      /* CompleteClass */
      override def OnHeadersAvailable(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit = js.native
      
      /* CompleteClass */
      override def OnRedirect(pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit = js.native
      
      /* CompleteClass */
      override def OnResponseReceived(
        pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60,
        pResponseStream: typings.activexMsxml2.MSXML2.ISequentialStream
      ): Unit = js.native
      
      /* CompleteClass */
      override def ondataavailable(
        pXHR: typings.activexMsxml2.MSXML2.FreeThreadedXMLHTTP60,
        pResponseStream: typings.activexMsxml2.MSXML2.ISequentialStream
      ): Unit = js.native
    }
    
    /** IXSLProcessor Interface */
    @JSGlobal("MSXML2.IXSLProcessor")
    @js.native
    /* private */ class IXSLProcessor ()
      extends StObject
         with typings.activexMsxml2.MSXML2.IXSLProcessor
    
    /** Microsoft HTML Writer 6.0 */
    @JSGlobal("MSXML2.MXHTMLWriter60")
    @js.native
    /* private */ class MXHTMLWriter60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.MXHTMLWriter60 {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.MXHTMLWriter60_typekey")
      var MSXML2DotMXHTMLWriter60_typekey: typings.activexMsxml2.MSXML2.MXHTMLWriter60 = js.native
      
      /** Determine whether or not to write the byte order mark */
      /* CompleteClass */
      var byteOrderMark: Boolean = js.native
      
      /** When enabled, the writer no longer escapes out its input when writing it out. */
      /* CompleteClass */
      var disableOutputEscaping: Boolean = js.native
      
      /** Set or get the output encoding. */
      /* CompleteClass */
      var encoding: String = js.native
      
      /** Flushes all writer buffers forcing the writer to write to the underlying output object */
      /* CompleteClass */
      override def flush(): Unit = js.native
      
      /** Enable or disable auto indent mode. */
      /* CompleteClass */
      var indent: Boolean = js.native
      
      /** Determine whether or not to omit the XML declaration. */
      /* CompleteClass */
      var omitXMLDeclaration: Boolean = js.native
      
      /** Set or get the output. */
      /* CompleteClass */
      var output: js.Any = js.native
      
      /** Set or get the standalone document declaration. */
      /* CompleteClass */
      var standalone: Boolean = js.native
      
      /** Set or get the xml version info. */
      /* CompleteClass */
      var version: String = js.native
    }
    
    /** MX Namespace Manager 6.0 */
    @JSGlobal("MSXML2.MXNamespaceManager60")
    @js.native
    /* private */ class MXNamespaceManager60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.MXNamespaceManager60
    
    /** Microsoft XML Writer 6.0 */
    @JSGlobal("MSXML2.MXXMLWriter60")
    @js.native
    /* private */ class MXXMLWriter60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.MXXMLWriter60 {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.MXXMLWriter60_typekey")
      var MSXML2DotMXXMLWriter60_typekey: typings.activexMsxml2.MSXML2.MXXMLWriter60 = js.native
      
      /** Determine whether or not to write the byte order mark */
      /* CompleteClass */
      var byteOrderMark: Boolean = js.native
      
      /** When enabled, the writer no longer escapes out its input when writing it out. */
      /* CompleteClass */
      var disableOutputEscaping: Boolean = js.native
      
      /** Set or get the output encoding. */
      /* CompleteClass */
      var encoding: String = js.native
      
      /** Flushes all writer buffers forcing the writer to write to the underlying output object */
      /* CompleteClass */
      override def flush(): Unit = js.native
      
      /** Enable or disable auto indent mode. */
      /* CompleteClass */
      var indent: Boolean = js.native
      
      /** Determine whether or not to omit the XML declaration. */
      /* CompleteClass */
      var omitXMLDeclaration: Boolean = js.native
      
      /** Set or get the output. */
      /* CompleteClass */
      var output: js.Any = js.native
      
      /** Set or get the standalone document declaration. */
      /* CompleteClass */
      var standalone: Boolean = js.native
      
      /** Set or get the xml version info. */
      /* CompleteClass */
      var version: String = js.native
    }
    
    /** SAX Attributes 6.0 */
    @JSGlobal("MSXML2.SAXAttributes60")
    @js.native
    /* private */ class SAXAttributes60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.SAXAttributes60 {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.SAXAttributes60_typekey")
      var MSXML2DotSAXAttributes60_typekey: typings.activexMsxml2.MSXML2.SAXAttributes60 = js.native
      
      /** Add an attribute to the end of the list. */
      /* CompleteClass */
      override def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit = js.native
      
      /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
      /* CompleteClass */
      override def addAttributeFromIndex(varAtts: js.Any, nIndex: Double): Unit = js.native
      
      /** Clear the attribute list for reuse. */
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /** Remove an attribute from the list. */
      /* CompleteClass */
      override def removeAttribute(nIndex: Double): Unit = js.native
      
      /** Set an attribute in the list. */
      /* CompleteClass */
      override def setAttribute(
        nIndex: Double,
        strURI: String,
        strLocalName: String,
        strQName: String,
        strType: String,
        strValue: String
      ): Unit = js.native
      
      /** Copy an entire Attributes object. */
      /* CompleteClass */
      override def setAttributes(varAtts: js.Any): Unit = js.native
      
      /** Set the local name of a specific attribute. */
      /* CompleteClass */
      override def setLocalName(nIndex: Double, strLocalName: String): Unit = js.native
      
      /** Set the qualified name of a specific attribute. */
      /* CompleteClass */
      override def setQName(nIndex: Double, strQName: String): Unit = js.native
      
      /** Set the type of a specific attribute. */
      /* CompleteClass */
      override def setType(nIndex: Double, strType: String): Unit = js.native
      
      /** Set the Namespace URI of a specific attribute. */
      /* CompleteClass */
      override def setURI(nIndex: Double, strURI: String): Unit = js.native
      
      /** Set the value of a specific attribute. */
      /* CompleteClass */
      override def setValue(nIndex: Double, strValue: String): Unit = js.native
    }
    
    /** SAX XML Reader 6.0 */
    @JSGlobal("MSXML2.SAXXMLReader60")
    @js.native
    /* private */ class SAXXMLReader60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.SAXXMLReader60
    
    /** Server XML HTTP Request 6.0  */
    @JSGlobal("MSXML2.ServerXMLHTTP60")
    @js.native
    /* private */ class ServerXMLHTTP60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.ServerXMLHTTP60
    
    /** XML HTTP Request class 6.0 */
    @JSGlobal("MSXML2.XMLHTTP60")
    @js.native
    /* private */ class XMLHTTP60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.XMLHTTP60
    
    /** XSL Stylesheet Cache 6.0 */
    @JSGlobal("MSXML2.XSLTemplate60")
    @js.native
    /* private */ class XSLTemplate60 ()
      extends StObject
         with typings.activexMsxml2.MSXML2.XSLTemplate60 {
      
      /* private */ /* CompleteClass */
      @JSName("MSXML2.XSLTemplate60_typekey")
      var MSXML2DotXSLTemplate60_typekey: typings.activexMsxml2.MSXML2.XSLTemplate60 = js.native
      
      /** create a new processor object */
      /* CompleteClass */
      override def createProcessor(): typings.activexMsxml2.MSXML2.IXSLProcessor = js.native
      
      /** stylesheet to use with processors */
      /* CompleteClass */
      var stylesheet: typings.activexMsxml2.MSXML2.IXMLDOMNode = js.native
    }
  }
}
