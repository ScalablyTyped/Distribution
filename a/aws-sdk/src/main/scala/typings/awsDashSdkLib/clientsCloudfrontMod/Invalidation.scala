package typings
package awsDashSdkLib.clientsCloudfrontMod

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
  var Id: java.lang.String
  /**
    * The current invalidation information for the batch request. 
    */
  var InvalidationBatch: awsDashSdkLib.clientsCloudfrontMod.InvalidationBatch
  /**
    * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
    */
  var Status: java.lang.String
}

object Invalidation {
  @scala.inline
  def apply(
    CreateTime: timestamp,
    Id: java.lang.String,
    InvalidationBatch: InvalidationBatch,
    Status: java.lang.String
  ): Invalidation = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime, Id = Id, InvalidationBatch = InvalidationBatch, Status = Status)
  
    __obj.asInstanceOf[Invalidation]
  }
}

