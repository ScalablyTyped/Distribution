package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggersRequest extends StObject {
  
  /**
    * The name of the job to retrieve triggers for. The trigger that can start this job is returned, and if there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetTriggersRequest {
  
  inline def apply(): GetTriggersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersRequest]
  }
  
  extension [Self <: GetTriggersRequest](x: Self) {
    
    inline def setDependentJobName(value: NameString): Self = StObject.set(x, "DependentJobName", value.asInstanceOf[js.Any])
    
    inline def setDependentJobNameUndefined: Self = StObject.set(x, "DependentJobName", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
