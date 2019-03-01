package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ImportDefaultSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.ModuleSpecifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.ImportDefaultSpecifier
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.ImportDefaultSpecifier): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
}

