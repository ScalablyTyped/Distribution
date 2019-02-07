package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportDeclaration extends js.Object {
  var declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var default: scala.Boolean
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportDeclaration
}

