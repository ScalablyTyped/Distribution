package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncBody extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var defaults: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null]] = js.undefined
  var expression: js.UndefOr[scala.Boolean] = js.undefined
  var generator: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var rest: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var returnType: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  ] = js.undefined
  var typeParameters: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
  ] = js.undefined
}

object Anon_AsyncBody {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    async: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    defaults: js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = null,
    expression: js.UndefOr[scala.Boolean] = js.undefined,
    generator: js.UndefOr[scala.Boolean] = js.undefined,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    rest: astDashTypesLib.genKindsMod.IdentifierKind = null,
    returnType: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_AsyncBody = {
    val __obj = js.Dynamic.literal(body = body, params = params)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncBody]
  }
}

