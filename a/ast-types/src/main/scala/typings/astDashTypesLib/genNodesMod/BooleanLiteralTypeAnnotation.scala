package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait BooleanLiteralTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var raw: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.BooleanLiteralTypeAnnotation
  var value: scala.Boolean
}

object BooleanLiteralTypeAnnotation {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: astDashTypesLib.astDashTypesLibStrings.BooleanLiteralTypeAnnotation,
    value: scala.Boolean
  ): BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation]
  }
}

