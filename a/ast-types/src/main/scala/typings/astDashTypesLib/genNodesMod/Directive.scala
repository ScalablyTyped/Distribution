package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Directive
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.Directive
  var value: astDashTypesLib.genKindsMod.DirectiveLiteralKind
}

object Directive {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.Directive,
    value: astDashTypesLib.genKindsMod.DirectiveLiteralKind
  ): Directive = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Directive]
  }
}

