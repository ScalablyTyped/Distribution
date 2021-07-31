package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLLocation extends StObject {
  
  @JSName("MSHTML.HTMLLocation_typekey")
  var MSHTMLDotHTMLLocation_typekey: HTMLLocation = js.native
  
  def assign(bstr: String): Unit = js.native
  
  val constructor: js.Any = js.native
  
  var hash: String = js.native
  
  var host: String = js.native
  
  var hostname: String = js.native
  
  var href: String = js.native
  
  var pathname: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  /** @param flag [flag=false] */
  def reload(): Unit = js.native
  def reload(flag: Boolean): Unit = js.native
  
  def replace(bstr: String): Unit = js.native
  
  var search: String = js.native
}
