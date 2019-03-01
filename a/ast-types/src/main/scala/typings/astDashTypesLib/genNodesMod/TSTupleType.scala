package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTupleType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var elementTypes: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTupleType
}

object TSTupleType {
  @scala.inline
  def apply(
    elementTypes: js.Array[astDashTypesLib.genKindsMod.TSTypeKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTupleType
  ): TSTupleType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elementTypes")(elementTypes)
    __obj.asInstanceOf[TSTupleType]
  }
}

