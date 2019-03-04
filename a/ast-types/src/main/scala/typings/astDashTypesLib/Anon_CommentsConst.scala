package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConst extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var declarations: js.Array[
    astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
  ]
  var kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsConst {
  @scala.inline
  def apply(
    declarations: js.Array[
      astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
    ],
    kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsConst = {
    val __obj = js.Dynamic.literal(declarations = declarations, kind = kind.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsConst]
  }
}

