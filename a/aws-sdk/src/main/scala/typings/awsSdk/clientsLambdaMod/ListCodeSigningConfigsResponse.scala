package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeSigningConfigsResponse extends StObject {
  
  /**
    * The code signing configurations
    */
  var CodeSigningConfigs: js.UndefOr[CodeSigningConfigList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListCodeSigningConfigsResponse {
  
  inline def apply(): ListCodeSigningConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCodeSigningConfigsResponse]
  }
  
  extension [Self <: ListCodeSigningConfigsResponse](x: Self) {
    
    inline def setCodeSigningConfigs(value: CodeSigningConfigList): Self = StObject.set(x, "CodeSigningConfigs", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningConfigsUndefined: Self = StObject.set(x, "CodeSigningConfigs", js.undefined)
    
    inline def setCodeSigningConfigsVarargs(value: CodeSigningConfig*): Self = StObject.set(x, "CodeSigningConfigs", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
