package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageImportJobOutputConfig extends StObject {
  
  /**
    * The package version's output configuration.
    */
  var PackageVersionOutputConfig: js.UndefOr[typings.awsSdk.clientsPanoramaMod.PackageVersionOutputConfig] = js.undefined
}
object PackageImportJobOutputConfig {
  
  inline def apply(): PackageImportJobOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageImportJobOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageImportJobOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setPackageVersionOutputConfig(value: PackageVersionOutputConfig): Self = StObject.set(x, "PackageVersionOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionOutputConfigUndefined: Self = StObject.set(x, "PackageVersionOutputConfig", js.undefined)
  }
}
