package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringCsvDatasetFormat extends StObject {
  
  /**
    * Indicates if the CSV data has a header.
    */
  var Header: js.UndefOr[Boolean] = js.undefined
}
object MonitoringCsvDatasetFormat {
  
  inline def apply(): MonitoringCsvDatasetFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringCsvDatasetFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringCsvDatasetFormat] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
  }
}
