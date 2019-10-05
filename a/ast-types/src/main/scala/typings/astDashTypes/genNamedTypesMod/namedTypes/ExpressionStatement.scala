package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ExpressionStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var expression: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ExpressionStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExpressionStatement")
@js.native
object ExpressionStatement extends TopLevel[Type[ExpressionStatement]]

