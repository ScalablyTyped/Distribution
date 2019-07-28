package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIn
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
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def from(params: Anon_CommentsIn): BinaryExpression = js.native
}

