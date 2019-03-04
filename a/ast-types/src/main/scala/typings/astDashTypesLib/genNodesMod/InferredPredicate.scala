package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/nodes.FlowPredicate[P]} */ trait InferredPredicate
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowPredicateKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.InferredPredicate
}

object InferredPredicate {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.InferredPredicate): InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InferredPredicate]
  }
}

