package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalyzedResourceRequest extends StObject {
  
  /**
    * The ARN of the analyzer to retrieve information from.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * The ARN of the resource to retrieve information about.
    */
  var resourceArn: ResourceArn
}
object GetAnalyzedResourceRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): GetAnalyzedResourceRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzedResourceRequest]
  }
  
  @scala.inline
  implicit class GetAnalyzedResourceRequestMutableBuilder[Self <: GetAnalyzedResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
