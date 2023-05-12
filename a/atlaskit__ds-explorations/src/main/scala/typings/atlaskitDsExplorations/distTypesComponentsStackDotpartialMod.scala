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

object distTypesComponentsStackDotpartialMod extends Shortcut {
  
  /**
    * __Stack__
    *
    * Stack is a primitive component based on flexbox that manages the vertical layout of direct children.
    * Renders a `div` by default.
    *
    * @private
    * @deprecated DSP-8009: This primitive is scheduled for deletion.
    * Please use `Stack` from `@atlaskit/primitives` instead.
    *
    */
  @JSImport("@atlaskit/ds-explorations/dist/types/components/stack.partial", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[StackProps & RefAttributes[HTMLDivElement]]] = js.native
  
  /* keyof @atlaskit/ds-explorations.anon.Baseline */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.center
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.baseline
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexStart
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexEnd
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.start
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.end
  */
  trait FlexAlignItems extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.center
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexStart
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.flexEnd
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.start
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.end
  */
  trait FlexJustifyContent extends StObject
  
  type FlexWrap = wrap
  
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
  trait RowGap extends StObject
  
  trait StackProps
    extends StObject
       with BasePrimitiveProps {
    
    /**
      * Used to align children along the cross axis.
      */
    var alignItems: js.UndefOr[FlexAlignItems] = js.undefined
    
    /**
      * Elements to be rendered inside the Stack.
      */
    var children: ReactNode
    
    /**
      * Sets whether children are forced onto one line or can wrap onto multiple lines
      */
    var flexWrap: js.UndefOr[FlexWrap] = js.undefined
    
    /**
      * Token representing gap between children.
      */
    var gap: RowGap
    
    /**
      * Used to align children along the main axis.
      */
    var justifyContent: js.UndefOr[FlexJustifyContent] = js.undefined
  }
  object StackProps {
    
    inline def apply(gap: RowGap): StackProps = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackProps] (val x: Self) extends AnyVal {
      
      inline def setAlignItems(value: FlexAlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFlexWrap(value: FlexWrap): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setGap(value: RowGap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setJustifyContent(value: FlexJustifyContent): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[StackProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsStackDotpartialMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[StackProps & RefAttributes[HTMLDivElement]]] = default
}
