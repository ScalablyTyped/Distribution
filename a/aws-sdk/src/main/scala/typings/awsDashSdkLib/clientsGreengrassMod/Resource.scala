package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The resource ID, used to refer to a resource in the Lambda function configuration. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The descriptive resource name, which is displayed on the AWS IoT Greengrass console. Max length 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * A container of data for all resource types.
    */
  var ResourceDataContainer: js.UndefOr[ResourceDataContainer] = js.undefined
}

object Resource {
  @scala.inline
  def apply(Id: __string = null, Name: __string = null, ResourceDataContainer: ResourceDataContainer = null): Resource = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ResourceDataContainer != null) __obj.updateDynamic("ResourceDataContainer")(ResourceDataContainer)
    __obj.asInstanceOf[Resource]
  }
}

