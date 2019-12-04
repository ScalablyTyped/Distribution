package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/nodes.Identifier[P]} */ trait JSXIdentifier extends ASTNode {
  var name: String
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(name: String, `type`: typings.astDashTypes.astDashTypesStrings.JSXIdentifier): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier]
  }
}

