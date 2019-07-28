package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdImpltype extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var impltype: FlowTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var supertype: FlowTypeKind
  var typeParameters: TypeParameterDeclarationKind | Null
}

object Anon_CommentsIdImpltype {
  @scala.inline
  def apply(
    id: IdentifierKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): Anon_CommentsIdImpltype = {
    val __obj = js.Dynamic.literal(id = id, impltype = impltype, supertype = supertype)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdImpltype]
  }
}

