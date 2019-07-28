package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivityTypeInput extends js.Object {
  /**
    * The activity type to get information about. Activity types are identified by the name and version that were supplied when the activity was registered.
    */
  var activityType: ActivityType
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName
}

object DescribeActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DescribeActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType, domain = domain)
  
    __obj.asInstanceOf[DescribeActivityTypeInput]
  }
}

