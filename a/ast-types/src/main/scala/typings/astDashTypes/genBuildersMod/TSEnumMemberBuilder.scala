package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdInitializer
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumMemberBuilder extends js.Object {
  def apply(id: IdentifierKind): TSEnumMember = js.native
  def apply(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  def from(params: Anon_CommentsIdInitializer): TSEnumMember = js.native
}

