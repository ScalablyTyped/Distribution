package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateActivityTypeInput extends js.Object {
  /**
    * The activity type to deprecate.
    */
  var activityType: ActivityType
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName
}

object DeprecateActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType, domain = domain)
  
    __obj.asInstanceOf[DeprecateActivityTypeInput]
  }
}

