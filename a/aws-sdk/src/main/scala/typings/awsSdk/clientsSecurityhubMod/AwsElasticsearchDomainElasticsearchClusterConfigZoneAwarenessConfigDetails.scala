package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails extends StObject {
  
  /**
    * he number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
    */
  var AvailabilityZoneCount: js.UndefOr[Integer] = js.undefined
}
object AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails {
  
  inline def apply(): AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneCount(value: Integer): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
  }
}
