package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-beautiful-dnd.react-beautiful-dnd.DraggingStyle, 'transition'> ]: react-beautiful-dnd.react-beautiful-dnd.DraggingStyle[P]} */ trait TreeDraggingStyle extends js.Object {
  var paddingLeft: scala.Double
  var transition: atAtlaskitTreeLib.atAtlaskitTreeLibStrings.none | java.lang.String
}

object TreeDraggingStyle {
  @scala.inline
  def apply(
    paddingLeft: scala.Double,
    transition: atAtlaskitTreeLib.atAtlaskitTreeLibStrings.none | java.lang.String
  ): TreeDraggingStyle = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft, transition = transition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeDraggingStyle]
  }
}

