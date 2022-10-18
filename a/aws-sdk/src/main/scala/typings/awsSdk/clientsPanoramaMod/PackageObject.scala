package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageObject extends StObject {
  
  /**
    * The object's name.
    */
  var Name: NodePackageName
  
  /**
    * The object's package version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * The object's patch version.
    */
  var PatchVersion: NodePackagePatchVersion
}
object PackageObject {
  
  inline def apply(Name: NodePackageName, PackageVersion: NodePackageVersion, PatchVersion: NodePackagePatchVersion): PackageObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageObject]
  }
  
  extension [Self <: PackageObject](x: Self) {
    
    inline def setName(value: NodePackageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
  }
}
