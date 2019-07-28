package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSModuleBlockKind
import typings.astDashTypes.genKindsMod.TSModuleDeclarationKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsDeclare extends js.Object {
  var body: js.UndefOr[TSModuleBlockKind | TSModuleDeclarationKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsDeclare {
  @scala.inline
  def apply(
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    body: TSModuleBlockKind | TSModuleDeclarationKind = null,
    comments: js.Array[CommentKind] = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsDeclare = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsDeclare]
  }
}

