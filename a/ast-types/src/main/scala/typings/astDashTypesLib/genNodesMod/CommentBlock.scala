package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends Comment
     with ASTNode
     with astDashTypesLib.genKindsMod.CommentKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.CommentBlock
}

object CommentBlock {
  @scala.inline
  def apply(
    leading: scala.Boolean,
    trailing: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.CommentBlock,
    value: java.lang.String,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): CommentBlock = {
    val __obj = js.Dynamic.literal(leading = leading, trailing = trailing, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[CommentBlock]
  }
}

