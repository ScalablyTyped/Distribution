package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemSize extends js.Object {
  /**
    * The time at which the size of data, returned in the Value field, was determined. The value is the integer number of seconds since 1970-01-01T00:00:00Z.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsEfsMod.Timestamp] = js.undefined
  /**
    * The latest known metered size (in bytes) of data stored in the file system.
    */
  var Value: FileSystemSizeValue
  /**
    * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
    */
  var ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
  /**
    * The latest known metered size (in bytes) of data stored in the Standard storage class.
    */
  var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
}

object FileSystemSize {
  @scala.inline
  def apply(
    Value: FileSystemSizeValue,
    Timestamp: Timestamp = null,
    ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.undefined,
    ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
  ): FileSystemSize = {
    val __obj = js.Dynamic.literal(Value = Value)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (!js.isUndefined(ValueInIA)) __obj.updateDynamic("ValueInIA")(ValueInIA)
    if (!js.isUndefined(ValueInStandard)) __obj.updateDynamic("ValueInStandard")(ValueInStandard)
    __obj.asInstanceOf[FileSystemSize]
  }
}

