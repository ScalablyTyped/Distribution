package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSLiteralType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSLiteralType
}

object TSLiteralType {
  @scala.inline
  def apply(
    literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSLiteralType
  ): TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSLiteralType]
  }
}

