package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsExtends extends js.Object {
  var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var `extends`: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsExtends {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsExtends = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsExtends]
  }
}

