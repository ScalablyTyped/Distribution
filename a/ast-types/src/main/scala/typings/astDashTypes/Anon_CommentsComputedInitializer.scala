package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedInitializer extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var key: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}

object Anon_CommentsComputedInitializer {
  @scala.inline
  def apply(
    key: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotationKind = null
  ): Anon_CommentsComputedInitializer = {
    val __obj = js.Dynamic.literal(key = key)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[Anon_CommentsComputedInitializer]
  }
}

