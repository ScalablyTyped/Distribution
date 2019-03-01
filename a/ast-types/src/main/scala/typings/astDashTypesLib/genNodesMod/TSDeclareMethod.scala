package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSDeclareMethod
  extends TSHasOptionalTypeParameters
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
  var `abstract`: scala.Boolean
  var access: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ]
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ]
  var async: scala.Boolean
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var generator: scala.Boolean
  var key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
  var optional: scala.Boolean
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
  var static: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    `abstract`: scala.Boolean,
    async: scala.Boolean,
    computed: scala.Boolean,
    generator: scala.Boolean,
    key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor,
    optional: scala.Boolean,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    static: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareMethod,
    access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(`abstract` = `abstract`, `type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("static")(static)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

