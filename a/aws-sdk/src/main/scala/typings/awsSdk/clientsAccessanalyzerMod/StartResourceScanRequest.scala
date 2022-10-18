package typings.awsSdk.clientsAccessanalyzerMod

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
  
  inline def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): StartResourceScanRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartResourceScanRequest]
  }
  
  extension [Self <: StartResourceScanRequest](x: Self) {
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
