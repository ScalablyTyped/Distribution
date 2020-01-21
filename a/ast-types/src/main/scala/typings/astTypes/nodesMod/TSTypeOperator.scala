package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeOperator extends ASTNode {
  var operator: String
  var `type`: typings.astTypes.astTypesStrings.TSTypeOperator
  var typeAnnotation: TSTypeKind
}

object TSTypeOperator {
  @scala.inline
  def apply(
    operator: String,
    `type`: typings.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeOperator]
  }
}

