package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginGroupFailoverCriteria extends js.Object {
  /**
    * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
    */
  var StatusCodes: typings.awsDashSdk.clientsCloudfrontMod.StatusCodes
}

object OriginGroupFailoverCriteria {
  @scala.inline
  def apply(StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(StatusCodes = StatusCodes)
  
    __obj.asInstanceOf[OriginGroupFailoverCriteria]
  }
}

