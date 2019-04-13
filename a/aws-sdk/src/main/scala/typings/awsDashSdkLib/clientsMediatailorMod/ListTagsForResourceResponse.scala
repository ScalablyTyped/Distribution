package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * A comma-separated list of tag key:value pairs. For example: 
    {
    "Key1": "Value1",
    "Key2": "Value2"
    }
    
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: __mapOf__string = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

