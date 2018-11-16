package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SAX XML Reader 6.0 */
@JSGlobal("MSXML2.SAXXMLReader60")
@js.native
class SAXXMLReader60 protected () extends js.Object {
  var `MSXML2.SAXXMLReader60_typekey`: SAXXMLReader60 = js.native
  /** Set or get the base URL for the document. */
  var baseURL: java.lang.String = js.native
  /** Allow an application to register a content event handler or look up the current content event handler. */
  var contentHandler: IVBSAXContentHandler = js.native
  /** Allow an application to register a DTD event handler or look up the current DTD event handler. */
  var dtdHandler: IVBSAXDTDHandler = js.native
  /** Allow an application to register an entity resolver or look up the current entity resolver. */
  var entityResolver: IVBSAXEntityResolver = js.native
  /** Allow an application to register an error event handler or look up the current error event handler. */
  var errorHandler: IVBSAXErrorHandler = js.native
  /** Set or get the secure base URL for the document. */
  var secureBaseURL: java.lang.String = js.native
  /** Look up the value of a feature. */
  def getFeature(strName: java.lang.String): scala.Boolean = js.native
  /** Look up the value of a property. */
  def getProperty(strName: java.lang.String): js.Any = js.native
  /** Parse an XML document. */
  def parse(): scala.Unit = js.native
  /** Parse an XML document. */
  def parse(varInput: js.Any): scala.Unit = js.native
  /** Parse an XML document from a system identifier (URI). */
  def parseURL(strURL: java.lang.String): scala.Unit = js.native
  /** Set the state of a feature. */
  def putFeature(strName: java.lang.String, fValue: scala.Boolean): scala.Unit = js.native
  /** Set the value of a property. */
  def putProperty(strName: java.lang.String, varValue: js.Any): scala.Unit = js.native
}

