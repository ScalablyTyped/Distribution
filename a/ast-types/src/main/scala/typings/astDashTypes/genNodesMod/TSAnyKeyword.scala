package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSAnyKeyword extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSAnyKeyword
}

object TSAnyKeyword {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.TSAnyKeyword): TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSAnyKeyword]
  }
}

