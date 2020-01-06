package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionPlacementConstraint extends js.Object {
  /**
    * A cluster query language expression to apply to the constraint. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The type of constraint. The MemberOf constraint restricts selection to be from a group of valid candidates.
    */
  var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.native
}

object TaskDefinitionPlacementConstraint {
  @scala.inline
  def apply(expression: String = null, `type`: TaskDefinitionPlacementConstraintType = null): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
}

