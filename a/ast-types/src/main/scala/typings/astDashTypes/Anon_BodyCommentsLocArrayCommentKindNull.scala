package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLocArrayCommentKindNull extends js.Object {
  var body: js.Array[
    TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsLocArrayCommentKindNull {
  @scala.inline
  def apply(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsLocArrayCommentKindNull = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLocArrayCommentKindNull]
  }
}

