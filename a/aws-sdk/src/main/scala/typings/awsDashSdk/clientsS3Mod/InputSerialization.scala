package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var CSV: js.UndefOr[CSVInput] = js.native
  /**
    * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
    */
  var CompressionType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CompressionType] = js.native
  /**
    * Specifies JSON as object's input serialization format.
    */
  var JSON: js.UndefOr[JSONInput] = js.native
  /**
    * Specifies Parquet as object's input serialization format.
    */
  var Parquet: js.UndefOr[ParquetInput] = js.native
}

object InputSerialization {
  @scala.inline
  def apply(
    CSV: CSVInput = null,
    CompressionType: CompressionType = null,
    JSON: JSONInput = null,
    Parquet: ParquetInput = null
  ): InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSerialization]
  }
}

