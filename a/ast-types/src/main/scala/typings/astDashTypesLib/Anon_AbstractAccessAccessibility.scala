package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbstractAccessAccessibility extends js.Object {
  var `abstract`: js.UndefOr[scala.Boolean] = js.undefined
  var access: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ] = js.undefined
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ] = js.undefined
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
  var generator: js.UndefOr[scala.Boolean] = js.undefined
  var key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
  ] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var returnType: js.UndefOr[
    astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
  ] = js.undefined
  var static: js.UndefOr[scala.Boolean] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null] = js.undefined
}

object Anon_AbstractAccessAccessibility {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.ExpressionKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    generator: js.UndefOr[scala.Boolean] = js.undefined,
    kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_AbstractAccessAccessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_AbstractAccessAccessibility]
  }
}

