package typings.astDashTypes

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
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIn extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof
  var right: ExpressionKind
}

object Anon_CommentsIn {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsIn = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIn]
  }
}

