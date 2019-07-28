package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentsCallee extends js.Object {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}

object Anon_ArgumentsCallee {
  @scala.inline
  def apply(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    typeArguments: TypeParameterInstantiationKind = null
  ): Anon_ArgumentsCallee = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    __obj.asInstanceOf[Anon_ArgumentsCallee]
  }
}

