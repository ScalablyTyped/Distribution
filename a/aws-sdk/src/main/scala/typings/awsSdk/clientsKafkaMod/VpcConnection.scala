package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnection extends StObject {
  
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
    State of the Vpc Connection.
    
    */
  var State: js.UndefOr[VpcConnectionState] = js.undefined
  
  /**
    * 
    The ARN that identifies the Cluster which the Vpc Connection belongs to.
    
    */
  var TargetClusterArn: string
  
  /**
    * 
    The ARN that identifies the Vpc Connection.
    
    */
  var VpcConnectionArn: string
  
  /**
    * 
    The vpcId that belongs to the Vpc Connection.
    
    */
  var VpcId: js.UndefOr[string] = js.undefined
}
object VpcConnection {
  
  inline def apply(TargetClusterArn: string, VpcConnectionArn: string): VpcConnection = {
    val __obj = js.Dynamic.literal(TargetClusterArn = TargetClusterArn.asInstanceOf[js.Any], VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnection] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: string): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setState(value: VpcConnectionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTargetClusterArn(value: string): Self = StObject.set(x, "TargetClusterArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: string): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
