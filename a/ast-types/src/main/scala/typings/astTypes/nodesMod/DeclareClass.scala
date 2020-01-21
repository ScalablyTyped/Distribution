package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/nodes.InterfaceDeclaration[P]} */ trait DeclareClass extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.DeclareClass
}

object DeclareClass {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.DeclareClass): DeclareClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
}

