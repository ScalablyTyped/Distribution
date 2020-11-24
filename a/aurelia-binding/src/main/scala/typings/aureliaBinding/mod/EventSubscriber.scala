package typings.aureliaBinding.mod

import typings.std.Element
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "EventSubscriber")
@js.native
class EventSubscriber protected () extends js.Object {
  def this(events: js.Array[String]) = this()
  
  def dispose(): Unit = js.native
  
  def subscribe(element: Element, handler: EventListenerOrEventListenerObject): Unit = js.native
}
