package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait DeclareExportAllDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportAllDeclaration
}

object DeclareExportAllDeclaration {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportAllDeclaration,
    source: astDashTypesLib.genKindsMod.LiteralKind = null
  ): DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DeclareExportAllDeclaration]
  }
}

