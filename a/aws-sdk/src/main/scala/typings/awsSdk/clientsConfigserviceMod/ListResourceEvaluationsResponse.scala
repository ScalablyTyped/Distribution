package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceEvaluationsResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a ResourceEvaluations object.
    */
  var ResourceEvaluations: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceEvaluations] = js.undefined
}
object ListResourceEvaluationsResponse {
  
  inline def apply(): ListResourceEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceEvaluationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceEvaluationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceEvaluations(value: ResourceEvaluations): Self = StObject.set(x, "ResourceEvaluations", value.asInstanceOf[js.Any])
    
    inline def setResourceEvaluationsUndefined: Self = StObject.set(x, "ResourceEvaluations", js.undefined)
    
    inline def setResourceEvaluationsVarargs(value: ResourceEvaluation*): Self = StObject.set(x, "ResourceEvaluations", js.Array(value*))
  }
}
