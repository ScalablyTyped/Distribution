package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseStreamRetentionPeriodInput extends js.Object {
  /**
    * The new retention period of the stream, in hours. Must be less than the current retention period.
    */
  var RetentionPeriodHours: awsDashSdkLib.clientsKinesisMod.RetentionPeriodHours
  /**
    * The name of the stream to modify.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
}

object DecreaseStreamRetentionPeriodInput {
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): DecreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours, StreamName = StreamName)
  
    __obj.asInstanceOf[DecreaseStreamRetentionPeriodInput]
  }
}

