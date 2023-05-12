package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfigInput extends StObject {
  
  /**
    * The location of the input data.&gt;
    */
  var DataSourceConfig: js.UndefOr[EojDataSourceConfigInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the previous Earth Observation job.
    */
  var PreviousEarthObservationJobArn: js.UndefOr[EarthObservationJobArn] = js.undefined
  
  /**
    * The structure representing the RasterDataCollection Query consisting of the Area of Interest, RasterDataCollectionArn,TimeRange and Property Filters.
    */
  var RasterDataCollectionQuery: js.UndefOr[RasterDataCollectionQueryInput] = js.undefined
}
object InputConfigInput {
  
  inline def apply(): InputConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputConfigInput] (val x: Self) extends AnyVal {
    
    inline def setDataSourceConfig(value: EojDataSourceConfigInput): Self = StObject.set(x, "DataSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfigUndefined: Self = StObject.set(x, "DataSourceConfig", js.undefined)
    
    inline def setPreviousEarthObservationJobArn(value: EarthObservationJobArn): Self = StObject.set(x, "PreviousEarthObservationJobArn", value.asInstanceOf[js.Any])
    
    inline def setPreviousEarthObservationJobArnUndefined: Self = StObject.set(x, "PreviousEarthObservationJobArn", js.undefined)
    
    inline def setRasterDataCollectionQuery(value: RasterDataCollectionQueryInput): Self = StObject.set(x, "RasterDataCollectionQuery", value.asInstanceOf[js.Any])
    
    inline def setRasterDataCollectionQueryUndefined: Self = StObject.set(x, "RasterDataCollectionQuery", js.undefined)
  }
}
