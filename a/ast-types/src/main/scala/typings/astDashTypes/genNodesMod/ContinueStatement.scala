package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ContinueStatement extends ASTNode {
  var label: IdentifierKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.ContinueStatement, label: IdentifierKind = null): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
}

