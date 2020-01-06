package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDetail extends js.Object {
  /**
    * The ARN of the resource.
    */
  var ARN: js.UndefOr[ResourceDetailARN] = js.native
  /**
    * The creation time of the resource.
    */
  var CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.native
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[ResourceDetailDescription] = js.native
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[ResourceDetailId] = js.native
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceDetailName] = js.native
}

object ResourceDetail {
  @scala.inline
  def apply(
    ARN: ResourceDetailARN = null,
    CreatedTime: ResourceDetailCreatedTime = null,
    Description: ResourceDetailDescription = null,
    Id: ResourceDetailId = null,
    Name: ResourceDetailName = null
  ): ResourceDetail = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetail]
  }
}

