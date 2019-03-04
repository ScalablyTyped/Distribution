package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsKind extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var kind: astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsKind {
  @scala.inline
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsKind]
  }
}

