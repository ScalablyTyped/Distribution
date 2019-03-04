package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait LabeledStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var label: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    label: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.LabeledStatement
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body, label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LabeledStatement]
  }
}

