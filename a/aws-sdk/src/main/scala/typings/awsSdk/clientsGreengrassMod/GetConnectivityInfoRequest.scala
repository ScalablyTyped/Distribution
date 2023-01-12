package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectivityInfoRequest extends StObject {
  
  /**
    * The thing name.
    */
  var ThingName: string
}
object GetConnectivityInfoRequest {
  
  inline def apply(ThingName: string): GetConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectivityInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectivityInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
