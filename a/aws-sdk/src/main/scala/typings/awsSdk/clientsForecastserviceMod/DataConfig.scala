package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataConfig extends StObject {
  
  /**
    * Additional built-in datasets like Holidays and the Weather Index.
    */
  var AdditionalDatasets: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.AdditionalDatasets] = js.undefined
  
  /**
    * Aggregation and filling options for attributes in your dataset group.
    */
  var AttributeConfigs: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.AttributeConfigs] = js.undefined
  
  /**
    * The ARN of the dataset group used to train the predictor.
    */
  var DatasetGroupArn: Arn
}
object DataConfig {
  
  inline def apply(DatasetGroupArn: Arn): DataConfig = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataConfig]
  }
  
  extension [Self <: DataConfig](x: Self) {
    
    inline def setAdditionalDatasets(value: AdditionalDatasets): Self = StObject.set(x, "AdditionalDatasets", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDatasetsUndefined: Self = StObject.set(x, "AdditionalDatasets", js.undefined)
    
    inline def setAdditionalDatasetsVarargs(value: AdditionalDataset*): Self = StObject.set(x, "AdditionalDatasets", js.Array(value*))
    
    inline def setAttributeConfigs(value: AttributeConfigs): Self = StObject.set(x, "AttributeConfigs", value.asInstanceOf[js.Any])
    
    inline def setAttributeConfigsUndefined: Self = StObject.set(x, "AttributeConfigs", js.undefined)
    
    inline def setAttributeConfigsVarargs(value: AttributeConfig*): Self = StObject.set(x, "AttributeConfigs", js.Array(value*))
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
  }
}
