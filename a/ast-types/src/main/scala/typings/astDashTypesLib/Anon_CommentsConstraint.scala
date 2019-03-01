package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConstraint extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var constraint: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
  var default: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: java.lang.String
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  ] = js.undefined
}

object Anon_CommentsConstraint {
  @scala.inline
  def apply(
    name: java.lang.String,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    constraint: astDashTypesLib.genKindsMod.TSTypeKind = null,
    default: astDashTypesLib.genKindsMod.TSTypeKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): Anon_CommentsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsConstraint]
  }
}

