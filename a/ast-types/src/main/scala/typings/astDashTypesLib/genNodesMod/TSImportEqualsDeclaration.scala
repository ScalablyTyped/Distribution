package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSImportEqualsDeclaration extends js.Object {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var isExport: scala.Boolean
  var moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSImportEqualsDeclaration
}

