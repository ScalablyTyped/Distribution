package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSModuleBlock
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleBlock
}

object TSModuleBlock {
  @scala.inline
  def apply(
    body: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleBlock
  ): TSModuleBlock = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[TSModuleBlock]
  }
}

