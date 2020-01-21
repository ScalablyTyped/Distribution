package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdInitializer
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumMemberBuilder extends js.Object {
  def apply(id: IdentifierKind): TSEnumMember = js.native
  def apply(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  def from(params: AnonCommentsIdInitializer): TSEnumMember = js.native
}

