package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageImportJobInputConfig extends StObject {
  
  /**
    * The package version's input configuration.
    */
  var PackageVersionInputConfig: js.UndefOr[typings.awsSdk.clientsPanoramaMod.PackageVersionInputConfig] = js.undefined
}
object PackageImportJobInputConfig {
  
  inline def apply(): PackageImportJobInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageImportJobInputConfig]
  }
  
  extension [Self <: PackageImportJobInputConfig](x: Self) {
    
    inline def setPackageVersionInputConfig(value: PackageVersionInputConfig): Self = StObject.set(x, "PackageVersionInputConfig", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionInputConfigUndefined: Self = StObject.set(x, "PackageVersionInputConfig", js.undefined)
  }
}
