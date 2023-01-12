package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails extends StObject {
  
  /**
    * The number of Availability Zones that the domain uses. Valid values are 2 or 3. The default is 2.
    */
  var AvailabilityZoneCount: js.UndefOr[Integer] = js.undefined
}
object AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneCount(value: Integer): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
  }
}
