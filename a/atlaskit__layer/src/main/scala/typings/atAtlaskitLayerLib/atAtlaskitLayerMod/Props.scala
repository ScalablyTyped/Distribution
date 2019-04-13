package typings
package atAtlaskitLayerLib.atAtlaskitLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Sets whether the content auto flip when it reaches the border set it as true for default flip
    * or set the custom flip positions
    */
  var autoFlip: js.UndefOr[scala.Boolean | FlipPositionType | js.Array[FlipPositionType]] = js.undefined
  /**
    * Element to act as a boundary for the Layer. The Layer will not sit outside this element if it
    * can help it. If, through it's normal positoning, it would end up outside the boundary the
    * layer will flip positions if the autoPosition prop is set.
    */
  var boundariesElement: js.UndefOr[BoundariesElementType] = js.undefined
  /** Target to which layer is attached */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** HTML content to display in the layer. Will be aligned to the target according to the position prop. */
  var content: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Lock scrolling behind the layer */
  var lockScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String representing the offsets from the target element in the format "[x-offset][y-offset]",
    * measured in pixels.
    */
  var offset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback that is used to know when the flipped state of Layer changes. This occurs when placing a
    * Layered element in the requested position would cause Layer to be rendered outside of the
    * boundariesElement (usually viewport).
    */
  var onFlippedChange: js.UndefOr[
    js.Function3[
      /* flipped */ scala.Boolean, 
      /* actualPosition */ CSSPositionType, 
      /* originalPosition */ CSSPositionType, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Position of a layer relative to its target. The position attribute takes two positional arguments in
    * the format position="edge edge-position", where edge specifies what edge to align the layer to, and
    * edge-position specifies where on that edge the layer should appear.
    */
  var position: js.UndefOr[PositionType] = js.undefined
  /** z-index for the layer component */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoFlip: scala.Boolean | FlipPositionType | js.Array[FlipPositionType] = null,
    boundariesElement: BoundariesElementType = null,
    children: reactLib.reactMod.ReactNode = null,
    content: reactLib.reactMod.ReactNode = null,
    lockScroll: js.UndefOr[scala.Boolean] = js.undefined,
    offset: java.lang.String = null,
    onFlippedChange: (/* flipped */ scala.Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => scala.Unit = null,
    position: PositionType = null,
    zIndex: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (autoFlip != null) __obj.updateDynamic("autoFlip")(autoFlip.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScroll)) __obj.updateDynamic("lockScroll")(lockScroll)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (onFlippedChange != null) __obj.updateDynamic("onFlippedChange")(js.Any.fromFunction3(onFlippedChange))
    if (position != null) __obj.updateDynamic("position")(position)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

