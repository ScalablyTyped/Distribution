package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocSuperClass extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterInstantiationKind | Null] = js.undefined
}

object Anon_CommentsIdLocSuperClass {
  @scala.inline
  def apply(
    id: IdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): Anon_CommentsIdLocSuperClass = {
    val __obj = js.Dynamic.literal(id = id)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsIdLocSuperClass]
  }
}

