package typings.atom.srcOtherTypesMod

import typings.atom.srcDecorationMod.DecorationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationPropsChangedEvent extends StObject {
  
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions
  
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions
}
object DecorationPropsChangedEvent {
  
  inline def apply(newProperties: DecorationOptions, oldProperties: DecorationOptions): DecorationPropsChangedEvent = {
    val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationPropsChangedEvent]
  }
  
  extension [Self <: DecorationPropsChangedEvent](x: Self) {
    
    inline def setNewProperties(value: DecorationOptions): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
    
    inline def setOldProperties(value: DecorationOptions): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
  }
}
