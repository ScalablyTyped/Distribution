package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFormatConversionConfiguration extends StObject {
  
  /**
    * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. This parameter is required if Enabled is set to true.
    */
  var InputFormatConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.InputFormatConfiguration] = js.undefined
  
  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. This parameter is required if Enabled is set to true.
    */
  var OutputFormatConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.OutputFormatConfiguration] = js.undefined
  
  /**
    * Specifies the Amazon Web Services Glue Data Catalog table that contains the column information. This parameter is required if Enabled is set to true.
    */
  var SchemaConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.SchemaConfiguration] = js.undefined
}
object DataFormatConversionConfiguration {
  
  inline def apply(): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataFormatConversionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setInputFormatConfiguration(value: InputFormatConfiguration): Self = StObject.set(x, "InputFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputFormatConfigurationUndefined: Self = StObject.set(x, "InputFormatConfiguration", js.undefined)
    
    inline def setOutputFormatConfiguration(value: OutputFormatConfiguration): Self = StObject.set(x, "OutputFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatConfigurationUndefined: Self = StObject.set(x, "OutputFormatConfiguration", js.undefined)
    
    inline def setSchemaConfiguration(value: SchemaConfiguration): Self = StObject.set(x, "SchemaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSchemaConfigurationUndefined: Self = StObject.set(x, "SchemaConfiguration", js.undefined)
  }
}
