package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSModuleBlock extends ASTNode {
  var body: js.Array[StatementKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSModuleBlock
}

object TSModuleBlock {
  @scala.inline
  def apply(body: js.Array[StatementKind], `type`: typings.astDashTypes.astDashTypesStrings.TSModuleBlock): TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleBlock]
  }
}

