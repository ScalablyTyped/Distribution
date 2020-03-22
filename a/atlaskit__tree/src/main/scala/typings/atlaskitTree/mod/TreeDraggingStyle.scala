package typings.atlaskitTree.mod

import typings.atlaskitTree.atlaskitTreeStrings.`border-box`
import typings.atlaskitTree.atlaskitTreeStrings.fixed
import typings.atlaskitTree.atlaskitTreeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @atlaskit/tree.@atlaskit/tree.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingStyle, 'transition'> */
trait TreeDraggingStyle extends js.Object {
  var boxSizing: `border-box`
  var height: Double
  var left: Double
  var opacity: js.UndefOr[Double] = js.undefined
  var paddingLeft: Double
  var pointerEvents: none
  var position: fixed
  var top: Double
  var transform: js.UndefOr[String] = js.undefined
  var transition: none | String
  var width: Double
  var zIndex: Double
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
    zIndex: Double,
    opacity: Int | Double = null,
    transform: String = null
  ): TreeDraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDraggingStyle]
  }
}

