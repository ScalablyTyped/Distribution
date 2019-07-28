package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancer extends js.Object {
  /**
    * The name of the LoadBalancer.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}

object LoadBalancer {
  @scala.inline
  def apply(Name: ResourceId = null): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[LoadBalancer]
  }
}

