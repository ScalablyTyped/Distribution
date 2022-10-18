package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnalyzerResponse extends StObject {
  
  /**
    * The ARN of the analyzer that was created by the request.
    */
  var arn: js.UndefOr[AnalyzerArn] = js.undefined
}
object CreateAnalyzerResponse {
  
  inline def apply(): CreateAnalyzerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnalyzerResponse]
  }
  
  extension [Self <: CreateAnalyzerResponse](x: Self) {
    
    inline def setArn(value: AnalyzerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
