package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListS3BucketsRequest extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListS3BucketsRequest {
  
  inline def apply(): ListS3BucketsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3BucketsRequest]
  }
  
  extension [Self <: ListS3BucketsRequest](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
