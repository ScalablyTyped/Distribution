package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait NumberLiteralTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var raw: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.NumberLiteralTypeAnnotation
  var value: scala.Double
}

object NumberLiteralTypeAnnotation {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: astDashTypesLib.astDashTypesLibStrings.NumberLiteralTypeAnnotation,
    value: scala.Double
  ): NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberLiteralTypeAnnotation]
  }
}

