package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperiencesResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve the next set of Amazon Kendra experiences.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for one or more Amazon Kendra experiences.
    */
  var SummaryItems: js.UndefOr[ExperiencesSummaryList] = js.undefined
}
object ListExperiencesResponse {
  
  inline def apply(): ListExperiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperiencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExperiencesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaryItems(value: ExperiencesSummaryList): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: ExperiencesSummary*): Self = StObject.set(x, "SummaryItems", js.Array(value*))
  }
}
