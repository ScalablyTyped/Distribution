package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait DeclareExportDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var declaration: astDashTypesLib.genKindsMod.DeclareVariableKind | astDashTypesLib.genKindsMod.DeclareFunctionKind | astDashTypesLib.genKindsMod.DeclareClassKind | astDashTypesLib.genKindsMod.FlowTypeKind | scala.Null
  var default: scala.Boolean
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportDeclaration
}

object DeclareExportDeclaration {
  @scala.inline
  def apply(
    default: scala.Boolean,
    specifiers: js.Array[
      astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportDeclaration,
    declaration: astDashTypesLib.genKindsMod.DeclareVariableKind | astDashTypesLib.genKindsMod.DeclareFunctionKind | astDashTypesLib.genKindsMod.DeclareClassKind | astDashTypesLib.genKindsMod.FlowTypeKind = null,
    source: astDashTypesLib.genKindsMod.LiteralKind = null
  ): DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("specifiers")(specifiers)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DeclareExportDeclaration]
  }
}

