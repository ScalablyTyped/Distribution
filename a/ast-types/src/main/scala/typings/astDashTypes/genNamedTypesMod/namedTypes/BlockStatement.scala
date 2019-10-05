package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DirectiveKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait BlockStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: js.Array[StatementKind]
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.BlockStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BlockStatement")
@js.native
object BlockStatement extends TopLevel[Type[BlockStatement]]

