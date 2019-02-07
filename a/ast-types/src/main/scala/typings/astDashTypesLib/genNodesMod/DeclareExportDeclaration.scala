package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait DeclareExportDeclaration extends js.Object {
  var declaration: astDashTypesLib.genKindsMod.DeclareVariableKind | astDashTypesLib.genKindsMod.DeclareFunctionKind | astDashTypesLib.genKindsMod.DeclareClassKind | astDashTypesLib.genKindsMod.FlowTypeKind | scala.Null
  var default: scala.Boolean
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportDeclaration
}

