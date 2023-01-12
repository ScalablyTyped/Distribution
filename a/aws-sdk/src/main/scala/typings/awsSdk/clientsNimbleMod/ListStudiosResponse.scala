package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudiosResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of studios.
    */
  var studios: StudioList
}
object ListStudiosResponse {
  
  inline def apply(studios: StudioList): ListStudiosResponse = {
    val __obj = js.Dynamic.literal(studios = studios.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStudiosResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudiosResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStudios(value: StudioList): Self = StObject.set(x, "studios", value.asInstanceOf[js.Any])
    
    inline def setStudiosVarargs(value: Studio*): Self = StObject.set(x, "studios", js.Array(value*))
  }
}
