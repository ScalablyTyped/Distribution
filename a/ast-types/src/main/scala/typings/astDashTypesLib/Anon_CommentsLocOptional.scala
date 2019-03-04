package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocOptional extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: js.UndefOr[
    scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  ] = js.undefined
  var readonly: js.UndefOr[
    scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  ] = js.undefined
  var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind | scala.Null] = js.undefined
  var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
}

object Anon_CommentsLocOptional {
  @scala.inline
  def apply(
    typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` = null,
    readonly: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` = null,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind = null
  ): Anon_CommentsLocOptional = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[Anon_CommentsLocOptional]
  }
}

