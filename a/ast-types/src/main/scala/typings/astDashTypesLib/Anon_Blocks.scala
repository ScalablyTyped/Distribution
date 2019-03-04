package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocks extends js.Object {
  var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  var body: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_Blocks {
  @scala.inline
  def apply(
    blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind],
    body: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    filter: astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Blocks = {
    val __obj = js.Dynamic.literal(blocks = blocks, body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Blocks]
  }
}

