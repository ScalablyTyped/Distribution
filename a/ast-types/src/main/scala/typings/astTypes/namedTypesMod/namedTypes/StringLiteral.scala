package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait StringLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astTypes.astTypesStrings.StringLiteral
  var value: String
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.StringLiteral")
@js.native
object StringLiteral extends TopLevel[Type[StringLiteral]]

