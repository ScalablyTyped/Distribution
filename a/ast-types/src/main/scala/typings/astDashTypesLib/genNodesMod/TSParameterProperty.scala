package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait TSParameterProperty extends js.Object {
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ]
  var parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind
  var readonly: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSParameterProperty
}

