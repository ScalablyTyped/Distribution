package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NoopKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncComments extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object Anon_AsyncComments {
  @scala.inline
  def apply(
    params: js.Array[PatternKind],
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.Array[CommentKind] = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): Anon_AsyncComments = {
    val __obj = js.Dynamic.literal(params = params)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_AsyncComments]
  }
}

