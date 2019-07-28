package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLiteral
import typings.astDashTypes.genKindsMod.BooleanLiteralKind
import typings.astDashTypes.genKindsMod.NumericLiteralKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TemplateLiteralKind
import typings.astDashTypes.genKindsMod.UnaryExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSLiteralTypeBuilder extends js.Object {
  def apply(literal: BooleanLiteralKind): TSLiteralType = js.native
  def apply(literal: NumericLiteralKind): TSLiteralType = js.native
  def apply(literal: StringLiteralKind): TSLiteralType = js.native
  def apply(literal: TemplateLiteralKind): TSLiteralType = js.native
  def apply(literal: UnaryExpressionKind): TSLiteralType = js.native
  def from(params: Anon_CommentsLiteral): TSLiteralType = js.native
}

