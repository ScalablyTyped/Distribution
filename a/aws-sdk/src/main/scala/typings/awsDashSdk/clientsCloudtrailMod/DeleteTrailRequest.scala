package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrailRequest extends js.Object {
  /**
    * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is: arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var Name: String
}

object DeleteTrailRequest {
  @scala.inline
  def apply(Name: String): DeleteTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteTrailRequest]
  }
}

