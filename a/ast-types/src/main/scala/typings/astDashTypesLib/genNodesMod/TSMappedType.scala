package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSMappedType extends js.Object {
  var optional: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  var readonly: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSMappedType
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | scala.Null
  var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
}

