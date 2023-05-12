package typings.atlaskitPrimitives

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.article
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.as
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.aside
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.className
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.dialog
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.footer
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.header
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.li
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.main
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.nav
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.section
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul
import typings.atlaskitPrimitives.distTypesComponentsTypesMod.BasePrimitiveProps
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.BackgroundColor
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.Padding
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingBlock
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingBlockEnd
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingBlockStart
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingInline
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingInlineEnd
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.PaddingInlineStart
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
  
  type BaseBoxComponent[T /* <: ElementType[Any] */] = (js.Function1[/* props */ BaseBoxProps[div], ReactElement | Null]) & FC[BaseBoxProps[T]]
  
  type BaseBoxProps[T /* <: ElementType[Any] */] = (Omit[ComponentPropsWithoutRef[T], as | className]) & BasePrimitiveProps & BaseBoxPropsFoundation[T]
  
  trait BaseBoxPropsFoundation[T /* <: ElementType[Any] */] extends StObject {
    
    /**
      * The DOM element to render as the Box. Defaults to `div`.
      */
    var as: js.UndefOr[
        article | aside | dialog | div | footer | header | li | main | nav | ol | section | span | ul
      ] = js.undefined
    
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
    var padding: js.UndefOr[Padding] = js.undefined
    
    /**
      * Tokens representing CSS shorthand `paddingBlock`.
      *
      * @see paddingBlockStart
      * @see paddingBlockEnd
      */
    var paddingBlock: js.UndefOr[PaddingBlock] = js.undefined
    
    /**
      * Tokens representing CSS `paddingBlockEnd`.
      */
    var paddingBlockEnd: js.UndefOr[PaddingBlockEnd] = js.undefined
    
    /**
      * Tokens representing CSS `paddingBlockStart`.
      */
    var paddingBlockStart: js.UndefOr[PaddingBlockStart] = js.undefined
    
    /**
      * Tokens representing CSS shorthand `paddingInline`.
      *
      * @see paddingInlineStart
      * @see paddingInlineEnd
      */
    var paddingInline: js.UndefOr[PaddingInline] = js.undefined
    
    /**
      * Tokens representing CSS `paddingInlineEnd`.
      */
    var paddingInlineEnd: js.UndefOr[PaddingInlineEnd] = js.undefined
    
    /**
      * Tokens representing CSS `paddingInlineStart`.
      */
    var paddingInlineStart: js.UndefOr[PaddingInlineStart] = js.undefined
    
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
      
      inline def setAs(
        value: article | aside | dialog | div | footer | header | li | main | nav | ol | section | span | ul
      ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlock(value: PaddingBlock): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEnd(value: PaddingBlockEnd): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      inline def setPaddingBlockStart(value: PaddingBlockStart): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      inline def setPaddingInline(value: PaddingInline): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEnd(value: PaddingInlineEnd): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      inline def setPaddingInlineStart(value: PaddingInlineStart): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
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
