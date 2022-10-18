package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroupTrendStats extends StObject {
  
  /**
    * Contains the average of all values analyzed.
    */
  var average: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the maximum value analyzed.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the minimum value analyzed.
    */
  var min: js.UndefOr[String] = js.undefined
}
object ReportGroupTrendStats {
  
  inline def apply(): ReportGroupTrendStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportGroupTrendStats]
  }
  
  extension [Self <: ReportGroupTrendStats](x: Self) {
    
    inline def setAverage(value: String): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
