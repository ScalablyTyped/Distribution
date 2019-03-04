package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocMethod extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var method: scala.Boolean
  var optional: scala.Boolean
  var static: scala.Boolean
  var value: astDashTypesLib.genKindsMod.FlowTypeKind
}

object Anon_CommentsIdLocMethod {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    method: scala.Boolean,
    optional: scala.Boolean,
    static: scala.Boolean,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsIdLocMethod = {
    val __obj = js.Dynamic.literal(id = id, method = method, optional = optional, static = static, value = value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIdLocMethod]
  }
}

