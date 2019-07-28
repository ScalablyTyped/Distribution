package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSExpressionWithTypeArgumentsKind
import typings.astDashTypes.genKindsMod.TSInterfaceBodyKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsDeclareExtends extends js.Object {
  var body: TSInterfaceBodyKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.undefined
  var id: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object Anon_BodyCommentsDeclareExtends {
  @scala.inline
  def apply(
    body: TSInterfaceBodyKind,
    id: IdentifierKind | TSQualifiedNameKind,
    comments: js.Array[CommentKind] = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    `extends`: js.Array[TSExpressionWithTypeArgumentsKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): Anon_BodyCommentsDeclareExtends = {
    val __obj = js.Dynamic.literal(body = body, id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_BodyCommentsDeclareExtends]
  }
}

