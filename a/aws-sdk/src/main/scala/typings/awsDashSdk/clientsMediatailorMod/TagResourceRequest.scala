package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the playback configuration. You can get this from the response to any playback configuration request. 
    */
  var ResourceArn: __string = js.native
  /**
    * A comma-separated list of tag key:value pairs. For example: 
    {
    "Key1": "Value1",
    "Key2": "Value2"
    }
    
    */
  var Tags: __mapOf__string = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: __mapOf__string): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

