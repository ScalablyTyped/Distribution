package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartResourceScanRequest extends StObject {
  
  /**
    * The ARN of the analyzer to use to scan the policies applied to the specified resource.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * The ARN of the resource to scan.
    */
  var resourceArn: ResourceArn
}
object StartResourceScanRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): StartResourceScanRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartResourceScanRequest]
  }
  
  @scala.inline
  implicit class StartResourceScanRequestMutableBuilder[Self <: StartResourceScanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
