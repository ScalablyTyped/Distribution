package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLXMLHttpRequest extends StObject {
  
  @JSName("MSHTML.HTMLXMLHttpRequest_typekey")
  var MSHTMLDotHTMLXMLHttpRequest_typekey: HTMLXMLHttpRequest = js.native
  
  def abort(): Unit = js.native
  
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  val constructor: js.Any = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  def getAllResponseHeaders(): String = js.native
  
  def getResponseHeader(bstrHeader: String): String = js.native
  
  var onreadystatechange: js.Any = js.native
  
  var ontimeout: js.Any = js.native
  
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any): Unit = js.native
  def open(
    bstrMethod: String,
    bstrURL: String,
    varAsync: js.Any,
    varUser: js.UndefOr[scala.Nothing],
    varPassword: js.Any
  ): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: js.Any, varUser: js.Any, varPassword: js.Any): Unit = js.native
  
  val readyState: Double = js.native
  
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  val responseBody: js.Any = js.native
  
  val responseText: String = js.native
  
  val responseXML: js.Any = js.native
  
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
  
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  var timeout: Double = js.native
}
