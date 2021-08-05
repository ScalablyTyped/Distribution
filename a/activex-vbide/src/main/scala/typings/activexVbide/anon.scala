package typings.activexVbide

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CancelDefault extends StObject {
    
    val CancelDefault: Boolean
    
    val CommandBarControl: js.Any
    
    val handled: Boolean
  }
  object CancelDefault {
    
    inline def apply(CancelDefault: Boolean, CommandBarControl: js.Any, handled: Boolean): CancelDefault = {
      val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], CommandBarControl = CommandBarControl.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelDefault]
    }
    
    extension [Self <: CancelDefault](x: Self) {
      
      inline def setCancelDefault(value: Boolean): Self = StObject.set(x, "CancelDefault", value.asInstanceOf[js.Any])
      
      inline def setCommandBarControl(value: js.Any): Self = StObject.set(x, "CommandBarControl", value.asInstanceOf[js.Any])
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reference extends StObject {
    
    val Reference: typings.activexVbide.VBIDE.Reference
  }
  object Reference {
    
    inline def apply(Reference: typings.activexVbide.VBIDE.Reference): Reference = {
      val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    extension [Self <: Reference](x: Self) {
      
      inline def setReference(value: typings.activexVbide.VBIDE.Reference): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    }
  }
}
