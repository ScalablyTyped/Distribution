package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFailuresForLicenseConfigurationOperationsResponse extends StObject {
  
  /**
    * License configuration operations that failed.
    */
  var LicenseOperationFailureList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseOperationFailureList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFailuresForLicenseConfigurationOperationsResponse {
  
  inline def apply(): ListFailuresForLicenseConfigurationOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFailuresForLicenseConfigurationOperationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenseOperationFailureList(value: LicenseOperationFailureList): Self = StObject.set(x, "LicenseOperationFailureList", value.asInstanceOf[js.Any])
    
    inline def setLicenseOperationFailureListUndefined: Self = StObject.set(x, "LicenseOperationFailureList", js.undefined)
    
    inline def setLicenseOperationFailureListVarargs(value: LicenseOperationFailure*): Self = StObject.set(x, "LicenseOperationFailureList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
