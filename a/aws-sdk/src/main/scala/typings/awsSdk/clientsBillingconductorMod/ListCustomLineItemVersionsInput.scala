package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemVersionsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the custom line item.
    */
  var Arn: CustomLineItemArn
  
  /**
    * A ListCustomLineItemVersionsFilter that specifies the billing period range in which the custom line item versions are applied.
    */
  var Filters: js.UndefOr[ListCustomLineItemVersionsFilter] = js.undefined
  
  /**
    * The maximum number of custom line item versions to retrieve.
    */
  var MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined
  
  /**
    * The pagination token that's used on subsequent calls to retrieve custom line item versions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCustomLineItemVersionsInput {
  
  inline def apply(Arn: CustomLineItemArn): ListCustomLineItemVersionsInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomLineItemVersionsInput]
  }
  
  extension [Self <: ListCustomLineItemVersionsInput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: ListCustomLineItemVersionsFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxCustomLineItemResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
