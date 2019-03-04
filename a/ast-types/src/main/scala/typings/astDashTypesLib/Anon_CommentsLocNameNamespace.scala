package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocNameNamespace extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind
  var namespace: astDashTypesLib.genKindsMod.JSXIdentifierKind
}

object Anon_CommentsLocNameNamespace {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    namespace: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocNameNamespace = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocNameNamespace]
  }
}

