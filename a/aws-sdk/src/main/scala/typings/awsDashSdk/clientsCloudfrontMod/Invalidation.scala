package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalidation extends js.Object {
  /**
    * The date and time the invalidation request was first made. 
    */
  var CreateTime: timestamp
  /**
    * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
    */
  var Id: String
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: typings.awsDashSdk.clientsCloudfrontMod.InvalidationBatch
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: String
}

object Invalidation {
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, InvalidationBatch: InvalidationBatch, Status: String): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime, Id = Id, InvalidationBatch = InvalidationBatch, Status = Status)
  
    __obj.asInstanceOf[Invalidation]
  }
}

