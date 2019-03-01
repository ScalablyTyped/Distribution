package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocNameOptional extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: astDashTypesLib.genKindsMod.IdentifierKind
  var optional: scala.Boolean
  var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
}

object Anon_CommentsLocNameOptional {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.IdentifierKind,
    optional: scala.Boolean,
    typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocNameOptional = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocNameOptional]
  }
}

