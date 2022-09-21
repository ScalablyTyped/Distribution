package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElementCollection extends StObject {
  
  def apply(): Any = js.native
  def apply(name: Any): Any = js.native
  def apply(name: Any, index: Any): Any = js.native
  def apply(name: Unit, index: Any): Any = js.native
  
  val constructor: Any = js.native
  
  def ie8_item(index: Double): IHTMLElement2 = js.native
  
  val ie8_length: Double = js.native
  
  def ie8_namedItem(name: String): IHTMLElement2 = js.native
  
  def item(): Any = js.native
  def item(name: Any): Any = js.native
  def item(name: Any, index: Any): Any = js.native
  def item(name: Unit, index: Any): Any = js.native
  
  var length: Double = js.native
  
  def namedItem(name: String): Any = js.native
  
  def tags(tagName: Any): Any = js.native
  
  def urns(urn: Any): Any = js.native
}
