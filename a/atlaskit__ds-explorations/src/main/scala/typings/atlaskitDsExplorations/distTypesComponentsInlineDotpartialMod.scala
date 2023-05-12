package typings.atlaskitDsExplorations

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.wrap
import typings.atlaskitDsExplorations.distTypesComponentsTypesMod.BasePrimitiveProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsInlineDotpartialMod extends Shortcut {
  
  /**
    * __Inline__
    *
    * Inline is a primitive component based on flexbox that manages the horizontal layout of direct children.
    * Renders a `div` by default.
    *
    * @private
    * @deprecated DSP-8009: This primitive is scheduled for deletion.
    * Please use `Inline` from `@atlaskit/primitives` instead.
    *
    * @example
    * ```tsx
    * const App = () => (
    *   <Inline gap="space.100">
    *     <Button />
    *     <Button />
    *   </Inline>
    * )
    * ```
    */
  @JSImport("@atlaskit/ds-explorations/dist/types/components/inline.partial", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[InlineProps & RefAttributes[HTMLDivElement]]] = js.native
  
  /* keyof @atlaskit/ds-explorations.anon.Space0 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot0
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot025
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot050
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot075
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot100
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot1000
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot150
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot200
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot250
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot300
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot400
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot500
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot600
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceDot800
  */
  trait ColumnGap extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Baseline */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.center
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.baseline
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexStart
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexEnd
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.start
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.end
  */
  trait FlexAlignItems extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.End */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.center
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexStart
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.`space-between`
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexEnd
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.start
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.end
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.spaceBetween
  */
  trait FlexJustifyContent extends StObject
  
  type FlexWrap = wrap
  
  trait InlineProps
    extends StObject
       with BasePrimitiveProps {
    
    /**
      * Used to align children along the cross axis.
      */
    var alignItems: js.UndefOr[FlexAlignItems] = js.undefined
    
    /**
      * Elements to be rendered inside the Inline.
      */
    var children: ReactNode
    
    /**
      * Renders a divider between children.
      * If a string is provided it will automatically be wrapped in a `<Text>` component.
      */
    var divider: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Sets whether children are forced onto one line or can wrap onto multiple lines
      */
    var flexWrap: js.UndefOr[FlexWrap] = js.undefined
    
    /**
      * Token representing gap between children.
      */
    var gap: ColumnGap
    
    /**
      * Used to align children along the main axis.
      */
    var justifyContent: js.UndefOr[FlexJustifyContent] = js.undefined
  }
  object InlineProps {
    
    inline def apply(gap: ColumnGap): InlineProps = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineProps] (val x: Self) extends AnyVal {
      
      inline def setAlignItems(value: FlexAlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDivider(value: ReactNode): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setFlexWrap(value: FlexWrap): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setGap(value: ColumnGap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setJustifyContent(value: FlexJustifyContent): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[InlineProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsInlineDotpartialMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[InlineProps & RefAttributes[HTMLDivElement]]] = default
}
