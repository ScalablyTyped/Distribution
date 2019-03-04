package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends Comment
     with ASTNode
     with astDashTypesLib.genKindsMod.CommentKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.Block
}

object Block {
  @scala.inline
  def apply(
    leading: scala.Boolean,
    trailing: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.Block,
    value: java.lang.String,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Block = {
    val __obj = js.Dynamic.literal(leading = leading, trailing = trailing, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Block]
  }
}

