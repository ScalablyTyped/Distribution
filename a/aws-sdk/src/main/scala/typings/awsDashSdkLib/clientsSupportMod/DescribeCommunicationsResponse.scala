package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCommunicationsResponse extends js.Object {
  /**
    * The communications for the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.undefined
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeCommunicationsResponse {
  @scala.inline
  def apply(communications: CommunicationList = null, nextToken: NextToken = null): DescribeCommunicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (communications != null) __obj.updateDynamic("communications")(communications)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeCommunicationsResponse]
  }
}

