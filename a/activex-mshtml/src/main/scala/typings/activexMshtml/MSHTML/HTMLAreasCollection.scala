package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAreasCollection extends StObject {
  
  def apply(): js.Any = js.native
  def apply(name: js.Any): js.Any = js.native
  def apply(name: js.Any, index: js.Any): js.Any = js.native
  def apply(name: Unit, index: js.Any): js.Any = js.native
  
  def add(element: IHTMLElement): Unit = js.native
  def add(element: IHTMLElement, before: js.Any): Unit = js.native
  
  val constructor: js.Any = js.native
  
  def ie8_item(index: Double): IHTMLElement2 = js.native
  
  val ie8_length: Double = js.native
  
  def ie8_namedItem(name: String): IHTMLElement2 = js.native
  
  def item(): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  def item(name: js.Any, index: js.Any): js.Any = js.native
  def item(name: Unit, index: js.Any): js.Any = js.native
  
  var length: Double = js.native
  
  def namedItem(name: String): js.Any = js.native
  
  /** @param index [index=-1] */
  def remove(): Unit = js.native
  def remove(index: Double): Unit = js.native
  
  def tags(tagName: js.Any): js.Any = js.native
  
  def urns(urn: js.Any): js.Any = js.native
}
