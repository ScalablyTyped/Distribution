package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SAX XML Reader 6.0 */
@js.native
trait SAXXMLReader60 extends StObject {
  
  /* private */ @JSName("MSXML2.SAXXMLReader60_typekey")
  var MSXML2DotSAXXMLReader60_typekey: SAXXMLReader60 = js.native
  
  /** Set or get the base URL for the document. */
  var baseURL: String = js.native
  
  /** Allow an application to register a content event handler or look up the current content event handler. */
  var contentHandler: IVBSAXContentHandler = js.native
  
  /** Allow an application to register a DTD event handler or look up the current DTD event handler. */
  var dtdHandler: IVBSAXDTDHandler = js.native
  
  /** Allow an application to register an entity resolver or look up the current entity resolver. */
  var entityResolver: IVBSAXEntityResolver = js.native
  
  /** Allow an application to register an error event handler or look up the current error event handler. */
  var errorHandler: IVBSAXErrorHandler = js.native
  
  /** Look up the value of a feature. */
  def getFeature(strName: String): Boolean = js.native
  
  /** Look up the value of a property. */
  def getProperty(strName: String): js.Any = js.native
  
  /** Parse an XML document. */
  def parse(): Unit = js.native
  def parse(varInput: js.Any): Unit = js.native
  
  /** Parse an XML document from a system identifier (URI). */
  def parseURL(strURL: String): Unit = js.native
  
  /** Set the state of a feature. */
  def putFeature(strName: String, fValue: Boolean): Unit = js.native
  
  /** Set the value of a property. */
  def putProperty(strName: String, varValue: js.Any): Unit = js.native
  
  /** Set or get the secure base URL for the document. */
  var secureBaseURL: String = js.native
}
