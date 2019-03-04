package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a SAX parser that uses integer values for known XML names (elements, attributes and attribute values). The parser also handles namespaces
  * and allows to have individual contexts for each XML element.
  *
  * Before parsing is possible you have to set your {@link XFastDocumentHandler} using {@link setFastDocumentHandler()} .
  *
  * Parsing starts with calling {@link parseStream()} . If the parser finds a valid XML file with the given {@link InputSource} , it calls {@link
  * XFastDocumentHandler.startDocument()} first.
  *
  * This parser generates either "fast" events that use integer token values for namespaces, elements and attributes or "unknown" events for elements that
  * are unknown.
  *
  * A namespace is unknown if the namespace URL was not registered with {@link registerNamespace()} .
  *
  * An element is unknown if no {@link XFastTokenHandler} is set or if the {@link XFastTokenHandler} does not return a valid identifier for the elements
  * local name. An element is also unknown if the elements local name is known but it uses a namespace that is unknown.
  *
  * Setting a {@link XFastTokenHandler} with {@link setTokenHandler()} is optional, but without a {@link XFastTokenHandler} you will only get unknown sax
  * events. This can be useful if you are only interested in the namespace handling and/or the context feature.
  *
  * For each element the parser sends a create child element event to the elements parent context by calling {@link
  * XFastContextHandler.createFastChildContext()} for known elements or {@link XFastContextHandler.createUnknownChildContext()} for unknown elements. ;
  * The parent context for the root element is the {@link XFastDocumentHandler} itself.
  *
  * If the parent context returns an empty reference, no further events for the element and all of its children are created.
  *
  * If a valid context is returned this context gets a start event by a call to {@link XFastContextHandler.startFastElement()} for known elements or
  * {@link XFastContextHandler.startUnknownElement()} for unknown elements.
  *
  * After processing all its child elements the context gets an end event by a call to {@link XFastContextHandler.endFastElement()} for known elements or
  * {@link XFastContextHandler.endUnknownElement()} for unknown elements.
  *
  * It is valid to return one instance of {@link XFastContextHandler} more than once. It is even possible to only use the {@link XFastDocumentHandler} by
  * always returning a reference to itself for each create child context event.
  *
  * After the last element is processed the parser generates an end document event at the {@link XFastDocumentHandler} by calling {@link
  * XFastDocumentHandler.endDocument()} .
  * @see http://wiki.openoffice.org/wiki/FastParser
  */
trait XFastParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Gets the namespace url string. */
  def getNamespaceURL(prefix: java.lang.String): java.lang.String
  /**
    * parses an XML document from a stream.
    *
    * Set the desired handlers before calling this method.
    */
  def parseStream(aInputSource: InputSource): scala.Unit
  /**
    * registers a known namespace url with the given integer token. ;
    * @param NamespaceURL the namespace URL.
    * @param NamespaceToken an integer token that must be greater than {@link FastToken.NAMESPACE} .
    */
  def registerNamespace(NamespaceURL: java.lang.String, NamespaceToken: scala.Double): scala.Unit
  /** allows an application to register a DTD-Handler. */
  def setEntityResolver(Resolver: XEntityResolver): scala.Unit
  /**
    * allows an application to register an error event handler.
    *
    * Note that the error handler can throw an exception when an error or warning occurs. Note that an exception is thrown by the parser when an
    * unrecoverable (fatal) error occurs.
    */
  def setErrorHandler(Handler: XErrorHandler): scala.Unit
  /** Application must register a document event handler to get sax events for the parsed stream. */
  def setFastDocumentHandler(Handler: XFastDocumentHandler): scala.Unit
  /**
    * sets a locale specified for localization of warnings and error messages.
    *
    * Set the language of the error messages. Useful when the parsing errors will be presented to the user.
    */
  def setLocale(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /** @since LibreOffice 5.3 */
  def setNamespaceHandler(Handler: XFastNamespaceHandler): scala.Unit
  /** must be registered to translate known XML names to integer tokens. */
  def setTokenHandler(Handler: XFastTokenHandler): scala.Unit
}

object XFastParser {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getNamespaceURL: js.Function1[java.lang.String, java.lang.String],
    parseStream: js.Function1[InputSource, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerNamespace: js.Function2[java.lang.String, scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    setEntityResolver: js.Function1[XEntityResolver, scala.Unit],
    setErrorHandler: js.Function1[XErrorHandler, scala.Unit],
    setFastDocumentHandler: js.Function1[XFastDocumentHandler, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setNamespaceHandler: js.Function1[XFastNamespaceHandler, scala.Unit],
    setTokenHandler: js.Function1[XFastTokenHandler, scala.Unit]
  ): XFastParser = {
    val __obj = js.Dynamic.literal(acquire = acquire, getNamespaceURL = getNamespaceURL, parseStream = parseStream, queryInterface = queryInterface, registerNamespace = registerNamespace, release = release, setEntityResolver = setEntityResolver, setErrorHandler = setErrorHandler, setFastDocumentHandler = setFastDocumentHandler, setLocale = setLocale, setNamespaceHandler = setNamespaceHandler, setTokenHandler = setTokenHandler)
  
    __obj.asInstanceOf[XFastParser]
  }
}

