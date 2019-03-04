package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait File
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: java.lang.String | scala.Null
  var program: astDashTypesLib.genKindsMod.ProgramKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.File
}

object File {
  @scala.inline
  def apply(
    program: astDashTypesLib.genKindsMod.ProgramKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.File,
    name: java.lang.String = null
  ): File = {
    val __obj = js.Dynamic.literal(program = program)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[File]
  }
}

