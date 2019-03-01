package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/nodes.InterfaceDeclaration[P]} */ trait DeclareInterface
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.InterfaceDeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareInterface
}

object DeclareInterface {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.DeclareInterface): DeclareInterface = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[DeclareInterface]
  }
}

