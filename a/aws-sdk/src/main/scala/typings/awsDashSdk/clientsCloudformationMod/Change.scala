package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceChange] = js.native
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.native
}

object Change {
  @scala.inline
  def apply(ResourceChange: ResourceChange = null, Type: ChangeType = null): Change = {
    val __obj = js.Dynamic.literal()
    if (ResourceChange != null) __obj.updateDynamic("ResourceChange")(ResourceChange.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

