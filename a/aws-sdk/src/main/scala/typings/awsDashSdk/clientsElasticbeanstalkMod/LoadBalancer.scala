package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancer extends js.Object {
  /**
    * The name of the LoadBalancer.
    */
  var Name: js.UndefOr[ResourceId] = js.native
}

object LoadBalancer {
  @scala.inline
  def apply(Name: ResourceId = null): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancer]
  }
}

