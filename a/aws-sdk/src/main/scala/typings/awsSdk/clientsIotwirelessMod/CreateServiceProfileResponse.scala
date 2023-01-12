package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[ServiceProfileArn] = js.undefined
  
  /**
    * The ID of the new service profile.
    */
  var Id: js.UndefOr[ServiceProfileId] = js.undefined
}
object CreateServiceProfileResponse {
  
  inline def apply(): CreateServiceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceProfileArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ServiceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
