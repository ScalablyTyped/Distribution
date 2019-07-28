package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.`private`
import typings.astDashTypes.astDashTypesStrings.`protected`
import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.astDashTypesStrings.public
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PrivateNameKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessComments extends js.Object {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: PrivateNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var value: js.UndefOr[ExpressionKind | Null] = js.undefined
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

object Anon_AccessComments {
  @scala.inline
  def apply(
    key: PrivateNameKind,
    access: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null,
    static: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null,
    value: ExpressionKind = null,
    variance: VarianceKind | plus | minus = null
  ): Anon_AccessComments = {
    val __obj = js.Dynamic.literal(key = key)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessComments]
  }
}

