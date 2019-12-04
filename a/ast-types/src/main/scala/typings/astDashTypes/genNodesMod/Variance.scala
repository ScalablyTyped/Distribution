package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Variance extends ASTNode {
  var kind: plus | minus
  var `type`: typings.astDashTypes.astDashTypesStrings.Variance
}

object Variance {
  @scala.inline
  def apply(kind: plus | minus, `type`: typings.astDashTypes.astDashTypesStrings.Variance): Variance = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variance]
  }
}

