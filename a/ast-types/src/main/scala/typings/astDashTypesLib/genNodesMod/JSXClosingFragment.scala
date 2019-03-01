package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXClosingFragment
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingFragment
}

object JSXClosingFragment {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingFragment): JSXClosingFragment = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[JSXClosingFragment]
  }
}

