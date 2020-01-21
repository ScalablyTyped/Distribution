package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait IfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var alternate: js.UndefOr[StatementKind | Null] = js.undefined
  var consequent: StatementKind
  var test: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.IfStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.IfStatement")
@js.native
object IfStatement extends TopLevel[Type[IfStatement]]

