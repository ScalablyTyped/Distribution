package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionInput extends js.Object {
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined
  /**
    * The values of the partition. Although this parameter is not required by the SDK, you must specify this parameter for a valid input.
    */
  var Values: js.UndefOr[ValueStringList] = js.undefined
}

object PartitionInput {
  @scala.inline
  def apply(
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Parameters: ParametersMap = null,
    StorageDescriptor: StorageDescriptor = null,
    Values: ValueStringList = null
  ): PartitionInput = {
    val __obj = js.Dynamic.literal()
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime)
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[PartitionInput]
  }
}

