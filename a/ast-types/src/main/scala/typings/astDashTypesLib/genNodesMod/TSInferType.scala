package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSInferType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSInferType
  var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
}

object TSInferType {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TSInferType,
    typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
  ): TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSInferType]
  }
}

