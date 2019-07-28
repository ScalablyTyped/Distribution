package typings.astDashTypes

import typings.astDashTypes.astDashTypesNumbers.`false`
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncBodyComments extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var body: BlockStatementKind | ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  var expression: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[`false`] = js.undefined
  var id: js.UndefOr[Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind | Null] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

object Anon_AsyncBodyComments {
  @scala.inline
  def apply(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.Array[CommentKind] = null,
    defaults: js.Array[ExpressionKind | Null] = null,
    expression: js.UndefOr[Boolean] = js.undefined,
    generator: `false` = null,
    id: Null = null,
    loc: SourceLocationKind = null,
    rest: IdentifierKind = null,
    returnType: TypeAnnotationKind | TSTypeAnnotationKind = null,
    typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind = null
  ): Anon_AsyncBodyComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (generator != null) __obj.updateDynamic("generator")(generator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncBodyComments]
  }
}

