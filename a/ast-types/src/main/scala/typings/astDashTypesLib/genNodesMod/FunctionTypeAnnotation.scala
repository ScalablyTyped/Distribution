package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait FunctionTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind]
  var rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind | scala.Null
  var returnType: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeAnnotation
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeAnnotation,
    rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("returnType")(returnType)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionTypeAnnotation]
  }
}

