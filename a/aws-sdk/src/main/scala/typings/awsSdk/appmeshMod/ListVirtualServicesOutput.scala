package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualServicesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualServices
    request. When the results of a ListVirtualServices request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing virtual services for the specified service mesh.
    */
  var virtualServices: VirtualServiceList = js.native
}

object ListVirtualServicesOutput {
  @scala.inline
  def apply(virtualServices: VirtualServiceList, nextToken: String = null): ListVirtualServicesOutput = {
    val __obj = js.Dynamic.literal(virtualServices = virtualServices.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualServicesOutput]
  }
}

