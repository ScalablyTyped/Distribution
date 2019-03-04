package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParameterName extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var parameterName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSThisTypeKind
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
}

object Anon_CommentsLocParameterName {
  @scala.inline
  def apply(
    parameterName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSThisTypeKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocParameterName = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocParameterName]
  }
}

