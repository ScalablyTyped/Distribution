package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlatformApplicationsResponse extends StObject {
  
  /**
    * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Platform applications returned when calling ListPlatformApplications action.
    */
  var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.undefined
}
object ListPlatformApplicationsResponse {
  
  inline def apply(): ListPlatformApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPlatformApplicationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPlatformApplications(value: ListOfPlatformApplications): Self = StObject.set(x, "PlatformApplications", value.asInstanceOf[js.Any])
    
    inline def setPlatformApplicationsUndefined: Self = StObject.set(x, "PlatformApplications", js.undefined)
    
    inline def setPlatformApplicationsVarargs(value: PlatformApplication*): Self = StObject.set(x, "PlatformApplications", js.Array(value*))
  }
}
