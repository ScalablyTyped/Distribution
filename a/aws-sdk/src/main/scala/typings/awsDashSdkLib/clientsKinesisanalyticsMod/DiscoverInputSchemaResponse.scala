package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverInputSchemaResponse extends js.Object {
  /**
    * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.undefined
  /**
    * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
    */
  var ParsedInputRecords: js.UndefOr[ParsedInputRecords] = js.undefined
  /**
    * Stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
    */
  var ProcessedInputRecords: js.UndefOr[ProcessedInputRecords] = js.undefined
  /**
    * Raw stream data that was sampled to infer the schema.
    */
  var RawInputRecords: js.UndefOr[RawInputRecords] = js.undefined
}

object DiscoverInputSchemaResponse {
  @scala.inline
  def apply(
    InputSchema: SourceSchema = null,
    ParsedInputRecords: ParsedInputRecords = null,
    ProcessedInputRecords: ProcessedInputRecords = null,
    RawInputRecords: RawInputRecords = null
  ): DiscoverInputSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (InputSchema != null) __obj.updateDynamic("InputSchema")(InputSchema)
    if (ParsedInputRecords != null) __obj.updateDynamic("ParsedInputRecords")(ParsedInputRecords)
    if (ProcessedInputRecords != null) __obj.updateDynamic("ProcessedInputRecords")(ProcessedInputRecords)
    if (RawInputRecords != null) __obj.updateDynamic("RawInputRecords")(RawInputRecords)
    __obj.asInstanceOf[DiscoverInputSchemaResponse]
  }
}

