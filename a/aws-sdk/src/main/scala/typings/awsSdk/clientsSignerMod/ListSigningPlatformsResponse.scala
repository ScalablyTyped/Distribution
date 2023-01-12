package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSigningPlatformsResponse extends StObject {
  
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all platforms that match the request parameters.
    */
  var platforms: js.UndefOr[SigningPlatforms] = js.undefined
}
object ListSigningPlatformsResponse {
  
  inline def apply(): ListSigningPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningPlatformsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSigningPlatformsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPlatforms(value: SigningPlatforms): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: SigningPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
