package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ReturnStatement extends ASTNode {
  var argument: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.ReturnStatement, argument: ExpressionKind = null): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
}

