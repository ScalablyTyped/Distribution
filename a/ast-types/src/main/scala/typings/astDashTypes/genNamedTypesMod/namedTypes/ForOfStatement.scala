package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclarationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ForOfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: StatementKind
  var left: VariableDeclarationKind | PatternKind
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ForOfStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ForOfStatement")
@js.native
object ForOfStatement extends TopLevel[Type[ForOfStatement]]

