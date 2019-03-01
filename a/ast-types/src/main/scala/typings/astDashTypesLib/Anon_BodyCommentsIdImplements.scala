package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsIdImplements extends js.Object {
  var body: astDashTypesLib.genKindsMod.ClassBodyKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var implements: js.UndefOr[
    js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind]
  ] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var superClass: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var superTypeParameters: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
  ] = js.undefined
  var typeParameters: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
  ] = js.undefined
}

object Anon_BodyCommentsIdImplements {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind = null,
    superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_BodyCommentsIdImplements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommentsIdImplements]
  }
}

