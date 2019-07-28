package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMImplementation")
@js.native
class HTMLDOMImplementation protected () extends js.Object {
  var `MSHTML.HTMLDOMImplementation_typekey`: HTMLDOMImplementation = js.native
  val constructor: js.Any = js.native
  def createDocument(pvarNS: js.Any, pvarTagName: js.Any, pDocumentType: IDOMDocumentType): IHTMLDocument7 = js.native
  def createDocumentType(bstrQualifiedName: String, pvarPublicId: js.Any, pvarSystemId: js.Any): IDOMDocumentType = js.native
  def createHTMLDocument(bstrTitle: String): IHTMLDocument7 = js.native
  def hasFeature(bstrfeature: String): Boolean = js.native
  def hasFeature(bstrfeature: String, version: js.Any): Boolean = js.native
  def ie9_hasFeature(bstrfeature: String): Boolean = js.native
  def ie9_hasFeature(bstrfeature: String, version: js.Any): Boolean = js.native
}

