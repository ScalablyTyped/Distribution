package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamDiscoveredAccount extends StObject {
  
  /**
    * The account ID.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region that the account information is returned from. An account can be discovered in multiple regions and will have a separate discovered account for each Region.
    */
  var DiscoveryRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery failure reason.
    */
  var FailureReason: js.UndefOr[IpamDiscoveryFailureReason] = js.undefined
  
  /**
    * The last attempted resource discovery time.
    */
  var LastAttemptedDiscoveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last successful resource discovery time.
    */
  var LastSuccessfulDiscoveryTime: js.UndefOr[js.Date] = js.undefined
}
object IpamDiscoveredAccount {
  
  inline def apply(): IpamDiscoveredAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamDiscoveredAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamDiscoveredAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDiscoveryRegion(value: String): Self = StObject.set(x, "DiscoveryRegion", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryRegionUndefined: Self = StObject.set(x, "DiscoveryRegion", js.undefined)
    
    inline def setFailureReason(value: IpamDiscoveryFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastAttemptedDiscoveryTime(value: js.Date): Self = StObject.set(x, "LastAttemptedDiscoveryTime", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptedDiscoveryTimeUndefined: Self = StObject.set(x, "LastAttemptedDiscoveryTime", js.undefined)
    
    inline def setLastSuccessfulDiscoveryTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulDiscoveryTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulDiscoveryTimeUndefined: Self = StObject.set(x, "LastSuccessfulDiscoveryTime", js.undefined)
  }
}
