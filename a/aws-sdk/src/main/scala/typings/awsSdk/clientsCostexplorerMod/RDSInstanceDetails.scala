package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSInstanceDetails extends StObject {
  
  /**
    * Determines whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The database edition that the recommended reservation supports.
    */
  var DatabaseEdition: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The database engine that the recommended reservation supports.
    */
  var DatabaseEngine: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
    */
  var DeploymentOption: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of instance that Amazon Web Services recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The license model that the recommended reservation supports.
    */
  var LicenseModel: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}
object RDSInstanceDetails {
  
  inline def apply(): RDSInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSInstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RDSInstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    inline def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    inline def setDatabaseEdition(value: GenericString): Self = StObject.set(x, "DatabaseEdition", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEditionUndefined: Self = StObject.set(x, "DatabaseEdition", js.undefined)
    
    inline def setDatabaseEngine(value: GenericString): Self = StObject.set(x, "DatabaseEngine", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEngineUndefined: Self = StObject.set(x, "DatabaseEngine", js.undefined)
    
    inline def setDeploymentOption(value: GenericString): Self = StObject.set(x, "DeploymentOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOptionUndefined: Self = StObject.set(x, "DeploymentOption", js.undefined)
    
    inline def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLicenseModel(value: GenericString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    inline def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
  }
}
