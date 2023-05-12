package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectRequest extends StObject {
  
  /**
    * The name of the project in the space.
    */
  var name: NameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object GetProjectRequest {
  
  inline def apply(name: NameString, spaceName: NameString): GetProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
