package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsLocArrayCommentKindNull
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
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
  def from(params: Anon_BodyCommentsLocArrayCommentKindNull): TSInterfaceBody = js.native
}

