package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessComments extends js.Object {
  var access: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var key: astDashTypesLib.genKindsMod.PrivateNameKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var static: js.UndefOr[scala.Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  ] = js.undefined
  var value: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var variance: js.UndefOr[
    astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
  ] = js.undefined
}

object Anon_AccessComments {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.PrivateNameKind,
    access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    value: astDashTypesLib.genKindsMod.ExpressionKind = null,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
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

