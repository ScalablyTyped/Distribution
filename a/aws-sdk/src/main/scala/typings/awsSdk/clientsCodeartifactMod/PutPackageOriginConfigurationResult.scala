package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPackageOriginConfigurationResult extends StObject {
  
  /**
    * A PackageOriginConfiguration object that describes the origin configuration set for the package. It contains a PackageOriginRestrictions object that describes how new versions of the package can be introduced to the repository.
    */
  var originConfiguration: js.UndefOr[PackageOriginConfiguration] = js.undefined
}
object PutPackageOriginConfigurationResult {
  
  inline def apply(): PutPackageOriginConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPackageOriginConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPackageOriginConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setOriginConfiguration(value: PackageOriginConfiguration): Self = StObject.set(x, "originConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOriginConfigurationUndefined: Self = StObject.set(x, "originConfiguration", js.undefined)
  }
}
