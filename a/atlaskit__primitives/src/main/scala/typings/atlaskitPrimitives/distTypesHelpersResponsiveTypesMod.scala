package typings.atlaskitPrimitives

import typings.atlaskitPrimitives.anon.FnCall
import typings.emotionUtils.mod.SerializedStyles
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelpersResponsiveTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxs
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xs
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.sm
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.md
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.lg
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xl
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxl
  */
  trait Breakpoint extends StObject
  object Breakpoint {
    
    inline def lg: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.lg = "lg".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.lg]
    
    inline def md: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.md = "md".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.md]
    
    inline def sm: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.sm = "sm".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.sm]
    
    inline def xl: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xl = "xl".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xl]
    
    inline def xs: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xs = "xs".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xs]
    
    inline def xxl: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxl = "xxl".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxl]
    
    inline def xxs: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxs = "xxs".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.xxs]
  }
  
  trait BreakpointConfig extends StObject {
    
    /**
      * The gap between a `GridItem`.
      */
    var gridItemGutter: ReturnType[FnCall]
    
    /**
      * The outer whitespace of a `Grid` item.
      */
    var gridMargin: ReturnType[FnCall]
    
    /**
      * The max-width used in media queries
      */
    var max: Double
    
    /**
      * The min-width used in media queries
      */
    var min: Double
  }
  object BreakpointConfig {
    
    inline def apply(gridItemGutter: ReturnType[FnCall], gridMargin: ReturnType[FnCall], max: Double, min: Double): BreakpointConfig = {
      val __obj = js.Dynamic.literal(gridItemGutter = gridItemGutter.asInstanceOf[js.Any], gridMargin = gridMargin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointConfig] (val x: Self) extends AnyVal {
      
      inline def setGridItemGutter(value: ReturnType[FnCall]): Self = StObject.set(x, "gridItemGutter", value.asInstanceOf[js.Any])
      
      inline def setGridMargin(value: ReturnType[FnCall]): Self = StObject.set(x, "gridMargin", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @atlaskit/primitives.@atlaskit/primitives/dist/types/helpers/responsive/types.ResponsiveObject<@emotion/react.@emotion/react.SerializedStyles> */
  trait ResponsiveCSSObject extends StObject {
    
    var lg: js.UndefOr[SerializedStyles] = js.undefined
    
    var md: js.UndefOr[SerializedStyles] = js.undefined
    
    var sm: js.UndefOr[SerializedStyles] = js.undefined
    
    var xl: js.UndefOr[SerializedStyles] = js.undefined
    
    var xs: js.UndefOr[SerializedStyles] = js.undefined
    
    var xxl: js.UndefOr[SerializedStyles] = js.undefined
    
    var xxs: js.UndefOr[SerializedStyles] = js.undefined
  }
  object ResponsiveCSSObject {
    
    inline def apply(): ResponsiveCSSObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveCSSObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveCSSObject] (val x: Self) extends AnyVal {
      
      inline def setLg(value: SerializedStyles): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: SerializedStyles): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: SerializedStyles): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: SerializedStyles): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: SerializedStyles): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: SerializedStyles): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
      
      inline def setXxs(value: SerializedStyles): Self = StObject.set(x, "xxs", value.asInstanceOf[js.Any])
      
      inline def setXxsUndefined: Self = StObject.set(x, "xxs", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<@atlaskit/primitives.@atlaskit/primitives/dist/types/helpers/responsive/types.Breakpoint, T>> */
  trait ResponsiveObject[T] extends StObject {
    
    var lg: js.UndefOr[T] = js.undefined
    
    var md: js.UndefOr[T] = js.undefined
    
    var sm: js.UndefOr[T] = js.undefined
    
    var xl: js.UndefOr[T] = js.undefined
    
    var xs: js.UndefOr[T] = js.undefined
    
    var xxl: js.UndefOr[T] = js.undefined
    
    var xxs: js.UndefOr[T] = js.undefined
  }
  object ResponsiveObject {
    
    inline def apply[T](): ResponsiveObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveObject[?], T] (val x: Self & ResponsiveObject[T]) extends AnyVal {
      
      inline def setLg(value: T): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: T): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: T): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: T): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: T): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: T): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
      
      inline def setXxs(value: T): Self = StObject.set(x, "xxs", value.asInstanceOf[js.Any])
      
      inline def setXxsUndefined: Self = StObject.set(x, "xxs", js.undefined)
    }
  }
}
