package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPreviewRequest extends StObject {
  
  /**
    * The unique ID for the access preview.
    */
  var accessPreviewId: AccessPreviewId
  
  /**
    * The ARN of the analyzer used to generate the access preview.
    */
  var analyzerArn: AnalyzerArn
}
object GetAccessPreviewRequest {
  
  inline def apply(accessPreviewId: AccessPreviewId, analyzerArn: AnalyzerArn): GetAccessPreviewRequest = {
    val __obj = js.Dynamic.literal(accessPreviewId = accessPreviewId.asInstanceOf[js.Any], analyzerArn = analyzerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPreviewRequest]
  }
  
  extension [Self <: GetAccessPreviewRequest](x: Self) {
    
    inline def setAccessPreviewId(value: AccessPreviewId): Self = StObject.set(x, "accessPreviewId", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
  }
}
