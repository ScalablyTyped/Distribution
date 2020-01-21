package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
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
  var `type`: typings.astTypes.astTypesStrings.CatchClause
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CatchClause")
@js.native
object CatchClause extends TopLevel[Type[CatchClause]]

