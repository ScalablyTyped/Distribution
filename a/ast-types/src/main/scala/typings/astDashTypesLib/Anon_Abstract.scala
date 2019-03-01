package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abstract extends js.Object {
  var `abstract`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var access: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
  ] = js.undefined
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
  ] = js.undefined
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
  var defaults: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null]] = js.undefined
  var expression: js.UndefOr[scala.Boolean] = js.undefined
  var generator: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
  ] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var rest: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var returnType: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  ] = js.undefined
  var static: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
  ] = js.undefined
}

object Anon_Abstract {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    defaults: js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = null,
    expression: js.UndefOr[scala.Boolean] = js.undefined,
    generator: js.UndefOr[scala.Boolean] = js.undefined,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    rest: astDashTypesLib.genKindsMod.IdentifierKind = null,
    returnType: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_Abstract = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("params")(params)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Abstract]
  }
}

