package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait RegExpLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var flags: String
  var pattern: String
  var `type`: typings.astDashTypes.astDashTypesStrings.RegExpLiteral
  var value: js.UndefOr[RegExp] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.RegExpLiteral")
@js.native
object RegExpLiteral extends TopLevel[Type[RegExpLiteral]]

