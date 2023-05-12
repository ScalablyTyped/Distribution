package typings.atlaskitPrimitives

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitPrimitives.anon.PickInlinePropsElementTyp
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.`space-between`
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.Gap
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.RowGap
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsInlineMod extends Shortcut {
  
  /**
    * __Inline__
    *
    * Inline is a primitive component based on flexbox that manages the horizontal layout of direct children.
    *
    *
    * @example
    * ```tsx
    *  <Inline>
    *    <Box padding="space.100" backgroundColor="neutral"></Box>
    *    <Box padding="space.100" backgroundColor="neutral"></Box>
    *  </Inline>
    * ```
    *
    */
  @JSImport("@atlaskit/primitives/dist/types/components/inline", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[PickInlinePropsElementTyp]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.baseline
  */
  trait AlignBlock extends StObject
  object AlignBlock {
    
    inline def baseline: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.baseline = "baseline".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.baseline]
    
    inline def center: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center = "center".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center]
    
    inline def end: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end = "end".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end]
    
    inline def start: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start = "start".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end
  */
  trait AlignInline extends StObject
  object AlignInline {
    
    inline def center: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center = "center".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center]
    
    inline def end: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end = "end".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end]
    
    inline def start: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start = "start".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.hug
    - typings.atlaskitPrimitives.atlaskitPrimitivesStrings.fill
  */
  trait Grow extends StObject
  object Grow {
    
    inline def fill: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.fill = "fill".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.fill]
    
    inline def hug: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.hug = "hug".asInstanceOf[typings.atlaskitPrimitives.atlaskitPrimitivesStrings.hug]
  }
  
  trait InlineProps[T /* <: ElementType[Any] */] extends StObject {
    
    /**
      * Used to align children along the main axis.
      */
    var alignBlock: js.UndefOr[AlignBlock] = js.undefined
    
    /**
      * Used to align children along the cross axis.
      */
    var alignInline: js.UndefOr[AlignInline] = js.undefined
    
    /**
      * The DOM element to render as the Inline. Defaults to `div`.
      */
    var as: js.UndefOr[div | span | ul | ol] = js.undefined
    
    /**
      * Elements to be rendered inside the Inline.
      */
    var children: ReactNode
    
    /**
      * Used to set whether the container should grow to fill the available space.
      */
    var grow: js.UndefOr[Grow] = js.undefined
    
    /**
      * Forwarded ref element
      */
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentPropsWithRef<T>['ref'] */ js.Any
      ] = js.undefined
    
    /**
      * Represents the space between rows when content wraps.
      * Used to override the `space` value in between rows.
      */
    var rowSpace: js.UndefOr[RowGap] = js.undefined
    
    /**
      * Renders a separator string between each child.
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Used to set whether children are forced onto one line or will wrap onto multiple lines.
      */
    var shouldWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Represents the space between each child.
      */
    var space: js.UndefOr[Gap] = js.undefined
    
    /**
      * Used to distribute the children along the main axis.
      */
    var spread: js.UndefOr[Spread] = js.undefined
    
    /**
      * A unique string that appears as data attribute data-testid in the rendered code, serving as a hook for automated tests.
      */
    var testId: js.UndefOr[String] = js.undefined
  }
  object InlineProps {
    
    inline def apply[T /* <: ElementType[Any] */](): InlineProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineProps[?], T /* <: ElementType[Any] */] (val x: Self & InlineProps[T]) extends AnyVal {
      
      inline def setAlignBlock(value: AlignBlock): Self = StObject.set(x, "alignBlock", value.asInstanceOf[js.Any])
      
      inline def setAlignBlockUndefined: Self = StObject.set(x, "alignBlock", js.undefined)
      
      inline def setAlignInline(value: AlignInline): Self = StObject.set(x, "alignInline", value.asInstanceOf[js.Any])
      
      inline def setAlignInlineUndefined: Self = StObject.set(x, "alignInline", js.undefined)
      
      inline def setAs(value: div | span | ul | ol): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGrow(value: Grow): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentPropsWithRef<T>['ref'] */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRowSpace(value: RowGap): Self = StObject.set(x, "rowSpace", value.asInstanceOf[js.Any])
      
      inline def setRowSpaceUndefined: Self = StObject.set(x, "rowSpace", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setShouldWrap(value: Boolean): Self = StObject.set(x, "shouldWrap", value.asInstanceOf[js.Any])
      
      inline def setShouldWrapUndefined: Self = StObject.set(x, "shouldWrap", js.undefined)
      
      inline def setSpace(value: Gap): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setSpread(value: Spread): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
  
  type Spread = `space-between`
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[PickInlinePropsElementTyp]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsInlineMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[PickInlinePropsElementTyp]] = default
}
