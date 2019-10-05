package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_BodyCommentsIdImplements
import typings.astDashTypes.genKindsMod.ClassBodyKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpressionBuilder extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], body: ClassBodyKind): ClassExpression = js.native
  def apply(id: js.UndefOr[scala.Nothing], body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: Null, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def from(params: Anon_BodyCommentsIdImplements): ClassExpression = js.native
}

