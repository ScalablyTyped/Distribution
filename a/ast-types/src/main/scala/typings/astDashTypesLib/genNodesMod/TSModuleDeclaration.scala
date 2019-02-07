package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSModuleDeclaration extends js.Object {
  var body: astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind | scala.Null
  var declare: scala.Boolean
  var global: scala.Boolean
  var id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleDeclaration
}

