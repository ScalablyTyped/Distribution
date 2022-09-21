package typings.aureliaBinding.mod

import typings.std.Element
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "EventSubscriber")
@js.native
open class EventSubscriber protected () extends StObject {
  def this(events: js.Array[String]) = this()
  
  def dispose(): Unit = js.native
  
  def subscribe(element: Element, handler: EventListenerOrEventListenerObject): Unit = js.native
}
