package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioComponentsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of studio components.
    */
  var studioComponents: js.UndefOr[StudioComponentList] = js.undefined
}
object ListStudioComponentsResponse {
  
  inline def apply(): ListStudioComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioComponentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudioComponentsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStudioComponents(value: StudioComponentList): Self = StObject.set(x, "studioComponents", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentsUndefined: Self = StObject.set(x, "studioComponents", js.undefined)
    
    inline def setStudioComponentsVarargs(value: StudioComponent*): Self = StObject.set(x, "studioComponents", js.Array(value*))
  }
}
