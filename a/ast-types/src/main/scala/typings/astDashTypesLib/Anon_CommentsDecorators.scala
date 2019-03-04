package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDecorators extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var properties: js.Array[
    astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
  ]
  var typeAnnotation: js.UndefOr[
    astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  ] = js.undefined
}

object Anon_CommentsDecorators {
  @scala.inline
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): Anon_CommentsDecorators = {
    val __obj = js.Dynamic.literal(properties = properties)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsDecorators]
  }
}

