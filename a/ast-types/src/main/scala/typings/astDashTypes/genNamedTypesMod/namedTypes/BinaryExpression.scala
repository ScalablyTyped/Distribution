package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`!==`
import typings.astDashTypes.astDashTypesStrings.`!=`
import typings.astDashTypes.astDashTypesStrings.`%`
import typings.astDashTypes.astDashTypesStrings.`&`
import typings.astDashTypes.astDashTypesStrings.`**`
import typings.astDashTypes.astDashTypesStrings.`+`
import typings.astDashTypes.astDashTypesStrings.`-`
import typings.astDashTypes.astDashTypesStrings.`/`
import typings.astDashTypes.astDashTypesStrings.`<<`
import typings.astDashTypes.astDashTypesStrings.`<=`
import typings.astDashTypes.astDashTypesStrings.`<`
import typings.astDashTypes.astDashTypesStrings.`===`
import typings.astDashTypes.astDashTypesStrings.`==`
import typings.astDashTypes.astDashTypesStrings.`>=`
import typings.astDashTypes.astDashTypesStrings.`>>>`
import typings.astDashTypes.astDashTypesStrings.`>>`
import typings.astDashTypes.astDashTypesStrings.`>`
import typings.astDashTypes.astDashTypesStrings.`_backtick^_backtick`
import typings.astDashTypes.astDashTypesStrings.in
import typings.astDashTypes.astDashTypesStrings.instanceof
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BinaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: ExpressionKind
  var operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.BinaryExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BinaryExpression")
@js.native
object BinaryExpression extends TopLevel[Type[BinaryExpression]]

