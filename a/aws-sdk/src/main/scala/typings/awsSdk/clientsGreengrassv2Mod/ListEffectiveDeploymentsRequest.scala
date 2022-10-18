package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEffectiveDeploymentsRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: CoreDeviceThingName
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListEffectiveDeploymentsRequest {
  
  inline def apply(coreDeviceThingName: CoreDeviceThingName): ListEffectiveDeploymentsRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEffectiveDeploymentsRequest]
  }
  
  extension [Self <: ListEffectiveDeploymentsRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
