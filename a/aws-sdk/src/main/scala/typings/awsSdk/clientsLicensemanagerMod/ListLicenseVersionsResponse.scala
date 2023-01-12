package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseVersionsResponse extends StObject {
  
  /**
    * License details.
    */
  var Licenses: js.UndefOr[LicenseList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseVersionsResponse {
  
  inline def apply(): ListLicenseVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLicenseVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setLicenses(value: LicenseList): Self = StObject.set(x, "Licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "Licenses", js.undefined)
    
    inline def setLicensesVarargs(value: License*): Self = StObject.set(x, "Licenses", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
