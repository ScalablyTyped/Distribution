package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedKeyLocOptional extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var parameters: js.Array[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
  ]
  var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null] = js.undefined
}

object Anon_CommentsComputedKeyLocOptional {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_CommentsComputedKeyLocOptional = {
    val __obj = js.Dynamic.literal(key = key, parameters = parameters)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsComputedKeyLocOptional]
  }
}

