package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageDetails extends StObject {
  
  /**
    * The package version.
    */
  var AvailablePackageVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    * The timestamp when the package was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ErrorDetails] = js.undefined
  
  /**
    * Date and time when the package was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * User-specified description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDescription] = js.undefined
  
  /**
    * The unique identifier of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageID] = js.undefined
  
  /**
    * The user-specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageName] = js.undefined
  
  /**
    * The current status of the package. The available options are AVAILABLE, COPYING, COPY_FAILED, VALIDATNG, VALIDATION_FAILED, DELETING, and DELETE_FAILED.
    */
  var PackageStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageStatus] = js.undefined
  
  /**
    * The type of package.
    */
  var PackageType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageType] = js.undefined
}
object PackageDetails {
  
  inline def apply(): PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailablePackageVersion(value: PackageVersion): Self = StObject.set(x, "AvailablePackageVersion", value.asInstanceOf[js.Any])
    
    inline def setAvailablePackageVersionUndefined: Self = StObject.set(x, "AvailablePackageVersion", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    inline def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setPackageStatus(value: PackageStatus): Self = StObject.set(x, "PackageStatus", value.asInstanceOf[js.Any])
    
    inline def setPackageStatusUndefined: Self = StObject.set(x, "PackageStatus", js.undefined)
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
  }
}
