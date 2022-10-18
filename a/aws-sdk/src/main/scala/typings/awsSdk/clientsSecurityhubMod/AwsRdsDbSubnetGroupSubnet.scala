package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSubnetGroupSubnet extends StObject {
  
  /**
    * Information about the Availability Zone for a subnet in the subnet group.
    */
  var SubnetAvailabilityZone: js.UndefOr[AwsRdsDbSubnetGroupSubnetAvailabilityZone] = js.undefined
  
  /**
    * The identifier of a subnet in the subnet group.
    */
  var SubnetIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of a subnet in the subnet group.
    */
  var SubnetStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSubnetGroupSubnet {
  
  inline def apply(): AwsRdsDbSubnetGroupSubnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnet]
  }
  
  extension [Self <: AwsRdsDbSubnetGroupSubnet](x: Self) {
    
    inline def setSubnetAvailabilityZone(value: AwsRdsDbSubnetGroupSubnetAvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetIdentifier(value: NonEmptyString): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    inline def setSubnetStatus(value: NonEmptyString): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
