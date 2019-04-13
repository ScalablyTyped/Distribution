package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiveJsonSerDe extends js.Object {
  /**
    * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more information, see Class DateTimeFormat. You can also use the special value millis to parse timestamps in epoch milliseconds. If you don't specify a format, Kinesis Data Firehose uses java.sql.Timestamp::valueOf by default.
    */
  var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.undefined
}

object HiveJsonSerDe {
  @scala.inline
  def apply(TimestampFormats: ListOfNonEmptyStrings = null): HiveJsonSerDe = {
    val __obj = js.Dynamic.literal()
    if (TimestampFormats != null) __obj.updateDynamic("TimestampFormats")(TimestampFormats)
    __obj.asInstanceOf[HiveJsonSerDe]
  }
}

