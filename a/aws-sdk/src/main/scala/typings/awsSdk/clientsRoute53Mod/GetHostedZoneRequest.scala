package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedZoneRequest extends StObject {
  
  /**
    * The ID of the hosted zone that you want to get information about.
    */
  var Id: ResourceId
}
object GetHostedZoneRequest {
  
  inline def apply(Id: ResourceId): GetHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHostedZoneRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
