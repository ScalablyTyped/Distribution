package typings.atlaskitTree.mod

import typings.atlaskitTree.atlaskitTreeStrings.`border-box`
import typings.atlaskitTree.atlaskitTreeStrings.fixed
import typings.atlaskitTree.atlaskitTreeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @atlaskit/tree.@atlaskit/tree.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingStyle, 'transition'> */
@js.native
trait TreeDraggingStyle extends js.Object {
  var boxSizing: `border-box` = js.native
  var height: Double = js.native
  var left: Double = js.native
  var opacity: js.UndefOr[Double] = js.native
  var paddingLeft: Double = js.native
  var pointerEvents: none = js.native
  var position: fixed = js.native
  var top: Double = js.native
  var transform: js.UndefOr[String] = js.native
  var transition: none | String = js.native
  var width: Double = js.native
  var zIndex: Double = js.native
}

object TreeDraggingStyle {
  @scala.inline
  def apply(
    boxSizing: `border-box`,
    height: Double,
    left: Double,
    paddingLeft: Double,
    pointerEvents: none,
    position: fixed,
    top: Double,
    transition: none | String,
    width: Double,
    zIndex: Double
  ): TreeDraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDraggingStyle]
  }
  @scala.inline
  implicit class TreeDraggingStyleOps[Self <: TreeDraggingStyle] (val x: Self) extends AnyVal {
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
    def setBoxSizing(value: `border-box`): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerEvents(value: none): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: fixed): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: none | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

