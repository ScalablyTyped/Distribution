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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ContinueStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var label: js.UndefOr[IdentifierKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ContinueStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ContinueStatement")
@js.native
object ContinueStatement extends TopLevel[Type[ContinueStatement]]

