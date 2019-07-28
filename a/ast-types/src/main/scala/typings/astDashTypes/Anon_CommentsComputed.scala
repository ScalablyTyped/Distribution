package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.init
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputed extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: init | get | set
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var method: js.UndefOr[Boolean] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var value: ExpressionKind | PatternKind
}

object Anon_CommentsComputed {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    value: ExpressionKind | PatternKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    method: js.UndefOr[Boolean] = js.undefined,
    shorthand: js.UndefOr[Boolean] = js.undefined
  ): Anon_CommentsComputed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    __obj.asInstanceOf[Anon_CommentsComputed]
  }
}

