package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Specifier, 'type'> ]: ast-types.ast-types/gen/nodes.Specifier[P]} */ trait ExportBatchSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportBatchSpecifier
}

object ExportBatchSpecifier {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.ExportBatchSpecifier): ExportBatchSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExportBatchSpecifier]
  }
}

