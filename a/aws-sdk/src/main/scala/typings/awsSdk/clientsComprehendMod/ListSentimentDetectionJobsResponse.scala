package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSentimentDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var SentimentDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.SentimentDetectionJobPropertiesList] = js.undefined
}
object ListSentimentDetectionJobsResponse {
  
  inline def apply(): ListSentimentDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSentimentDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSentimentDetectionJobPropertiesList(value: SentimentDetectionJobPropertiesList): Self = StObject.set(x, "SentimentDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setSentimentDetectionJobPropertiesListUndefined: Self = StObject.set(x, "SentimentDetectionJobPropertiesList", js.undefined)
    
    inline def setSentimentDetectionJobPropertiesListVarargs(value: SentimentDetectionJobProperties*): Self = StObject.set(x, "SentimentDetectionJobPropertiesList", js.Array(value*))
  }
}
