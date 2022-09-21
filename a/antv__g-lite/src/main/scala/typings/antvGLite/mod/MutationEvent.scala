package typings.antvGLite.mod

import typings.antvGLite.domInterfacesMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "MutationEvent")
@js.native
open class MutationEvent protected ()
  extends typings.antvGLite.domMod.MutationEvent {
  def this(
    typeArg: typings.antvGLite.domInterfacesMod.ElementEvent,
    relatedNode: IElement[Any, Any],
    prevValue: Any,
    newValue: Any,
    attrName: String,
    attrChange: Double,
    prevParsedValue: Any,
    newParsedValue: Any
  ) = this()
}
/* static members */
object MutationEvent {
  
  @JSImport("@antv/g-lite", "MutationEvent.ADDITION")
  @js.native
  val ADDITION: Double = js.native
  
  @JSImport("@antv/g-lite", "MutationEvent.MODIFICATION")
  @js.native
  val MODIFICATION: Double = js.native
  
  @JSImport("@antv/g-lite", "MutationEvent.REMOVAL")
  @js.native
  val REMOVAL: Double = js.native
}
