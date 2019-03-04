package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait EmptyTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.EmptyTypeAnnotation
}

object EmptyTypeAnnotation {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.EmptyTypeAnnotation): EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EmptyTypeAnnotation]
  }
}

