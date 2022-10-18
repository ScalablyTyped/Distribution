package typings.antvGLite

import typings.antvGLite.distDomFederatedEventMod.FederatedEvent
import typings.antvGLite.distDomInterfacesMod.ElementEvent
import typings.antvGLite.distDomInterfacesMod.IElement
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomMutationEventMod {
  
  @JSImport("@antv/g-lite/dist/dom/MutationEvent", "MutationEvent")
  @js.native
  open class MutationEvent protected () extends FederatedEvent[Event, Any] {
    def this(
      typeArg: ElementEvent,
      relatedNode: IElement[Any, Any],
      prevValue: Any,
      newValue: Any,
      attrName: String,
      attrChange: Double,
      prevParsedValue: Any,
      newParsedValue: Any
    ) = this()
    
    var attrChange: Double = js.native
    
    var attrName: String = js.native
    
    var newParsedValue: Any = js.native
    
    var newValue: Any = js.native
    
    var prevParsedValue: Any = js.native
    
    var prevValue: Any = js.native
    
    var relatedNode: IElement[Any, Any] = js.native
  }
  /* static members */
  object MutationEvent {
    
    @JSImport("@antv/g-lite/dist/dom/MutationEvent", "MutationEvent.ADDITION")
    @js.native
    val ADDITION: Double = js.native
    
    @JSImport("@antv/g-lite/dist/dom/MutationEvent", "MutationEvent.MODIFICATION")
    @js.native
    val MODIFICATION: Double = js.native
    
    @JSImport("@antv/g-lite/dist/dom/MutationEvent", "MutationEvent.REMOVAL")
    @js.native
    val REMOVAL: Double = js.native
  }
}
