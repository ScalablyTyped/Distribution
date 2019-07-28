package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSEnumMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConstDeclare extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var const: js.UndefOr[Boolean] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var id: IdentifierKind
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var members: js.Array[TSEnumMemberKind]
}

object Anon_CommentsConstDeclare {
  @scala.inline
  def apply(
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    comments: js.Array[CommentKind] = null,
    const: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsConstDeclare = {
    val __obj = js.Dynamic.literal(id = id, members = members)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsConstDeclare]
  }
}

