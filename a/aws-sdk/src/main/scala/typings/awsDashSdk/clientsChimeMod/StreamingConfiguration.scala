package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingConfiguration extends js.Object {
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typings.awsDashSdk.clientsChimeMod.DataRetentionInHours = js.native
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
}

object StreamingConfiguration {
  @scala.inline
  def apply(DataRetentionInHours: DataRetentionInHours, Disabled: js.UndefOr[scala.Boolean] = js.undefined): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
}

