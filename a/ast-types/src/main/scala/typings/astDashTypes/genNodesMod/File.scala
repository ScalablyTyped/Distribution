package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ProgramKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait File extends ASTNode {
  var name: String | Null
  var program: ProgramKind
  var `type`: typings.astDashTypes.astDashTypesStrings.File
}

object File {
  @scala.inline
  def apply(program: ProgramKind, `type`: typings.astDashTypes.astDashTypesStrings.File, name: String = null): File = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

