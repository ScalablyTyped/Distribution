package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsConstDeclare
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSEnumMemberKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  def from(params: Anon_CommentsConstDeclare): TSEnumDeclaration = js.native
}

