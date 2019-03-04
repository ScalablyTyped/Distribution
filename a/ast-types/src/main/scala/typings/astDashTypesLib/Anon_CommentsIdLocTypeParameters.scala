package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocTypeParameters extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null
}

object Anon_CommentsIdLocTypeParameters {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind = null
  ): Anon_CommentsIdLocTypeParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdLocTypeParameters]
  }
}

