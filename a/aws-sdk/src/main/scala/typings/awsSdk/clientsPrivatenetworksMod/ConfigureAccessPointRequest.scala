package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureAccessPointRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network resource.
    */
  var accessPointArn: Arn
  
  /**
    * A Base64 encoded string of the CPI certificate associated with the CPI user who is certifying the coordinates of the network resource. 
    */
  var cpiSecretKey: js.UndefOr[ConfigureAccessPointRequestCpiSecretKeyString] = js.undefined
  
  /**
    * The CPI user ID of the CPI user who is certifying the coordinates of the network resource. 
    */
  var cpiUserId: js.UndefOr[ConfigureAccessPointRequestCpiUserIdString] = js.undefined
  
  /**
    * The CPI password associated with the CPI certificate in cpiSecretKey.
    */
  var cpiUserPassword: js.UndefOr[ConfigureAccessPointRequestCpiUserPasswordString] = js.undefined
  
  /**
    * The CPI user name of the CPI user who is certifying the coordinates of the radio unit.
    */
  var cpiUsername: js.UndefOr[ConfigureAccessPointRequestCpiUsernameString] = js.undefined
  
  /**
    * The position of the network resource.
    */
  var position: js.UndefOr[Position] = js.undefined
}
object ConfigureAccessPointRequest {
  
  inline def apply(accessPointArn: Arn): ConfigureAccessPointRequest = {
    val __obj = js.Dynamic.literal(accessPointArn = accessPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAccessPointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureAccessPointRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessPointArn(value: Arn): Self = StObject.set(x, "accessPointArn", value.asInstanceOf[js.Any])
    
    inline def setCpiSecretKey(value: ConfigureAccessPointRequestCpiSecretKeyString): Self = StObject.set(x, "cpiSecretKey", value.asInstanceOf[js.Any])
    
    inline def setCpiSecretKeyUndefined: Self = StObject.set(x, "cpiSecretKey", js.undefined)
    
    inline def setCpiUserId(value: ConfigureAccessPointRequestCpiUserIdString): Self = StObject.set(x, "cpiUserId", value.asInstanceOf[js.Any])
    
    inline def setCpiUserIdUndefined: Self = StObject.set(x, "cpiUserId", js.undefined)
    
    inline def setCpiUserPassword(value: ConfigureAccessPointRequestCpiUserPasswordString): Self = StObject.set(x, "cpiUserPassword", value.asInstanceOf[js.Any])
    
    inline def setCpiUserPasswordUndefined: Self = StObject.set(x, "cpiUserPassword", js.undefined)
    
    inline def setCpiUsername(value: ConfigureAccessPointRequestCpiUsernameString): Self = StObject.set(x, "cpiUsername", value.asInstanceOf[js.Any])
    
    inline def setCpiUsernameUndefined: Self = StObject.set(x, "cpiUsername", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
