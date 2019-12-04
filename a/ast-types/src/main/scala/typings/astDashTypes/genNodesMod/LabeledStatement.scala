package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait LabeledStatement extends ASTNode {
  var body: StatementKind
  var label: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typings.astDashTypes.astDashTypesStrings.LabeledStatement
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement]
  }
}

