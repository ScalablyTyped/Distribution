package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryScanningRule extends StObject {
  
  /**
    * The repository filters associated with the scanning configuration for a private registry.
    */
  var repositoryFilters: ScanningRepositoryFilterList
  
  /**
    * The frequency that scans are performed at for a private registry. When the ENHANCED scan type is specified, the supported scan frequencies are CONTINUOUS_SCAN and SCAN_ON_PUSH. When the BASIC scan type is specified, the SCAN_ON_PUSH and MANUAL scan frequencies are supported.
    */
  var scanFrequency: ScanFrequency
}
object RegistryScanningRule {
  
  inline def apply(repositoryFilters: ScanningRepositoryFilterList, scanFrequency: ScanFrequency): RegistryScanningRule = {
    val __obj = js.Dynamic.literal(repositoryFilters = repositoryFilters.asInstanceOf[js.Any], scanFrequency = scanFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryScanningRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryScanningRule] (val x: Self) extends AnyVal {
    
    inline def setRepositoryFilters(value: ScanningRepositoryFilterList): Self = StObject.set(x, "repositoryFilters", value.asInstanceOf[js.Any])
    
    inline def setRepositoryFiltersVarargs(value: ScanningRepositoryFilter*): Self = StObject.set(x, "repositoryFilters", js.Array(value*))
    
    inline def setScanFrequency(value: ScanFrequency): Self = StObject.set(x, "scanFrequency", value.asInstanceOf[js.Any])
  }
}
