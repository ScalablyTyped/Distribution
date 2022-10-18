package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesIdentifiers extends StObject {
  
  var DataSource: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DataSource] = js.undefined
  
  /**
    * The format of the data, either CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  var Schema: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Schema] = js.undefined
}
object TimeSeriesIdentifiers {
  
  inline def apply(): TimeSeriesIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesIdentifiers]
  }
  
  extension [Self <: TimeSeriesIdentifiers](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
  }
}
