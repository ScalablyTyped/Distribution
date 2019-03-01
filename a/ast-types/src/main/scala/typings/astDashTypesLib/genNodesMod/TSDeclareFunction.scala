package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSDeclareFunction
  extends TSHasOptionalTypeParameters
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
  var async: scala.Boolean
  var declare: scala.Boolean
  var generator: scala.Boolean
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareFunction
}

object TSDeclareFunction {
  @scala.inline
  def apply(
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareFunction,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSDeclareFunction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("declare")(declare)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("params")(params)
    if (id != null) __obj.updateDynamic("id")(id)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSDeclareFunction]
  }
}

