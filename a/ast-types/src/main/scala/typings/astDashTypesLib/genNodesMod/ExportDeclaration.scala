package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var default: scala.Boolean
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportDeclaration
}

object ExportDeclaration {
  @scala.inline
  def apply(
    default: scala.Boolean,
    specifiers: js.Array[
      astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ExportDeclaration,
    declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind = null,
    source: astDashTypesLib.genKindsMod.LiteralKind = null
  ): ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default, specifiers = specifiers)
    __obj.updateDynamic("type")(`type`)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExportDeclaration]
  }
}

