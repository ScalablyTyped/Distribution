package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncreaseStreamRetentionPeriodInput extends js.Object {
  /**
    * The new retention period of the stream, in hours. Must be more than the current retention period.
    */
  var RetentionPeriodHours: typings.awsDashSdk.clientsKinesisMod.RetentionPeriodHours
  /**
    * The name of the stream to modify.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object IncreaseStreamRetentionPeriodInput {
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): IncreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours, StreamName = StreamName)
  
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
  }
}

