package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParametersReadonly extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var parameters: js.Array[astDashTypesLib.genKindsMod.IdentifierKind]
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null] = js.undefined
}

object Anon_CommentsLocParametersReadonly {
  @scala.inline
  def apply(
    parameters: js.Array[astDashTypesLib.genKindsMod.IdentifierKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): Anon_CommentsLocParametersReadonly = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[Anon_CommentsLocParametersReadonly]
  }
}

