package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.BooleanLiteralKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.kindsMod.UnaryExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSLiteralType extends ASTNode {
  var literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
  var `type`: typings.astTypes.astTypesStrings.TSLiteralType
}

object TSLiteralType {
  @scala.inline
  def apply(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSLiteralType
  ): TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSLiteralType]
  }
}

