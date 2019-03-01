package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsExtendsId extends js.Object {
  var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind]
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsExtendsId {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind,
    `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind],
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): Anon_BodyCommentsExtendsId = {
    val __obj = js.Dynamic.literal(`extends` = `extends`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_BodyCommentsExtendsId]
  }
}

