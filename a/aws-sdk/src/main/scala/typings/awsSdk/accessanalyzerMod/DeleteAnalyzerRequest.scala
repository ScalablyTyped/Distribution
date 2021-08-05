package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalyzerRequest extends StObject {
  
  /**
    * The name of the analyzer to delete.
    */
  var analyzerName: Name
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
}
object DeleteAnalyzerRequest {
  
  inline def apply(analyzerName: Name): DeleteAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalyzerRequest]
  }
  
  extension [Self <: DeleteAnalyzerRequest](x: Self) {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
