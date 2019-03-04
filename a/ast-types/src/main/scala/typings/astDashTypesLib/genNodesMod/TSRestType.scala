package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSRestType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSRestType
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object TSRestType {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TSRestType,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  ): TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSRestType]
  }
}

