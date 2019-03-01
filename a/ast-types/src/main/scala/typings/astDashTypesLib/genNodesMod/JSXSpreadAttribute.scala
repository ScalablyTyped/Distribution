package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXSpreadAttribute
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXSpreadAttribute
}

object JSXSpreadAttribute {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXSpreadAttribute
  ): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
}

