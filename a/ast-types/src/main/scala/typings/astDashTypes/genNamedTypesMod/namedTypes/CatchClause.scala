package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait CatchClause
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var body: BlockStatementKind
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  var param: js.UndefOr[PatternKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.CatchClause
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CatchClause")
@js.native
object CatchClause extends TopLevel[Type[CatchClause]]

