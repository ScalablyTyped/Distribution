package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringDatasetFormat extends StObject {
  
  /**
    * The CSV dataset used in the monitoring job.
    */
  var Csv: js.UndefOr[MonitoringCsvDatasetFormat] = js.undefined
  
  /**
    * The JSON dataset used in the monitoring job
    */
  var Json: js.UndefOr[MonitoringJsonDatasetFormat] = js.undefined
  
  /**
    * The Parquet dataset used in the monitoring job
    */
  var Parquet: js.UndefOr[MonitoringParquetDatasetFormat] = js.undefined
}
object MonitoringDatasetFormat {
  
  inline def apply(): MonitoringDatasetFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringDatasetFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringDatasetFormat] (val x: Self) extends AnyVal {
    
    inline def setCsv(value: MonitoringCsvDatasetFormat): Self = StObject.set(x, "Csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "Csv", js.undefined)
    
    inline def setJson(value: MonitoringJsonDatasetFormat): Self = StObject.set(x, "Json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "Json", js.undefined)
    
    inline def setParquet(value: MonitoringParquetDatasetFormat): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
    
    inline def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
  }
}
