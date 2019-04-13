package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partition extends js.Object {
  /**
    * The time at which the partition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the catalog database where the table in question is located.
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
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
    * The name of the table in question.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
  /**
    * The values of the partition.
    */
  var Values: js.UndefOr[ValueStringList] = js.undefined
}

object Partition {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatabaseName: NameString = null,
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Parameters: ParametersMap = null,
    StorageDescriptor: StorageDescriptor = null,
    TableName: NameString = null,
    Values: ValueStringList = null
  ): Partition = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime)
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Partition]
  }
}

