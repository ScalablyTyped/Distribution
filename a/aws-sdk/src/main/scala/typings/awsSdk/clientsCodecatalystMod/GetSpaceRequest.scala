package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpaceRequest extends StObject {
  
  /**
    * The name of the space.
    */
  var name: NameString
}
object GetSpaceRequest {
  
  inline def apply(name: NameString): GetSpaceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSpaceRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
