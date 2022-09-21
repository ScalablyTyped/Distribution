package typings.atlaskitLayer

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitLayer.atlaskitLayerStrings.viewport
    - typings.atlaskitLayer.atlaskitLayerStrings.window
    - typings.atlaskitLayer.atlaskitLayerStrings.scrollParent
  */
  trait BoundariesElementType extends StObject
  object BoundariesElementType {
    
    inline def scrollParent: typings.atlaskitLayer.atlaskitLayerStrings.scrollParent = "scrollParent".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.scrollParent]
    
    inline def viewport: typings.atlaskitLayer.atlaskitLayerStrings.viewport = "viewport".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.viewport]
    
    inline def window: typings.atlaskitLayer.atlaskitLayerStrings.window = "window".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.window]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitLayer.atlaskitLayerStrings.absolute
    - typings.atlaskitLayer.atlaskitLayerStrings.fixed
  */
  trait CSSPositionType extends StObject
  object CSSPositionType {
    
    inline def absolute: typings.atlaskitLayer.atlaskitLayerStrings.absolute = "absolute".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.absolute]
    
    inline def fixed: typings.atlaskitLayer.atlaskitLayerStrings.fixed = "fixed".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.fixed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitLayer.atlaskitLayerStrings.top
    - typings.atlaskitLayer.atlaskitLayerStrings.right
    - typings.atlaskitLayer.atlaskitLayerStrings.bottom
    - typings.atlaskitLayer.atlaskitLayerStrings.left
  */
  trait FlipPositionType extends StObject
  object FlipPositionType {
    
    inline def bottom: typings.atlaskitLayer.atlaskitLayerStrings.bottom = "bottom".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.bottom]
    
    inline def left: typings.atlaskitLayer.atlaskitLayerStrings.left = "left".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.left]
    
    inline def right: typings.atlaskitLayer.atlaskitLayerStrings.right = "right".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.right]
    
    inline def top: typings.atlaskitLayer.atlaskitLayerStrings.top = "top".asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.top]
  }
  
  type Layer = Component[Props, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitLayer.atlaskitLayerStrings.`top left`
    - typings.atlaskitLayer.atlaskitLayerStrings.`top center`
    - typings.atlaskitLayer.atlaskitLayerStrings.`top right`
    - typings.atlaskitLayer.atlaskitLayerStrings.`right top`
    - typings.atlaskitLayer.atlaskitLayerStrings.`right middle`
    - typings.atlaskitLayer.atlaskitLayerStrings.`right bottom`
    - typings.atlaskitLayer.atlaskitLayerStrings.`bottom left`
    - typings.atlaskitLayer.atlaskitLayerStrings.`bottom center`
    - typings.atlaskitLayer.atlaskitLayerStrings.`bottom right`
    - typings.atlaskitLayer.atlaskitLayerStrings.`left top`
    - typings.atlaskitLayer.atlaskitLayerStrings.`left middle`
    - typings.atlaskitLayer.atlaskitLayerStrings.`left bottom`
  */
  trait PositionType extends StObject
  object PositionType {
    
    inline def `bottom center`: typings.atlaskitLayer.atlaskitLayerStrings.`bottom center` = ("bottom center").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`bottom center`]
    
    inline def `bottom left`: typings.atlaskitLayer.atlaskitLayerStrings.`bottom left` = ("bottom left").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`bottom left`]
    
    inline def `bottom right`: typings.atlaskitLayer.atlaskitLayerStrings.`bottom right` = ("bottom right").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`bottom right`]
    
    inline def `left bottom`: typings.atlaskitLayer.atlaskitLayerStrings.`left bottom` = ("left bottom").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`left bottom`]
    
    inline def `left middle`: typings.atlaskitLayer.atlaskitLayerStrings.`left middle` = ("left middle").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`left middle`]
    
    inline def `left top`: typings.atlaskitLayer.atlaskitLayerStrings.`left top` = ("left top").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`left top`]
    
    inline def `right bottom`: typings.atlaskitLayer.atlaskitLayerStrings.`right bottom` = ("right bottom").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`right bottom`]
    
    inline def `right middle`: typings.atlaskitLayer.atlaskitLayerStrings.`right middle` = ("right middle").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`right middle`]
    
    inline def `right top`: typings.atlaskitLayer.atlaskitLayerStrings.`right top` = ("right top").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`right top`]
    
    inline def `top center`: typings.atlaskitLayer.atlaskitLayerStrings.`top center` = ("top center").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`top center`]
    
    inline def `top left`: typings.atlaskitLayer.atlaskitLayerStrings.`top left` = ("top left").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`top left`]
    
    inline def `top right`: typings.atlaskitLayer.atlaskitLayerStrings.`top right` = ("top right").asInstanceOf[typings.atlaskitLayer.atlaskitLayerStrings.`top right`]
  }
  
  trait Props extends StObject {
    
    /**
      * Sets whether the content auto flip when it reaches the border set it as true for default flip
      * or set the custom flip positions
      */
    var autoFlip: js.UndefOr[Boolean | FlipPositionType | js.Array[FlipPositionType]] = js.undefined
    
    /**
      * Element to act as a boundary for the Layer. The Layer will not sit outside this element if it
      * can help it. If, through it's normal positoning, it would end up outside the boundary the
      * layer will flip positions if the autoPosition prop is set.
      */
    var boundariesElement: js.UndefOr[BoundariesElementType] = js.undefined
    
    /** Target to which layer is attached */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** HTML content to display in the layer. Will be aligned to the target according to the position prop. */
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /** Lock scrolling behind the layer */
    var lockScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String representing the offsets from the target element in the format "[x-offset][y-offset]",
      * measured in pixels.
      */
    var offset: js.UndefOr[String] = js.undefined
    
    /**
      * Callback that is used to know when the flipped state of Layer changes. This occurs when placing a
      * Layered element in the requested position would cause Layer to be rendered outside of the
      * boundariesElement (usually viewport).
      */
    var onFlippedChange: js.UndefOr[
        js.Function3[
          /* flipped */ Boolean, 
          /* actualPosition */ CSSPositionType, 
          /* originalPosition */ CSSPositionType, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Position of a layer relative to its target. The position attribute takes two positional arguments in
      * the format position="edge edge-position", where edge specifies what edge to align the layer to, and
      * edge-position specifies where on that edge the layer should appear.
      */
    var position: js.UndefOr[PositionType] = js.undefined
    
    /** z-index for the layer component */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAutoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): Self = StObject.set(x, "autoFlip", value.asInstanceOf[js.Any])
      
      inline def setAutoFlipUndefined: Self = StObject.set(x, "autoFlip", js.undefined)
      
      inline def setAutoFlipVarargs(value: FlipPositionType*): Self = StObject.set(x, "autoFlip", js.Array(value*))
      
      inline def setBoundariesElement(value: BoundariesElementType): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLockScroll(value: Boolean): Self = StObject.set(x, "lockScroll", value.asInstanceOf[js.Any])
      
      inline def setLockScrollUndefined: Self = StObject.set(x, "lockScroll", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnFlippedChange(
        value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit
      ): Self = StObject.set(x, "onFlippedChange", js.Any.fromFunction3(value))
      
      inline def setOnFlippedChangeUndefined: Self = StObject.set(x, "onFlippedChange", js.undefined)
      
      inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
