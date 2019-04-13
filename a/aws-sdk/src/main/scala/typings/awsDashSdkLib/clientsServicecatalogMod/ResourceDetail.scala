package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDetail extends js.Object {
  /**
    * The ARN of the resource.
    */
  var ARN: js.UndefOr[ResourceDetailARN] = js.undefined
  /**
    * The creation time of the resource.
    */
  var CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.undefined
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[ResourceDetailDescription] = js.undefined
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[ResourceDetailId] = js.undefined
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceDetailName] = js.undefined
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
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ResourceDetail]
  }
}

