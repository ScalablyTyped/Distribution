package typings.atlaskitPrimitives

import typings.atlaskitPrimitives.atlaskitPrimitivesBooleans.`false`
import typings.atlaskitPrimitives.distTypesXcssXcssMod.BoxXCSS
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTypesMod {
  
  trait BasePrimitiveProps extends StObject {
    
    /**
      * Inline styles to be applied to the primitive.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
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
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
  
  trait PublicBoxPropsBase extends StObject {
    
    /**
      * Safe subset of styles that can be applied as a classname.
      */
    var xcss: js.UndefOr[BoxXCSS | (js.Array[js.UndefOr[BoxXCSS | `false`]])] = js.undefined
  }
  object PublicBoxPropsBase {
    
    inline def apply(): PublicBoxPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicBoxPropsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicBoxPropsBase] (val x: Self) extends AnyVal {
      
      inline def setXcss(value: BoxXCSS | (js.Array[js.UndefOr[BoxXCSS | `false`]])): Self = StObject.set(x, "xcss", value.asInstanceOf[js.Any])
      
      inline def setXcssUndefined: Self = StObject.set(x, "xcss", js.undefined)
      
      inline def setXcssVarargs(value: (js.UndefOr[BoxXCSS | `false`])*): Self = StObject.set(x, "xcss", js.Array(value*))
    }
  }
}
