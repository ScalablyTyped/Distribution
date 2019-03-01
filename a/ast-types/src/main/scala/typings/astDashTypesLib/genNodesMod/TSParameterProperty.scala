package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait TSParameterProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ]
  var parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind
  var readonly: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind,
    readonly: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSParameterProperty,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("readonly")(readonly)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty]
  }
}

