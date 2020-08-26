package typings.atlaskitLayer.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Sets whether the content auto flip when it reaches the border set it as true for default flip
    * or set the custom flip positions
    */
  var autoFlip: js.UndefOr[Boolean | FlipPositionType | js.Array[FlipPositionType]] = js.native
  /**
    * Element to act as a boundary for the Layer. The Layer will not sit outside this element if it
    * can help it. If, through it's normal positoning, it would end up outside the boundary the
    * layer will flip positions if the autoPosition prop is set.
    */
  var boundariesElement: js.UndefOr[BoundariesElementType] = js.native
  /** Target to which layer is attached */
  var children: js.UndefOr[ReactNode] = js.native
  /** HTML content to display in the layer. Will be aligned to the target according to the position prop. */
  var content: js.UndefOr[ReactNode] = js.native
  /** Lock scrolling behind the layer */
  var lockScroll: js.UndefOr[Boolean] = js.native
  /**
    * String representing the offsets from the target element in the format "[x-offset][y-offset]",
    * measured in pixels.
    */
  var offset: js.UndefOr[String] = js.native
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
  ] = js.native
  /**
    * Position of a layer relative to its target. The position attribute takes two positional arguments in
    * the format position="edge edge-position", where edge specifies what edge to align the layer to, and
    * edge-position specifies where on that edge the layer should appear.
    */
  var position: js.UndefOr[PositionType] = js.native
  /** z-index for the layer component */
  var zIndex: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFlipVarargs(value: FlipPositionType*): Self = this.set("autoFlip", js.Array(value :_*))
    @scala.inline
    def setAutoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): Self = this.set("autoFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFlip: Self = this.set("autoFlip", js.undefined)
    @scala.inline
    def setBoundariesElement(value: BoundariesElementType): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundariesElement: Self = this.set("boundariesElement", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setLockScroll(value: Boolean): Self = this.set("lockScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScroll: Self = this.set("lockScroll", js.undefined)
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnFlippedChange(
      value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit
    ): Self = this.set("onFlippedChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnFlippedChange: Self = this.set("onFlippedChange", js.undefined)
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

