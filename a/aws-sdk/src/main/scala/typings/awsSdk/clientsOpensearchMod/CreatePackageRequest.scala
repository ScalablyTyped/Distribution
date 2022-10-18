package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageRequest extends StObject {
  
  /**
    * Description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDescription] = js.undefined
  
  /**
    * Unique identifier for the package.
    */
  var PackageName: typings.awsSdk.clientsOpensearchMod.PackageName
  
  /**
    * The Amazon S3 location from which to import the package. 
    */
  var PackageSource: typings.awsSdk.clientsOpensearchMod.PackageSource
  
  /**
    * Type of package. Currently supports only TXT-DICTIONARY.
    */
  var PackageType: typings.awsSdk.clientsOpensearchMod.PackageType
}
object CreatePackageRequest {
  
  inline def apply(PackageName: PackageName, PackageSource: PackageSource, PackageType: PackageType): CreatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any], PackageType = PackageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageRequest]
  }
  
  extension [Self <: CreatePackageRequest](x: Self) {
    
    inline def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    inline def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
  }
}
