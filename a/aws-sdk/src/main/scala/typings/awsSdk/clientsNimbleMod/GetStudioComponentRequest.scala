package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioComponentRequest extends StObject {
  
  /**
    * The studio component ID.
    */
  var studioComponentId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStudioComponentRequest {
  
  inline def apply(studioComponentId: String, studioId: String): GetStudioComponentRequest = {
    val __obj = js.Dynamic.literal(studioComponentId = studioComponentId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStudioComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStudioComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setStudioComponentId(value: String): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
