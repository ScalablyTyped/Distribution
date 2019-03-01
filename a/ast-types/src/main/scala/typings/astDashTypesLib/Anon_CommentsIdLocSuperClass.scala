package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocSuperClass extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var superClass: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null] = js.undefined
}

object Anon_CommentsIdLocSuperClass {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind = null
  ): Anon_CommentsIdLocSuperClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdLocSuperClass]
  }
}

