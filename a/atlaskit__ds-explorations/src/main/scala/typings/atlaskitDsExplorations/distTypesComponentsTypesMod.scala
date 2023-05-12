package typings.atlaskitDsExplorations

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTypesMod {
  
  trait BasePrimitiveProps extends StObject {
    
    /**
      * Inline styles to be applied to the primitive.
      * Marked as "unsafe" because any CSS properties can be provided here without any extra control or validation, including those that would be better managed by the primitive itself via props.
      * Effectively equivalent to the standard `style` prop but marked with a special name so we can rationalise its usage IN THE FUTURE.
      */
    var UNSAFE_style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * A unique string that appears as data attribute `data-testid` in the rendered code, serving as a hook for automated tests.
      */
    var testId: js.UndefOr[String] = js.undefined
  }
  object BasePrimitiveProps {
    
    inline def apply(): BasePrimitiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePrimitiveProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasePrimitiveProps] (val x: Self) extends AnyVal {
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
      
      inline def setUNSAFE_style(value: CSSProperties): Self = StObject.set(x, "UNSAFE_style", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_styleUndefined: Self = StObject.set(x, "UNSAFE_style", js.undefined)
    }
  }
}
