package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredDomainDelegationInfo extends StObject {
  
  /**
    * An object that describes the state of the name server records that are automatically added to the Route 53 domain by Lightsail.
    */
  var nameServersUpdateState: js.UndefOr[NameServersUpdateState] = js.undefined
  
  /**
    * Describes the deletion state of an Amazon Route 53 hosted zone for a domain that is being automatically delegated to an Amazon Lightsail DNS zone.
    */
  var r53HostedZoneDeletionState: js.UndefOr[R53HostedZoneDeletionState] = js.undefined
}
object RegisteredDomainDelegationInfo {
  
  inline def apply(): RegisteredDomainDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredDomainDelegationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredDomainDelegationInfo] (val x: Self) extends AnyVal {
    
    inline def setNameServersUpdateState(value: NameServersUpdateState): Self = StObject.set(x, "nameServersUpdateState", value.asInstanceOf[js.Any])
    
    inline def setNameServersUpdateStateUndefined: Self = StObject.set(x, "nameServersUpdateState", js.undefined)
    
    inline def setR53HostedZoneDeletionState(value: R53HostedZoneDeletionState): Self = StObject.set(x, "r53HostedZoneDeletionState", value.asInstanceOf[js.Any])
    
    inline def setR53HostedZoneDeletionStateUndefined: Self = StObject.set(x, "r53HostedZoneDeletionState", js.undefined)
  }
}
