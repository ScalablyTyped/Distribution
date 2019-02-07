package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSLiteralType extends js.Object {
  var literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSLiteralType
}

