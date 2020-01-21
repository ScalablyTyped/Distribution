package typings.atlaskitTree.mod

import typings.atlaskitTree.atlaskitTreeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-beautiful-dnd.react-beautiful-dnd.DraggingStyle, 'transition'> ]: react-beautiful-dnd.react-beautiful-dnd.DraggingStyle[P]} */ trait TreeDraggingStyle extends js.Object {
  var paddingLeft: Double
  var transition: none | String
}

object TreeDraggingStyle {
  @scala.inline
  def apply(paddingLeft: Double, transition: none | String): TreeDraggingStyle = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeDraggingStyle]
  }
}

