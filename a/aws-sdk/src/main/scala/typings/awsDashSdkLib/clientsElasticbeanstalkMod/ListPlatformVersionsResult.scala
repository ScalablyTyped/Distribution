package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPlatformVersionsResult extends js.Object {
  /**
    * The starting index into the remaining list of platforms. if this value is not null, you can use it in a subsequent ListPlatformVersion call. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * Detailed information about the platforms.
    */
  var PlatformSummaryList: js.UndefOr[PlatformSummaryList] = js.undefined
}

object ListPlatformVersionsResult {
  @scala.inline
  def apply(NextToken: Token = null, PlatformSummaryList: PlatformSummaryList = null): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PlatformSummaryList != null) __obj.updateDynamic("PlatformSummaryList")(PlatformSummaryList)
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
}

