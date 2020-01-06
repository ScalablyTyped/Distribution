package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidationSummary extends js.Object {
  /**
    * The time that an invalidation request was created.
    */
  var CreateTime: timestamp = js.native
  /**
    * The unique ID for an invalidation request.
    */
  var Id: String = js.native
  /**
    * The status of an invalidation request.
    */
  var Status: String = js.native
}

object InvalidationSummary {
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, Status: String): InvalidationSummary = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InvalidationSummary]
  }
}

