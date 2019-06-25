package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComponentResponse extends js.Object {
  var ApplicationComponent: js.UndefOr[ApplicationComponent] = js.undefined
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[ResourceList] = js.undefined
}

object DescribeComponentResponse {
  @scala.inline
  def apply(ApplicationComponent: ApplicationComponent = null, ResourceList: ResourceList = null): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationComponent != null) __obj.updateDynamic("ApplicationComponent")(ApplicationComponent)
    if (ResourceList != null) __obj.updateDynamic("ResourceList")(ResourceList)
    __obj.asInstanceOf[DescribeComponentResponse]
  }
}

