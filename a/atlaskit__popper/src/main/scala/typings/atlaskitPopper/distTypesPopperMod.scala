package typings.atlaskitPopper

import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libTypesMod.PositioningStrategy
import typings.popperjsCore.libTypesMod.VirtualElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactPopper.mod.Modifier
import typings.reactPopper.mod.PopperChildrenProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopperMod {
  
  @JSImport("@atlaskit/popper/dist/types/popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Popper[CustomModifiers](hasChildrenOffsetPlacementReferenceElementModifiersStrategy: CustomPopperProps[CustomModifiers]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popper")(hasChildrenOffsetPlacementReferenceElementModifiersStrategy.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@atlaskit/popper/dist/types/popper", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
  
  trait CustomPopperProps[Modifiers] extends StObject {
    
    /**
      * Returns the element to be positioned.
      */
    var children: js.UndefOr[js.Function1[/* childrenProps */ PopperChildrenProps, ReactNode]] = js.undefined
    
    /**
      * Additional modifiers and modifier overwrites.
      */
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.undefined
    
    /**
      * Distance the popup should be offset from the reference in the format of [along, away] (units in px).
      * Defaults to [0, 8] - which means the popup will be 8px away from the edge of the reference specified
      * by the `placement` prop.
      */
    var offset: js.UndefOr[Offset] = js.undefined
    
    /**
      * Which side of the Reference to show on.
      */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /**
      * Replacement reference element to position popper relative to.
      */
    var referenceElement: js.UndefOr[HTMLElement | VirtualElement] = js.undefined
    
    /**
      * Placement strategy used. Can be 'fixed' or 'absolute'
      */
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object CustomPopperProps {
    
    inline def apply[Modifiers](): CustomPopperProps[Modifiers] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomPopperProps[Modifiers]]
    }
    
    extension [Self <: CustomPopperProps[?], Modifiers](x: Self & CustomPopperProps[Modifiers]) {
      
      inline def setChildren(value: /* childrenProps */ PopperChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setReferenceElement(value: HTMLElement | VirtualElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type Offset = js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
}
