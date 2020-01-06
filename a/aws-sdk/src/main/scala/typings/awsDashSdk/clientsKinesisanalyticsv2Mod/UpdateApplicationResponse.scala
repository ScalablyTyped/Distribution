package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResponse extends js.Object {
  /**
    * Describes application updates.
    */
  var ApplicationDetail: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationDetail = js.native
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
}

