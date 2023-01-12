package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionOutputConfig extends StObject {
  
  /**
    * Indicates that the version is recommended for all users.
    */
  var MarkLatest: js.UndefOr[MarkLatestPatch] = js.undefined
  
  /**
    * The output's package name.
    */
  var PackageName: NodePackageName
  
  /**
    * The output's package version.
    */
  var PackageVersion: NodePackageVersion
}
object PackageVersionOutputConfig {
  
  inline def apply(PackageName: NodePackageName, PackageVersion: NodePackageVersion): PackageVersionOutputConfig = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageVersionOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setMarkLatest(value: MarkLatestPatch): Self = StObject.set(x, "MarkLatest", value.asInstanceOf[js.Any])
    
    inline def setMarkLatestUndefined: Self = StObject.set(x, "MarkLatest", js.undefined)
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
  }
}
