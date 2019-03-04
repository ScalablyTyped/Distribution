package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Variance
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var kind: astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus
  var `type`: astDashTypesLib.astDashTypesLibStrings.Variance
}

object Variance {
  @scala.inline
  def apply(
    kind: astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus,
    `type`: astDashTypesLib.astDashTypesLibStrings.Variance
  ): Variance = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Variance]
  }
}

