package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationResponse extends js.Object {
  /**
    * Describes application updates.
    */
  var ApplicationDetail: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationDetail
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail)
  
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
}

