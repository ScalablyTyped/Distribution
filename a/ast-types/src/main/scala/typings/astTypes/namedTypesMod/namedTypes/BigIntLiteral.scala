package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.AnonRawRawValue
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait BigIntLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var extra: js.UndefOr[AnonRawRawValue] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.BigIntLiteral
  var value: String | Double
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BigIntLiteral")
@js.native
object BigIntLiteral extends TopLevel[Type[BigIntLiteral]]

