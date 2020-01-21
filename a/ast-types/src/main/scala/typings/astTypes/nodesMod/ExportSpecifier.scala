package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ExportSpecifier extends ASTNode {
  var exported: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportSpecifier): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier]
  }
}

