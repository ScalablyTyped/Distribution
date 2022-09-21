package typings.atlaskitVisuallyHidden

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait VisuallyHiddenProps extends StObject {
    
    /**
      * The element or elements that should be hidden.
      */
    var children: ReactNode
    
    /**
      * An id may be appropriate for this component if used in conjunction with `aria-describedby`
      * on a paired element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Role attribute is passed on to the span to aid screen readers.
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * A `testId` prop is provided for specified elements, which is a unique
      * string that appears as a data attribute `data-testid` in the rendered code,
      * serving as a hook for automated tests
      */
    var testId: js.UndefOr[String] = js.undefined
  }
  object VisuallyHiddenProps {
    
    inline def apply(): VisuallyHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisuallyHiddenProps]
    }
    
    extension [Self <: VisuallyHiddenProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
}
