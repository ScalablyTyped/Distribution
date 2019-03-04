package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSImportEqualsDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var isExport: scala.Boolean
  var moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    isExport: scala.Boolean,
    moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSImportEqualsDeclaration
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id, isExport = isExport, moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

