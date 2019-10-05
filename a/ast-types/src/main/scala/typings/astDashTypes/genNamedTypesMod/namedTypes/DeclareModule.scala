package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareModule
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: BlockStatementKind
  var id: IdentifierKind | LiteralKind
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareModule
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareModule")
@js.native
object DeclareModule extends TopLevel[Type[DeclareModule]]

