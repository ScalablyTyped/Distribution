package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitledApplicationsResult extends StObject {
  
  /**
    * The entitled applications.
    */
  var EntitledApplications: js.UndefOr[EntitledApplicationList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntitledApplicationsResult {
  
  inline def apply(): ListEntitledApplicationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitledApplicationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntitledApplicationsResult] (val x: Self) extends AnyVal {
    
    inline def setEntitledApplications(value: EntitledApplicationList): Self = StObject.set(x, "EntitledApplications", value.asInstanceOf[js.Any])
    
    inline def setEntitledApplicationsUndefined: Self = StObject.set(x, "EntitledApplications", js.undefined)
    
    inline def setEntitledApplicationsVarargs(value: EntitledApplication*): Self = StObject.set(x, "EntitledApplications", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
