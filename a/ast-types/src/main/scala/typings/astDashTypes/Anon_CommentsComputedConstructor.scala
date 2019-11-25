package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.constructor
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedConstructor extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: ExpressionKind
  var kind: constructor | method | get | set
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var value: FunctionKind
}

object Anon_CommentsComputedConstructor {
  @scala.inline
  def apply(
    key: ExpressionKind,
    kind: constructor | method | get | set,
    value: FunctionKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    static: js.UndefOr[Boolean] = js.undefined
  ): Anon_CommentsComputedConstructor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsComputedConstructor]
  }
}

