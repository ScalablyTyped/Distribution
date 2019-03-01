package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSIndexedAccessType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var indexType: astDashTypesLib.genKindsMod.TSTypeKind
  var objectType: astDashTypesLib.genKindsMod.TSTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexedAccessType
}

object TSIndexedAccessType {
  @scala.inline
  def apply(
    indexType: astDashTypesLib.genKindsMod.TSTypeKind,
    objectType: astDashTypesLib.genKindsMod.TSTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexedAccessType
  ): TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("indexType")(indexType)
    __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[TSIndexedAccessType]
  }
}

