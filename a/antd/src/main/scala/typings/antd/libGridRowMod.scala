package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.PartialRecordBreakpointnu
import typings.antd.antdStrings.`space-around`
import typings.antd.antdStrings.`space-between`
import typings.antd.antdStrings.`space-evenly`
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.start
import typings.antd.antdStrings.stretch
import typings.antd.antdStrings.top
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridRowMod extends Shortcut {
  
  @JSImport("antd/lib/grid/row", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]] = js.native
  
  type Gutter = js.UndefOr[Double | PartialRecordBreakpointnu]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.xxl
    - typings.antd.antdStrings.xl
    - typings.antd.antdStrings.lg
    - typings.antd.antdStrings.md
    - typings.antd.antdStrings.sm
    - typings.antd.antdStrings.xs
  */
  trait Responsive extends StObject
  object Responsive {
    
    inline def lg: typings.antd.antdStrings.lg = "lg".asInstanceOf[typings.antd.antdStrings.lg]
    
    inline def md: typings.antd.antdStrings.md = "md".asInstanceOf[typings.antd.antdStrings.md]
    
    inline def sm: typings.antd.antdStrings.sm = "sm".asInstanceOf[typings.antd.antdStrings.sm]
    
    inline def xl: typings.antd.antdStrings.xl = "xl".asInstanceOf[typings.antd.antdStrings.xl]
    
    inline def xs: typings.antd.antdStrings.xs = "xs".asInstanceOf[typings.antd.antdStrings.xs]
    
    inline def xxl: typings.antd.antdStrings.xxl = "xxl".asInstanceOf[typings.antd.antdStrings.xxl]
  }
  
  /* Inlined antd.antd/lib/grid/row.ResponsiveLike<['top', 'middle', 'bottom', 'stretch'][number]> */
  trait ResponsiveAligns extends StObject {
    
    var lg: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var md: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var sm: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var xl: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var xs: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var xxl: js.UndefOr[top | middle | bottom | stretch] = js.undefined
  }
  object ResponsiveAligns {
    
    inline def apply(): ResponsiveAligns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveAligns]
    }
    
    extension [Self <: ResponsiveAligns](x: Self) {
      
      inline def setLg(value: top | middle | bottom | stretch): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: top | middle | bottom | stretch): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: top | middle | bottom | stretch): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: top | middle | bottom | stretch): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: top | middle | bottom | stretch): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: top | middle | bottom | stretch): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined antd.antd/lib/grid/row.ResponsiveLike<['start', 'end', 'center', 'space-around', 'space-between', 'space-evenly'][number]> */
  trait ResponsiveJustify extends StObject {
    
    var lg: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var md: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var sm: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var xl: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var xs: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var xxl: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
  }
  object ResponsiveJustify {
    
    inline def apply(): ResponsiveJustify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveJustify]
    }
    
    extension [Self <: ResponsiveJustify](x: Self) {
      
      inline def setLg(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined {[ key in antd.antd/lib/grid/row.Responsive ]:? T} */
  trait ResponsiveLike[T] extends StObject {
    
    var lg: js.UndefOr[T] = js.undefined
    
    var md: js.UndefOr[T] = js.undefined
    
    var sm: js.UndefOr[T] = js.undefined
    
    var xl: js.UndefOr[T] = js.undefined
    
    var xs: js.UndefOr[T] = js.undefined
    
    var xxl: js.UndefOr[T] = js.undefined
  }
  object ResponsiveLike {
    
    inline def apply[T](): ResponsiveLike[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveLike[T]]
    }
    
    extension [Self <: ResponsiveLike[?], T](x: Self & ResponsiveLike[T]) {
      
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
    }
  }
  
  trait RowProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[top | middle | bottom | stretch | ResponsiveAligns] = js.undefined
    
    var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.undefined
    
    var justify: js.UndefOr[
        start | end | center | `space-around` | `space-between` | `space-evenly` | ResponsiveJustify
      ] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setAlign(value: top | middle | bottom | stretch | ResponsiveAligns): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setJustify(
        value: start | end | center | `space-around` | `space-between` | `space-evenly` | ResponsiveJustify
      ): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libGridRowMod.foo` */
  override def _to: ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]] = default
}
