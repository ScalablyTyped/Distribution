package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeprecateActivityTypeInput extends js.Object {
  /**
    * The activity type to undeprecate.
    */
  var activityType: ActivityType = js.native
  /**
    * The name of the domain of the deprecated activity type.
    */
  var domain: DomainName = js.native
}

object UndeprecateActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): UndeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UndeprecateActivityTypeInput]
  }
}

