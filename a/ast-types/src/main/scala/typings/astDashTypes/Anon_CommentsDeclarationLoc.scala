package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDeclarationLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclarationKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsDeclarationLoc {
  @scala.inline
  def apply(
    declaration: DeclarationKind | ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsDeclarationLoc = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsDeclarationLoc]
  }
}

