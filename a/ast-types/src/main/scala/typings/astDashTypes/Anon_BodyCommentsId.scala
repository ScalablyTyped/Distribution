package typings.astDashTypes

import typings.astDashTypes.genKindsMod.ClassBodyKind
import typings.astDashTypes.genKindsMod.ClassImplementsKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSExpressionWithTypeArgumentsKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsId extends js.Object {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | Null
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object Anon_BodyCommentsId {
  @scala.inline
  def apply(
    body: ClassBodyKind,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    implements: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind] = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    superTypeParameters: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): Anon_BodyCommentsId = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommentsId]
  }
}

