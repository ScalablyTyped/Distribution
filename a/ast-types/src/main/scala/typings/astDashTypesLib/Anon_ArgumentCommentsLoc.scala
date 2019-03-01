package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLoc extends js.Object {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var operator: astDashTypesLib.astDashTypesLibStrings.`++` | astDashTypesLib.astDashTypesLibStrings.`--`
  var prefix: scala.Boolean
}

object Anon_ArgumentCommentsLoc {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`++` | astDashTypesLib.astDashTypesLibStrings.`--`,
    prefix: scala.Boolean,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_ArgumentCommentsLoc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argument")(argument)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.updateDynamic("prefix")(prefix)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_ArgumentCommentsLoc]
  }
}

