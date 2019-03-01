package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ReturnStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.ReturnStatement,
    argument: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    __obj.asInstanceOf[ReturnStatement]
  }
}

