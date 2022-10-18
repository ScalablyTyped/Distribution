package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInsightRequest extends StObject {
  
  /**
    * The updated filters that define this insight.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined
  
  /**
    * The updated GroupBy attribute that defines this insight.
    */
  var GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the insight that you want to update.
    */
  var InsightArn: NonEmptyString
  
  /**
    * The updated name for the insight.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateInsightRequest {
  
  inline def apply(InsightArn: NonEmptyString): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInsightRequest]
  }
  
  extension [Self <: UpdateInsightRequest](x: Self) {
    
    inline def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setGroupByAttribute(value: NonEmptyString): Self = StObject.set(x, "GroupByAttribute", value.asInstanceOf[js.Any])
    
    inline def setGroupByAttributeUndefined: Self = StObject.set(x, "GroupByAttribute", js.undefined)
    
    inline def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
