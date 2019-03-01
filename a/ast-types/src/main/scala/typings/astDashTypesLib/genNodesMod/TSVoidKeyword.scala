package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSVoidKeyword
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSVoidKeyword
}

object TSVoidKeyword {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.TSVoidKeyword): TSVoidKeyword = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[TSVoidKeyword]
  }
}

