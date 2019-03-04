package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocObject extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var `object`: astDashTypesLib.genKindsMod.IdentifierKind
  var property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind
}

object Anon_CommentsLocObject {
  @scala.inline
  def apply(
    `object`: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocObject = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocObject]
  }
}

