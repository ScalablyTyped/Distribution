package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSUnionType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSUnionType
  var types: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
}

object TSUnionType {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TSUnionType,
    types: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  ): TSUnionType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[TSUnionType]
  }
}

