package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ImportDeclaration extends js.Object {
  var importKind: astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type`
  var source: astDashTypesLib.genKindsMod.LiteralKind
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ImportDeclaration
}

