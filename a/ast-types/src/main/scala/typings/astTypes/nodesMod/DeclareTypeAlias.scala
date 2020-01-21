package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/nodes.TypeAlias[P]} */ trait DeclareTypeAlias extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.DeclareTypeAlias
}

object DeclareTypeAlias {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.DeclareTypeAlias): DeclareTypeAlias = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareTypeAlias]
  }
}

