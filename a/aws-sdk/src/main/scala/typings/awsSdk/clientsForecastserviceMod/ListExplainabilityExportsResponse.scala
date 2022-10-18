package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExplainabilityExportsResponse extends StObject {
  
  /**
    * An array of objects that summarize the properties of each Explainability export.
    */
  var ExplainabilityExports: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ExplainabilityExports] = js.undefined
  
  /**
    * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
}
object ListExplainabilityExportsResponse {
  
  inline def apply(): ListExplainabilityExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExplainabilityExportsResponse]
  }
  
  extension [Self <: ListExplainabilityExportsResponse](x: Self) {
    
    inline def setExplainabilityExports(value: ExplainabilityExports): Self = StObject.set(x, "ExplainabilityExports", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityExportsUndefined: Self = StObject.set(x, "ExplainabilityExports", js.undefined)
    
    inline def setExplainabilityExportsVarargs(value: ExplainabilityExportSummary*): Self = StObject.set(x, "ExplainabilityExports", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
