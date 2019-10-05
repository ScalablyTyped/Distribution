package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsDeclareExtends
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSInterfaceBodyKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def from(params: Anon_BodyCommentsDeclareExtends): TSInterfaceDeclaration = js.native
}

