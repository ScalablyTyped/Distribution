package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRepositoryScanningConfigurationRequest extends StObject {
  
  /**
    * One or more repository names to get the scanning configuration for.
    */
  var repositoryNames: ScanningConfigurationRepositoryNameList
}
object BatchGetRepositoryScanningConfigurationRequest {
  
  inline def apply(repositoryNames: ScanningConfigurationRepositoryNameList): BatchGetRepositoryScanningConfigurationRequest = {
    val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoryScanningConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetRepositoryScanningConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setRepositoryNames(value: ScanningConfigurationRepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value*))
  }
}
