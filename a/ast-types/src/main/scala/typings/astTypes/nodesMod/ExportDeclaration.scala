package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportDeclaration extends ASTNode {
  var declaration: DeclarationKind | ExpressionKind | Null
  var default: Boolean
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  var `type`: typings.astTypes.astTypesStrings.ExportDeclaration
}

object ExportDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typings.astTypes.astTypesStrings.ExportDeclaration,
    declaration: DeclarationKind | ExpressionKind = null,
    source: LiteralKind = null
  ): ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDeclaration]
  }
}

