package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ComprehensionBlock
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var each: scala.Boolean
  var left: astDashTypesLib.genKindsMod.PatternKind
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionBlock
}

object ComprehensionBlock {
  @scala.inline
  def apply(
    each: scala.Boolean,
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionBlock
  ): ComprehensionBlock = {
    val __obj = js.Dynamic.literal(each = each, left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ComprehensionBlock]
  }
}

