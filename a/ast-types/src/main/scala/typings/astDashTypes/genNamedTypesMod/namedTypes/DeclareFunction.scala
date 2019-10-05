package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareFunction
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareFunction
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareFunction")
@js.native
object DeclareFunction extends TopLevel[Type[DeclareFunction]]

