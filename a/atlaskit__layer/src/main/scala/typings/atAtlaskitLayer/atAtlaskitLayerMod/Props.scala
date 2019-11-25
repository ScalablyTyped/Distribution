package typings.atAtlaskitLayer.atAtlaskitLayerMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
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
  @scala.inline
  def apply(
    autoFlip: Boolean | FlipPositionType | js.Array[FlipPositionType] = null,
    boundariesElement: BoundariesElementType = null,
    children: ReactNode = null,
    content: ReactNode = null,
    lockScroll: js.UndefOr[Boolean] = js.undefined,
    offset: String = null,
    onFlippedChange: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit = null,
    position: PositionType = null,
    zIndex: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (autoFlip != null) __obj.updateDynamic("autoFlip")(autoFlip.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScroll)) __obj.updateDynamic("lockScroll")(lockScroll.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onFlippedChange != null) __obj.updateDynamic("onFlippedChange")(js.Any.fromFunction3(onFlippedChange))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

