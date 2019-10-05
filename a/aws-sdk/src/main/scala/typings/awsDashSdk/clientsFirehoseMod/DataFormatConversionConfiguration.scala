package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFormatConversionConfiguration extends js.Object {
  /**
    * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON.
    */
  var InputFormatConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.InputFormatConfiguration] = js.undefined
  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format.
    */
  var OutputFormatConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.OutputFormatConfiguration] = js.undefined
  /**
    * Specifies the AWS Glue Data Catalog table that contains the column information.
    */
  var SchemaConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.SchemaConfiguration] = js.undefined
}

object DataFormatConversionConfiguration {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    InputFormatConfiguration: InputFormatConfiguration = null,
    OutputFormatConfiguration: OutputFormatConfiguration = null,
    SchemaConfiguration: SchemaConfiguration = null
  ): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (InputFormatConfiguration != null) __obj.updateDynamic("InputFormatConfiguration")(InputFormatConfiguration)
    if (OutputFormatConfiguration != null) __obj.updateDynamic("OutputFormatConfiguration")(OutputFormatConfiguration)
    if (SchemaConfiguration != null) __obj.updateDynamic("SchemaConfiguration")(SchemaConfiguration)
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
}

