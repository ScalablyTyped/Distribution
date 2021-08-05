package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalyzerRequest extends StObject {
  
  /**
    * The name of the analyzer retrieved.
    */
  var analyzerName: Name
}
object GetAnalyzerRequest {
  
  inline def apply(analyzerName: Name): GetAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzerRequest]
  }
  
  extension [Self <: GetAnalyzerRequest](x: Self) {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
  }
}
