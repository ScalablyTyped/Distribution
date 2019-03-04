package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXOpeningFragment
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningFragment
}

object JSXOpeningFragment {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningFragment): JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSXOpeningFragment]
  }
}

