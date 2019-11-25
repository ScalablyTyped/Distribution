package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.`!`
import typings.astDashTypes.astDashTypesStrings.`+`
import typings.astDashTypes.astDashTypesStrings.`-`
import typings.astDashTypes.astDashTypesStrings.`~`
import typings.astDashTypes.astDashTypesStrings.delete
import typings.astDashTypes.astDashTypesStrings.typeof
import typings.astDashTypes.astDashTypesStrings.void
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `-` | `+` | `!` | `~` | typeof | void | delete
  var prefix: js.UndefOr[Boolean] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-` | `+` | `!` | `~` | typeof | void | delete,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    prefix: js.UndefOr[Boolean] = js.undefined
  ): Anon_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

