package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConsequent extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

object Anon_CommentsConsequent {
  @scala.inline
  def apply(
    consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    test: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): Anon_CommentsConsequent = {
    val __obj = js.Dynamic.literal(consequent = consequent)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_CommentsConsequent]
  }
}

