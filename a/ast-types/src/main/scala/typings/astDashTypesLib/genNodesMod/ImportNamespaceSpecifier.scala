package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ImportNamespaceSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.ModuleSpecifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.ImportNamespaceSpecifier
}

object ImportNamespaceSpecifier {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.ImportNamespaceSpecifier): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
}

