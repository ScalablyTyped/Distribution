package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends Comment
     with ASTNode {
  var `type`: typings.astTypes.astTypesStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    leading: Boolean,
    trailing: Boolean,
    `type`: typings.astTypes.astTypesStrings.CommentBlock,
    value: String,
    loc: SourceLocationKind = null
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentBlock]
  }
}

