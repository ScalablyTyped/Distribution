package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParameters extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var parameters: js.Array[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
  ]
  var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null] = js.undefined
}

object Anon_CommentsLocParameters {
  @scala.inline
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_CommentsLocParameters = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsLocParameters]
  }
}

