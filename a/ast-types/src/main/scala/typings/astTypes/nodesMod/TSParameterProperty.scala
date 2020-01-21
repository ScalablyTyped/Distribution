package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.public
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait TSParameterProperty extends ASTNode {
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var parameter: IdentifierKind | AssignmentPatternKind
  var readonly: Boolean
  var `type`: typings.astTypes.astTypesStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    parameter: IdentifierKind | AssignmentPatternKind,
    readonly: Boolean,
    `type`: typings.astTypes.astTypesStrings.TSParameterProperty,
    accessibility: public | `private` | `protected` = null
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty]
  }
}

