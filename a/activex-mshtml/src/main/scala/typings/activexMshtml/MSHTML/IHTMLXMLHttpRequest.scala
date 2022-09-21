package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLXMLHttpRequest extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLXMLHttpRequest_typekey")
  var MSHTMLDotIHTMLXMLHttpRequest_typekey: IHTMLXMLHttpRequest = js.native
  
  def abort(): Unit = js.native
  
  def getAllResponseHeaders(): String = js.native
  
  def getResponseHeader(bstrHeader: String): String = js.native
  
  var onreadystatechange: Any = js.native
  
  def open(bstrMethod: String, bstrURL: String, varAsync: Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: Any, varUser: Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: Any, varUser: Any, varPassword: Any): Unit = js.native
  def open(bstrMethod: String, bstrURL: String, varAsync: Any, varUser: Unit, varPassword: Any): Unit = js.native
  
  val readyState: Double = js.native
  
  val responseBody: Any = js.native
  
  val responseText: String = js.native
  
  val responseXML: Any = js.native
  
  def send(): Unit = js.native
  def send(varBody: Any): Unit = js.native
  
  def setRequestHeader(bstrHeader: String, bstrValue: String): Unit = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
}
