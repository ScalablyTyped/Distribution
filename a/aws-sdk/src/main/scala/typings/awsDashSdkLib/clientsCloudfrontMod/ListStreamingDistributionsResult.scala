package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamingDistributionsResult extends js.Object {
  /**
    * The StreamingDistributionList type. 
    */
  var StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined
}

object ListStreamingDistributionsResult {
  @scala.inline
  def apply(StreamingDistributionList: StreamingDistributionList = null): ListStreamingDistributionsResult = {
    val __obj = js.Dynamic.literal()
    if (StreamingDistributionList != null) __obj.updateDynamic("StreamingDistributionList")(StreamingDistributionList)
    __obj.asInstanceOf[ListStreamingDistributionsResult]
  }
}

