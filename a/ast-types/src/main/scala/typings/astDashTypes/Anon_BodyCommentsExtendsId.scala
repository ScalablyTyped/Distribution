package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.InterfaceExtendsKind
import typings.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsExtendsId extends js.Object {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.undefined
}

object Anon_BodyCommentsExtendsId {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): Anon_BodyCommentsExtendsId = {
    val __obj = js.Dynamic.literal(body = body, id = id)
    __obj.updateDynamic("extends")(`extends`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_BodyCommentsExtendsId]
  }
}

