package typings.awesomplete.anon

import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(expr: String): String | Element = js.native
  def apply(expr: String, con: ParentNode): String | Element = js.native
  def apply(expr: Element): String | Element = js.native
  def apply(expr: Element, con: ParentNode): String | Element = js.native
  
  def create(tag: String, o: js.Any): HTMLElement = js.native
  
  def fire(target: EventTarget, `type`: String, properties: js.Any): js.Any = js.native
  
  def regExpEscape(s: Replace): js.Any = js.native
  
  def siblingIndex(el: Element): Double = js.native
}
