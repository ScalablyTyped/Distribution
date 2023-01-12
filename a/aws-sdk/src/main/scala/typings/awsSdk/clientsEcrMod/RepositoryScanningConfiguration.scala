package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryScanningConfiguration extends StObject {
  
  /**
    * The scan filters applied to the repository.
    */
  var appliedScanFilters: js.UndefOr[ScanningRepositoryFilterList] = js.undefined
  
  /**
    * The ARN of the repository.
    */
  var repositoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The scan frequency for the repository.
    */
  var scanFrequency: js.UndefOr[ScanFrequency] = js.undefined
  
  /**
    * Whether or not scan on push is configured for the repository.
    */
  var scanOnPush: js.UndefOr[ScanOnPushFlag] = js.undefined
}
object RepositoryScanningConfiguration {
  
  inline def apply(): RepositoryScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryScanningConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryScanningConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppliedScanFilters(value: ScanningRepositoryFilterList): Self = StObject.set(x, "appliedScanFilters", value.asInstanceOf[js.Any])
    
    inline def setAppliedScanFiltersUndefined: Self = StObject.set(x, "appliedScanFilters", js.undefined)
    
    inline def setAppliedScanFiltersVarargs(value: ScanningRepositoryFilter*): Self = StObject.set(x, "appliedScanFilters", js.Array(value*))
    
    inline def setRepositoryArn(value: Arn): Self = StObject.set(x, "repositoryArn", value.asInstanceOf[js.Any])
    
    inline def setRepositoryArnUndefined: Self = StObject.set(x, "repositoryArn", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setScanFrequency(value: ScanFrequency): Self = StObject.set(x, "scanFrequency", value.asInstanceOf[js.Any])
    
    inline def setScanFrequencyUndefined: Self = StObject.set(x, "scanFrequency", js.undefined)
    
    inline def setScanOnPush(value: ScanOnPushFlag): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    
    inline def setScanOnPushUndefined: Self = StObject.set(x, "scanOnPush", js.undefined)
  }
}
