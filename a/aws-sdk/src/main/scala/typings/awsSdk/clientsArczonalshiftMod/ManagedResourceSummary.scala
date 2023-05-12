package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedResourceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the managed resource.
    */
  var arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The Availability Zones that a resource is deployed in.
    */
  var availabilityZones: AvailabilityZones
  
  /**
    * The name of the managed resource.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}
object ManagedResourceSummary {
  
  inline def apply(availabilityZones: AvailabilityZones): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedResourceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedResourceSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "availabilityZones", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
