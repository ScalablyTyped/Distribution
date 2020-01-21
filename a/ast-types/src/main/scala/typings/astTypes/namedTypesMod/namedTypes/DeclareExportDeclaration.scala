package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DeclareClassKind
import typings.astTypes.kindsMod.DeclareFunctionKind
import typings.astTypes.kindsMod.DeclareVariableKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait DeclareExportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null
  var default: Boolean
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.DeclareExportDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareExportDeclaration")
@js.native
object DeclareExportDeclaration extends TopLevel[Type[DeclareExportDeclaration]]

