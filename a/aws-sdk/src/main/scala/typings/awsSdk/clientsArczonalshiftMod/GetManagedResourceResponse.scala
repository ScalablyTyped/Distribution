package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedResourceResponse extends StObject {
  
  /**
    * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
    */
  var appliedWeights: AppliedWeights
  
  /**
    * The Amazon Resource Name (ARN) for the resource.
    */
  var arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The name of the resource.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The zonal shifts that are currently active for a resource. 
    */
  var zonalShifts: ZonalShiftsInResource
}
object GetManagedResourceResponse {
  
  inline def apply(appliedWeights: AppliedWeights, zonalShifts: ZonalShiftsInResource): GetManagedResourceResponse = {
    val __obj = js.Dynamic.literal(appliedWeights = appliedWeights.asInstanceOf[js.Any], zonalShifts = zonalShifts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManagedResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setAppliedWeights(value: AppliedWeights): Self = StObject.set(x, "appliedWeights", value.asInstanceOf[js.Any])
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setZonalShifts(value: ZonalShiftsInResource): Self = StObject.set(x, "zonalShifts", value.asInstanceOf[js.Any])
    
    inline def setZonalShiftsVarargs(value: ZonalShiftInResource*): Self = StObject.set(x, "zonalShifts", js.Array(value*))
  }
}
