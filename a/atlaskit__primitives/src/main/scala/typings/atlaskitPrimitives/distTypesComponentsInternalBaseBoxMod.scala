package typings.atlaskitPrimitives

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.as
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.className
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
import typings.atlaskitPrimitives.distTypesComponentsTypesMod.BasePrimitiveProps
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.BackgroundColor
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.Space
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsInternalBaseBoxMod extends Shortcut {
  
  @JSImport("@atlaskit/primitives/dist/types/components/internal/base-box", JSImport.Default)
  @js.native
  val default: BaseBoxComponent[div] = js.native
  
  @JSImport("@atlaskit/primitives/dist/types/components/internal/base-box", "BaseBox")
  @js.native
  val BaseBox: BaseBoxComponent[div] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.article
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.aside
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.dialog
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.footer
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.header
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.li
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.main
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.nav
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.section
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul
  */
  trait As extends StObject
  object As {
    
    inline def article: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.article = "article".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.article]
    
    inline def aside: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.aside = "aside".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.aside]
    
    inline def dialog: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.dialog = "dialog".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.dialog]
    
    inline def div: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div = "div".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div]
    
    inline def footer: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.footer = "footer".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.footer]
    
    inline def header: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.header = "header".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.header]
    
    inline def li: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.li = "li".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.li]
    
    inline def main: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.main = "main".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.main]
    
    inline def nav: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.nav = "nav".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.nav]
    
    inline def ol: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol = "ol".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol]
    
    inline def section: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.section = "section".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.section]
    
    inline def span: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span = "span".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span]
    
    inline def ul: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul = "ul".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul]
  }
  
  type BaseBoxComponent[T /* <: ElementType[Any] */] = (js.Function1[/* props */ BaseBoxProps[div], ReactElement | Null]) & FC[BaseBoxProps[T]]
  
  type BaseBoxProps[T /* <: ElementType[Any] */] = (Omit[ComponentPropsWithoutRef[T], as | className]) & BasePrimitiveProps & BaseBoxPropsFoundation[T]
  
  trait BaseBoxPropsFoundation[T /* <: ElementType[Any] */] extends StObject {
    
    /**
      * The DOM element to render as the Box. Defaults to `div`.
      */
    var as: js.UndefOr[As] = js.undefined
    
    /**
      * Token representing background color with a built-in fallback value.
      */
    var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
    
    /**
      * Elements to be rendered inside the Box.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The HTML className attribute.
      *
      * Before using this prop please ensure:
      * - The styles cannot otherwise be achieved through `Box` directly.
      * - The use case needs custom styles that cannot be designed or implemented differently
      *
      * Ensure you're using the `@atlaskit/eslint-plugin-design-system` with this prop to prevent unbounded usage.
      *
      * @see `@atlaskit/eslint-plugin-design-system`
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Tokens representing CSS shorthand for `paddingBlock` and `paddingInline` together.
      *
      * @see paddingBlock
      * @see paddingInline
      */
    var padding: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS shorthand `paddingBlock`.
      *
      * @see paddingBlockStart
      * @see paddingBlockEnd
      */
    var paddingBlock: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS `paddingBlockEnd`.
      */
    var paddingBlockEnd: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS `paddingBlockStart`.
      */
    var paddingBlockStart: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS shorthand `paddingInline`.
      *
      * @see paddingInlineStart
      * @see paddingInlineEnd
      */
    var paddingInline: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS `paddingInlineEnd`.
      */
    var paddingInlineEnd: js.UndefOr[Space] = js.undefined
    
    /**
      * Tokens representing CSS `paddingInlineStart`.
      */
    var paddingInlineStart: js.UndefOr[Space] = js.undefined
    
    /**
      * Forwarded ref element
      */
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentPropsWithRef<T>['ref'] */ js.Any
      ] = js.undefined
  }
  object BaseBoxPropsFoundation {
    
    inline def apply[T /* <: ElementType[Any] */](): BaseBoxPropsFoundation[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBoxPropsFoundation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseBoxPropsFoundation[?], T /* <: ElementType[Any] */] (val x: Self & BaseBoxPropsFoundation[T]) extends AnyVal {
      
      inline def setAs(value: As): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPadding(value: Space): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlock(value: Space): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEnd(value: Space): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      inline def setPaddingBlockStart(value: Space): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      inline def setPaddingInline(value: Space): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEnd(value: Space): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      inline def setPaddingInlineStart(value: Space): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
      
      inline def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentPropsWithRef<T>['ref'] */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type _To = BaseBoxComponent[div]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsInternalBaseBoxMod.foo` */
  override def _to: BaseBoxComponent[div] = default
}
