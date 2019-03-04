package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeOperator
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var operator: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeOperator
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object TSTypeOperator {
  @scala.inline
  def apply(
    operator: java.lang.String,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeOperator,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSTypeOperator]
  }
}

