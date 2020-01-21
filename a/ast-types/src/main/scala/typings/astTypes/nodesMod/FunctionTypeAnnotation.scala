package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.FunctionTypeParamKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait FunctionTypeAnnotation extends ASTNode {
  var params: js.Array[FunctionTypeParamKind]
  var rest: FunctionTypeParamKind | Null
  var returnType: FlowTypeKind
  var `type`: typings.astTypes.astTypesStrings.FunctionTypeAnnotation
  var typeParameters: TypeParameterDeclarationKind | Null
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeAnnotation,
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

