package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportNamedDeclaration extends ASTNode {
  var declaration: DeclarationKind | Null
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind]
  var `type`: typings.astTypes.astTypesStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifierKind],
    `type`: typings.astTypes.astTypesStrings.ExportNamedDeclaration,
    declaration: DeclarationKind = null,
    source: LiteralKind = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

