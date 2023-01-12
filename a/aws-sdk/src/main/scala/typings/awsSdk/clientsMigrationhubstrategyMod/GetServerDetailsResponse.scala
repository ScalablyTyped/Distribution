package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServerDetailsResponse extends StObject {
  
  /**
    *  The associated application group the server belongs to, as defined in AWS Application Discovery Service. 
    */
  var associatedApplications: js.UndefOr[AssociatedApplications] = js.undefined
  
  /**
    *  The token you use to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  Detailed information about the server. 
    */
  var serverDetail: js.UndefOr[ServerDetail] = js.undefined
}
object GetServerDetailsResponse {
  
  inline def apply(): GetServerDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServerDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociatedApplications(value: AssociatedApplications): Self = StObject.set(x, "associatedApplications", value.asInstanceOf[js.Any])
    
    inline def setAssociatedApplicationsUndefined: Self = StObject.set(x, "associatedApplications", js.undefined)
    
    inline def setAssociatedApplicationsVarargs(value: AssociatedApplication*): Self = StObject.set(x, "associatedApplications", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServerDetail(value: ServerDetail): Self = StObject.set(x, "serverDetail", value.asInstanceOf[js.Any])
    
    inline def setServerDetailUndefined: Self = StObject.set(x, "serverDetail", js.undefined)
  }
}
