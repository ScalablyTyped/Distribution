package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpcConnection extends StObject {
  
  /**
    * 
    Information about the auth scheme of Vpc Connection.
    
    */
  var Authentication: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Creation time of the Vpc Connection.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The Owner of the Vpc Connection.
    
    */
  var Owner: js.UndefOr[string] = js.undefined
  
  /**
    * 
    State of the Vpc Connection.
    
    */
  var State: js.UndefOr[VpcConnectionState] = js.undefined
  
  /**
    * 
    The ARN that identifies the Vpc Connection.
    
    */
  var VpcConnectionArn: string
}
object ClientVpcConnection {
  
  inline def apply(VpcConnectionArn: string): ClientVpcConnection = {
    val __obj = js.Dynamic.literal(VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpcConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientVpcConnection] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: string): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOwner(value: string): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setState(value: VpcConnectionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
  }
}
