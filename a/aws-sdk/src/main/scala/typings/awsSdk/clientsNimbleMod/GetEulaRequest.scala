package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEulaRequest extends StObject {
  
  /**
    * The EULA ID.
    */
  var eulaId: String
}
object GetEulaRequest {
  
  inline def apply(eulaId: String): GetEulaRequest = {
    val __obj = js.Dynamic.literal(eulaId = eulaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEulaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEulaRequest] (val x: Self) extends AnyVal {
    
    inline def setEulaId(value: String): Self = StObject.set(x, "eulaId", value.asInstanceOf[js.Any])
  }
}
