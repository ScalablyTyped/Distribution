package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait DeclareExportAllDeclaration extends ASTNode {
  var source: LiteralKind | Null
  var `type`: typings.astTypes.astTypesStrings.DeclareExportAllDeclaration
}

object DeclareExportAllDeclaration {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.DeclareExportAllDeclaration, source: LiteralKind = null): DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration]
  }
}

