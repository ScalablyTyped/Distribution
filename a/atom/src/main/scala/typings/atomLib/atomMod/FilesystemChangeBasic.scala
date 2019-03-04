package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesystemChangeBasic[Action /* <: atomLib.atomLibStrings.created | atomLib.atomLibStrings.modified | atomLib.atomLibStrings.deleted | atomLib.atomLibStrings.renamed */] extends js.Object {
  /** A string describing the filesystem action that occurred. */
  var action: Action
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: java.lang.String
}

object FilesystemChangeBasic {
  @scala.inline
  def apply[Action /* <: atomLib.atomLibStrings.created | atomLib.atomLibStrings.modified | atomLib.atomLibStrings.deleted | atomLib.atomLibStrings.renamed */](action: Action, path: java.lang.String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
}

