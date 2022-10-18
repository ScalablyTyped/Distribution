package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudiosRequest extends StObject {
  
  /**
    * The token to request the next page of results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListStudiosRequest {
  
  inline def apply(): ListStudiosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudiosRequest]
  }
  
  extension [Self <: ListStudiosRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
