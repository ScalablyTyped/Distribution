package typings.aframe.mod

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailEvent[D]
  extends StObject
     with Event {
  
  var detail: D = js.native
  
  @JSName("target")
  var target_DetailEvent: EventTarget & (Entity[ObjectMap[Component[Any, System[Any]]]]) = js.native
}
