package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var BucketColumns: js.UndefOr[NameStringList] = js.undefined
  /**
    * A list of the Columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.undefined
  /**
    *  True if the data in the table is compressed, or False if not.
    */
  var Compressed: js.UndefOr[Boolean] = js.undefined
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var InputFormat: js.UndefOr[FormatString] = js.undefined
  /**
    * The physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var Location: js.UndefOr[LocationString] = js.undefined
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var NumberOfBuckets: js.UndefOr[Integer] = js.undefined
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var OutputFormat: js.UndefOr[FormatString] = js.undefined
  /**
    * The user-supplied properties in key-value form.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  /**
    * The serialization/deserialization (SerDe) information.
    */
  var SerdeInfo: js.UndefOr[SerDeInfo] = js.undefined
  /**
    * The information about values that appear frequently in a column (skewed values).
    */
  var SkewedInfo: js.UndefOr[typings.awsDashSdk.clientsGlueMod.SkewedInfo] = js.undefined
  /**
    * A list specifying the sort order of each bucket in the table.
    */
  var SortColumns: js.UndefOr[OrderList] = js.undefined
  /**
    *  True if the table data is stored in subdirectories, or False if not.
    */
  var StoredAsSubDirectories: js.UndefOr[Boolean] = js.undefined
}

object StorageDescriptor {
  @scala.inline
  def apply(
    BucketColumns: NameStringList = null,
    Columns: ColumnList = null,
    Compressed: js.UndefOr[scala.Boolean] = js.undefined,
    InputFormat: FormatString = null,
    Location: LocationString = null,
    NumberOfBuckets: Int | Double = null,
    OutputFormat: FormatString = null,
    Parameters: ParametersMap = null,
    SerdeInfo: SerDeInfo = null,
    SkewedInfo: SkewedInfo = null,
    SortColumns: OrderList = null,
    StoredAsSubDirectories: js.UndefOr[scala.Boolean] = js.undefined
  ): StorageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (BucketColumns != null) __obj.updateDynamic("BucketColumns")(BucketColumns)
    if (Columns != null) __obj.updateDynamic("Columns")(Columns)
    if (!js.isUndefined(Compressed)) __obj.updateDynamic("Compressed")(Compressed)
    if (InputFormat != null) __obj.updateDynamic("InputFormat")(InputFormat)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (NumberOfBuckets != null) __obj.updateDynamic("NumberOfBuckets")(NumberOfBuckets.asInstanceOf[js.Any])
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (SerdeInfo != null) __obj.updateDynamic("SerdeInfo")(SerdeInfo)
    if (SkewedInfo != null) __obj.updateDynamic("SkewedInfo")(SkewedInfo)
    if (SortColumns != null) __obj.updateDynamic("SortColumns")(SortColumns)
    if (!js.isUndefined(StoredAsSubDirectories)) __obj.updateDynamic("StoredAsSubDirectories")(StoredAsSubDirectories)
    __obj.asInstanceOf[StorageDescriptor]
  }
}

