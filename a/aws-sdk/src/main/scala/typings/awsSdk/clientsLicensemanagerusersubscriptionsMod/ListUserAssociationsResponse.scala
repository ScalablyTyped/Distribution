package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserAssociationsResponse extends StObject {
  
  /**
    * Metadata that describes the list user association operation.
    */
  var InstanceUserSummaries: js.UndefOr[InstanceUserSummaryList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListUserAssociationsResponse {
  
  inline def apply(): ListUserAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUserAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceUserSummaries(value: InstanceUserSummaryList): Self = StObject.set(x, "InstanceUserSummaries", value.asInstanceOf[js.Any])
    
    inline def setInstanceUserSummariesUndefined: Self = StObject.set(x, "InstanceUserSummaries", js.undefined)
    
    inline def setInstanceUserSummariesVarargs(value: InstanceUserSummary*): Self = StObject.set(x, "InstanceUserSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
