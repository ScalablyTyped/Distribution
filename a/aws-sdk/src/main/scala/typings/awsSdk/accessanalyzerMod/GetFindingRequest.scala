package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingRequest extends StObject {
  
  /**
    * The ARN of the analyzer that generated the finding.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * The ID of the finding to retrieve.
    */
  var id: FindingId
}
object GetFindingRequest {
  
  inline def apply(analyzerArn: AnalyzerArn, id: FindingId): GetFindingRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingRequest]
  }
  
  extension [Self <: GetFindingRequest](x: Self) {
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
