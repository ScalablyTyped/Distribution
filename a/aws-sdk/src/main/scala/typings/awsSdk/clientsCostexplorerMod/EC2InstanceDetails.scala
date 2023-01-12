package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2InstanceDetails extends StObject {
  
  /**
    * The Availability Zone of the recommended reservation.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of instance that Amazon Web Services recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * Determines whether the recommended reservation is dedicated or shared.
    */
  var Tenancy: js.UndefOr[GenericString] = js.undefined
}
object EC2InstanceDetails {
  
  inline def apply(): EC2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2InstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: GenericString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    inline def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    inline def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setPlatform(value: GenericString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    inline def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
    
    inline def setTenancy(value: GenericString): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
