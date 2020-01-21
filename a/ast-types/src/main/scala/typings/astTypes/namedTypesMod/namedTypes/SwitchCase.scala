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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SwitchCase
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var consequent: js.Array[StatementKind]
  var test: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.SwitchCase
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchCase")
@js.native
object SwitchCase extends TopLevel[Type[SwitchCase]]

