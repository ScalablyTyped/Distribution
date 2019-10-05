package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocMembers
import typings.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typings.astDashTypes.genKindsMod.TSIndexSignatureKind
import typings.astDashTypes.genKindsMod.TSMethodSignatureKind
import typings.astDashTypes.genKindsMod.TSPropertySignatureKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeLiteralBuilder extends js.Object {
  def apply(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  def from(params: Anon_CommentsLocMembers): TSTypeLiteral = js.native
}

