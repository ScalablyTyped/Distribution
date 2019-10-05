package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.Anon_RawRawValue
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
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
  var extra: js.UndefOr[Anon_RawRawValue] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.BigIntLiteral
  var value: String | Double
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BigIntLiteral")
@js.native
object BigIntLiteral extends TopLevel[Type[BigIntLiteral]]

