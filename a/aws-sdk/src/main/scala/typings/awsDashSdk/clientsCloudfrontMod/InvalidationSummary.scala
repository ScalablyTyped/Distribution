package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidationSummary extends js.Object {
  /**
    * The time that an invalidation request was created.
    */
  var CreateTime: timestamp
  /**
    * The unique ID for an invalidation request.
    */
  var Id: String
  /**
    * The status of an invalidation request.
    */
  var Status: String
}

object InvalidationSummary {
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, Status: String): InvalidationSummary = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime, Id = Id, Status = Status)
  
    __obj.asInstanceOf[InvalidationSummary]
  }
}

