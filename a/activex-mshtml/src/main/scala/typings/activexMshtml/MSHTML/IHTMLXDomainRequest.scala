package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLXDomainRequest extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLXDomainRequest_typekey")
  var MSHTMLDotIHTMLXDomainRequest_typekey: IHTMLXDomainRequest = js.native
  
  def abort(): Unit = js.native
  
  val contentType: String = js.native
  
  var onerror: js.Any = js.native
  
  var onload: js.Any = js.native
  
  var onprogress: js.Any = js.native
  
  var ontimeout: js.Any = js.native
  
  def open(bstrMethod: String, bstrURL: String): Unit = js.native
  
  val responseText: String = js.native
  
  def send(): Unit = js.native
  def send(varBody: js.Any): Unit = js.native
  
  var timeout: Double = js.native
}
