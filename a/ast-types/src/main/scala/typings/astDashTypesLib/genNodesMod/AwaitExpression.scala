package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AwaitExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var all: scala.Boolean
  var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.AwaitExpression
}

object AwaitExpression {
  @scala.inline
  def apply(
    all: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.AwaitExpression,
    argument: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): AwaitExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("all")(all)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    __obj.asInstanceOf[AwaitExpression]
  }
}

