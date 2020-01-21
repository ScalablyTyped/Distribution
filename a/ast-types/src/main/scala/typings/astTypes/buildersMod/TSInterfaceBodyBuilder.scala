package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLocArrayCommentKindNull
import typings.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typings.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typings.astTypes.kindsMod.TSIndexSignatureKind
import typings.astTypes.kindsMod.TSMethodSignatureKind
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody = js.native
  def from(params: AnonBodyCommentsLocArrayCommentKindNull): TSInterfaceBody = js.native
}

