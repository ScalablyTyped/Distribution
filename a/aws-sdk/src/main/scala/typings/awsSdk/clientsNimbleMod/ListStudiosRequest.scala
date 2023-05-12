package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudiosRequest extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListStudiosRequest {
  
  inline def apply(): ListStudiosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudiosRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudiosRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
