package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSInterfaceDeclaration extends TSHasOptionalTypeParameters {
  var body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
  var declare: scala.Boolean
  var `extends`: js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] | scala.Null
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceDeclaration
}

