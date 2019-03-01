package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/nodes.FlowPredicate[P]} */ trait DeclaredPredicate
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowPredicateKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclaredPredicate
  var value: astDashTypesLib.genKindsMod.ExpressionKind
}

object DeclaredPredicate {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclaredPredicate,
    value: astDashTypesLib.genKindsMod.ExpressionKind
  ): DeclaredPredicate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DeclaredPredicate]
  }
}

