package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommendationReportGenerationRequest extends StObject {
  
  /**
    *  Groups the resources in the recommendation report with a unique name. 
    */
  var groupIdFilter: js.UndefOr[GroupIds] = js.undefined
  
  /**
    *  The output format for the recommendation report file. The default format is Microsoft Excel. 
    */
  var outputFormat: js.UndefOr[OutputFormat] = js.undefined
}
object StartRecommendationReportGenerationRequest {
  
  inline def apply(): StartRecommendationReportGenerationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecommendationReportGenerationRequest]
  }
  
  extension [Self <: StartRecommendationReportGenerationRequest](x: Self) {
    
    inline def setGroupIdFilter(value: GroupIds): Self = StObject.set(x, "groupIdFilter", value.asInstanceOf[js.Any])
    
    inline def setGroupIdFilterUndefined: Self = StObject.set(x, "groupIdFilter", js.undefined)
    
    inline def setGroupIdFilterVarargs(value: Group*): Self = StObject.set(x, "groupIdFilter", js.Array(value*))
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
  }
}
