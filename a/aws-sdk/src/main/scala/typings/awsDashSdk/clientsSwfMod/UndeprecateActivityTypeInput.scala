package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeprecateActivityTypeInput extends js.Object {
  /**
    * The activity type to undeprecate.
    */
  var activityType: ActivityType
  /**
    * The name of the domain of the deprecated activity type.
    */
  var domain: DomainName
}

object UndeprecateActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): UndeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType, domain = domain)
  
    __obj.asInstanceOf[UndeprecateActivityTypeInput]
  }
}

