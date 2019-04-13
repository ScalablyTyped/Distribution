package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[ResourceChange] = js.undefined
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.undefined
}

object Change {
  @scala.inline
  def apply(ResourceChange: ResourceChange = null, Type: ChangeType = null): Change = {
    val __obj = js.Dynamic.literal()
    if (ResourceChange != null) __obj.updateDynamic("ResourceChange")(ResourceChange)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

