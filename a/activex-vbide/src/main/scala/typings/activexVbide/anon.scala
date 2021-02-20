package typings.activexVbide

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CancelDefault extends StObject {
    
    val CancelDefault: Boolean = js.native
    
    val CommandBarControl: js.Any = js.native
    
    val handled: Boolean = js.native
  }
  object CancelDefault {
    
    @scala.inline
    def apply(CancelDefault: Boolean, CommandBarControl: js.Any, handled: Boolean): CancelDefault = {
      val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], CommandBarControl = CommandBarControl.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelDefault]
    }
    
    @scala.inline
    implicit class CancelDefaultMutableBuilder[Self <: CancelDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelDefault(value: Boolean): Self = StObject.set(x, "CancelDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandBarControl(value: js.Any): Self = StObject.set(x, "CommandBarControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reference extends StObject {
    
    val Reference: typings.activexVbide.VBIDE.Reference = js.native
  }
  object Reference {
    
    @scala.inline
    def apply(Reference: typings.activexVbide.VBIDE.Reference): Reference = {
      val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReference(value: typings.activexVbide.VBIDE.Reference): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    }
  }
}
