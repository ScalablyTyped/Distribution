package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinDomainOutput extends StObject {
  
  /**
    * Indicates the status of the gateway as a member of the Active Directory domain.    ACCESS_DENIED: Indicates that the JoinDomain operation failed due to an authentication error.    DETACHED: Indicates that gateway is not joined to a domain.    JOINED: Indicates that the gateway has successfully joined a domain.    JOINING: Indicates that a JoinDomain operation is in progress.    NETWORK_ERROR: Indicates that JoinDomain operation failed due to a network or connectivity error.    TIMEOUT: Indicates that the JoinDomain operation failed because the operation didn't complete within the allotted time.    UNKNOWN_ERROR: Indicates that the JoinDomain operation failed due to another type of error.  
    */
  var ActiveDirectoryStatus: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ActiveDirectoryStatus] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object JoinDomainOutput {
  
  inline def apply(): JoinDomainOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinDomainOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinDomainOutput] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectoryStatus(value: ActiveDirectoryStatus): Self = StObject.set(x, "ActiveDirectoryStatus", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryStatusUndefined: Self = StObject.set(x, "ActiveDirectoryStatus", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
