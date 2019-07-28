package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventSelectorsRequest extends js.Object {
  /**
    * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
    */
  var EventSelectors: typings.awsDashSdk.clientsCloudtrailMod.EventSelectors
  /**
    * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailName: String
}

object PutEventSelectorsRequest {
  @scala.inline
  def apply(EventSelectors: EventSelectors, TrailName: String): PutEventSelectorsRequest = {
    val __obj = js.Dynamic.literal(EventSelectors = EventSelectors, TrailName = TrailName)
  
    __obj.asInstanceOf[PutEventSelectorsRequest]
  }
}

