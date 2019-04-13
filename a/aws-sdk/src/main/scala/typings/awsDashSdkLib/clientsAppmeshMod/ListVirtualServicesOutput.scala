package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVirtualServicesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualServices
    request. When the results of a ListVirtualServices request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The list of existing virtual services for the specified service mesh.
    */
  var virtualServices: VirtualServiceList
}

object ListVirtualServicesOutput {
  @scala.inline
  def apply(virtualServices: VirtualServiceList, nextToken: String = null): ListVirtualServicesOutput = {
    val __obj = js.Dynamic.literal(virtualServices = virtualServices)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListVirtualServicesOutput]
  }
}

