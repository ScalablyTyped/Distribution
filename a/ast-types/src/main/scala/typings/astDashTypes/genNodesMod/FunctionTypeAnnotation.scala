package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.FunctionTypeParamKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait FunctionTypeAnnotation extends ASTNode {
  var params: js.Array[FunctionTypeParamKind]
  var rest: FunctionTypeParamKind | Null
  var returnType: FlowTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.FunctionTypeAnnotation
  var typeParameters: TypeParameterDeclarationKind | Null
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typings.astDashTypes.astDashTypesStrings.FunctionTypeAnnotation,
    rest: FunctionTypeParamKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeAnnotation]
  }
}

