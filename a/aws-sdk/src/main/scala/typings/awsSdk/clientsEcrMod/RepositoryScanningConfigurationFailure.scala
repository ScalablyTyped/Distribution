package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryScanningConfigurationFailure extends StObject {
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[ScanningConfigurationFailureCode] = js.undefined
  
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[ScanningConfigurationFailureReason] = js.undefined
  
  /**
    * The name of the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object RepositoryScanningConfigurationFailure {
  
  inline def apply(): RepositoryScanningConfigurationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryScanningConfigurationFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryScanningConfigurationFailure] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: ScanningConfigurationFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: ScanningConfigurationFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
