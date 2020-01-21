package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait EmptyStatement extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.EmptyStatement
}

object EmptyStatement {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.EmptyStatement): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyStatement]
  }
}

