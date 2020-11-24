package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAttributeCollection extends js.Object {
  
  def apply(): js.Any = js.native
  def apply(name: js.Any): js.Any = js.native
  
  val constructor: js.Any = js.native
  
  def getNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  
  def getNamedItemNS(pvarNS: js.Any, bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def ie8_getNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  
  def ie8_item(index: Double): IHTMLDOMAttribute = js.native
  
  val ie8_length: Double = js.native
  
  def ie8_removeNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  
  def ie8_setNamedItem(pNodeIn: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def ie9_getNamedItem(bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def ie9_item(index: Double): IHTMLDOMAttribute2 = js.native
  
  val ie9_length: Double = js.native
  
  def ie9_removeNamedItem(bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def ie9_setNamedItem(pNodeIn: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def item(): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  
  val length: Double = js.native
  
  def removeNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  
  def removeNamedItemNS(pvarNS: js.Any, bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def setNamedItem(ppNode: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def setNamedItemNS(pNodeIn: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
}
