package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainPackageDetails extends StObject {
  
  /**
    * Name of the domain that the package is associated with.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    * State of the association.
    */
  var DomainPackageStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainPackageStatus] = js.undefined
  
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ErrorDetails] = js.undefined
  
  /**
    * Timestamp of the most recent update to the package association status.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageID] = js.undefined
  
  /**
    * User-specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageName] = js.undefined
  
  /**
    * The type of package.
    */
  var PackageType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageType] = js.undefined
  
  /**
    * The current version of the package.
    */
  var PackageVersion: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageVersion] = js.undefined
  
  /**
    * Denotes the location of the package on the OpenSearch Service cluster nodes. It's the same as synonym_path for dictionary files.
    */
  var ReferencePath: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ReferencePath] = js.undefined
}
object DomainPackageDetails {
  
  inline def apply(): DomainPackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPackageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainPackageDetails] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setDomainPackageStatus(value: DomainPackageStatus): Self = StObject.set(x, "DomainPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageStatusUndefined: Self = StObject.set(x, "DomainPackageStatus", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
    
    inline def setReferencePath(value: ReferencePath): Self = StObject.set(x, "ReferencePath", value.asInstanceOf[js.Any])
    
    inline def setReferencePathUndefined: Self = StObject.set(x, "ReferencePath", js.undefined)
  }
}
