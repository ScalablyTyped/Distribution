package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait MixedTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.MixedTypeAnnotation
}

object MixedTypeAnnotation {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.MixedTypeAnnotation): MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[MixedTypeAnnotation]
  }
}

