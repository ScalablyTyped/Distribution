package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Specifier, 'type'> ]: ast-types.ast-types/gen/nodes.Specifier[P]} */ trait ExportBatchSpecifier extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.ExportBatchSpecifier
}

object ExportBatchSpecifier {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.ExportBatchSpecifier): ExportBatchSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBatchSpecifier]
  }
}

