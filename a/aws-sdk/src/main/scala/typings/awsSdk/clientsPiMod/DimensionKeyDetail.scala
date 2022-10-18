package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionKeyDetail extends StObject {
  
  /**
    * The full name of the dimension. The full name includes the group name and key name. The following values are valid:    db.query.statement (Amazon DocumentDB)    db.sql.statement (Amazon RDS and Aurora)  
    */
  var Dimension: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the dimension detail data. Possible values include the following:    AVAILABLE - The dimension detail data is ready to be retrieved.    PROCESSING - The dimension detail data isn't ready to be retrieved because more processing time is required. If the requested detail data has the status PROCESSING, Performance Insights returns the truncated query.    UNAVAILABLE - The dimension detail data could not be collected successfully.  
    */
  var Status: js.UndefOr[DetailStatus] = js.undefined
  
  /**
    * The value of the dimension detail data. Depending on the return status, this value is either the full or truncated SQL query for the following dimensions:    db.query.statement (Amazon DocumentDB)    db.sql.statement (Amazon RDS and Aurora)  
    */
  var Value: js.UndefOr[String] = js.undefined
}
object DimensionKeyDetail {
  
  inline def apply(): DimensionKeyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionKeyDetail]
  }
  
  extension [Self <: DimensionKeyDetail](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "Dimension", js.undefined)
    
    inline def setStatus(value: DetailStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
