package typings.angularBreadcrumb

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    /**
      * Contains the label for the step in the breadcrumb. The state name is used if not defined.
      **/
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Override the parent state (only for the breadcrumb)
      **/
    var parent: js.UndefOr[String | Function] = js.undefined
    
    /**
      * When defined to true, the state is never included in the chain of states and never appears in the breadcrumb
      **/
    var skip: js.UndefOr[Boolean] = js.undefined
  }
  object Label {
    
    inline def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setParent(value: String | Function): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
}
