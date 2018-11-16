package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMImplementation")
@js.native
class HTMLDOMImplementation protected () extends js.Object {
  var `MSHTML.HTMLDOMImplementation_typekey`: HTMLDOMImplementation = js.native
  val constructor: js.Any = js.native
  def createDocument(pvarNS: js.Any, pvarTagName: js.Any, pDocumentType: IDOMDocumentType): IHTMLDocument7 = js.native
  def createDocumentType(bstrQualifiedName: java.lang.String, pvarPublicId: js.Any, pvarSystemId: js.Any): IDOMDocumentType = js.native
  def createHTMLDocument(bstrTitle: java.lang.String): IHTMLDocument7 = js.native
  def hasFeature(bstrfeature: java.lang.String): scala.Boolean = js.native
  def hasFeature(bstrfeature: java.lang.String, version: js.Any): scala.Boolean = js.native
  def ie9_hasFeature(bstrfeature: java.lang.String): scala.Boolean = js.native
  def ie9_hasFeature(bstrfeature: java.lang.String, version: js.Any): scala.Boolean = js.native
}

