package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocTypeName extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null] = js.undefined
}

object Anon_CommentsLocTypeName {
  @scala.inline
  def apply(
    typeName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null
  ): Anon_CommentsLocTypeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsLocTypeName]
  }
}

