package typings.atom.srcOtherTypesMod

import typings.std.CustomEvent
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandEvent[CurrentTarget /* <: EventTarget */]
  extends StObject
     with CustomEvent[Any] {
  
  def abortKeyBinding(): Unit = js.native
  
  @JSName("currentTarget")
  var currentTarget_CommandEvent: CurrentTarget = js.native
  
  var keyBindingAborted: Boolean = js.native
  
  var propagationStopped: Boolean = js.native
}
