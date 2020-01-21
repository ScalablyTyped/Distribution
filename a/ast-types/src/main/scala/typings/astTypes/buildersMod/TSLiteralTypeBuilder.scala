package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLiteral
import typings.astTypes.kindsMod.BooleanLiteralKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.kindsMod.UnaryExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.TSLiteralType
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
  def from(params: AnonCommentsLiteral): TSLiteralType = js.native
}

