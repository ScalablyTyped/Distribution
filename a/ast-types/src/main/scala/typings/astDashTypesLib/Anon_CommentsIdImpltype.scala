package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdImpltype extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var impltype: astDashTypesLib.genKindsMod.FlowTypeKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var supertype: astDashTypesLib.genKindsMod.FlowTypeKind
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object Anon_CommentsIdImpltype {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    impltype: astDashTypesLib.genKindsMod.FlowTypeKind,
    supertype: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): Anon_CommentsIdImpltype = {
    val __obj = js.Dynamic.literal(id = id, impltype = impltype, supertype = supertype)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdImpltype]
  }
}

