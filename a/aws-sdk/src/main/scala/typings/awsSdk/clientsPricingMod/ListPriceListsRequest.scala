package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPriceListsRequest extends StObject {
  
  /**
    * The three alphabetical character ISO-4217 currency code that the Price List files are denominated in. 
    */
  var CurrencyCode: typings.awsSdk.clientsPricingMod.CurrencyCode
  
  /**
    * The date that the Price List file prices are effective from. 
    */
  var EffectiveDate: js.Date
  
  /**
    * The maximum number of results to return in the response. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPricingMod.MaxResults] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for the US East (N. Virginia) Region, use us-east-1. If nothing is specified, you retrieve price lists for all applicable Regions. The available RegionCode list can be retrieved from  GetAttributeValues  API.
    */
  var RegionCode: js.UndefOr[typings.awsSdk.clientsPricingMod.RegionCode] = js.undefined
  
  /**
    * The service code or the Savings Plan service code for the attributes that you want to retrieve. For example, to get the list of applicable Amazon EC2 price lists, use AmazonEC2. For a full list of service codes containing On-Demand and Reserved Instance (RI) pricing, use the  DescribeServices  API. To retrieve the Compute Savings Plan price lists, use ComputeSavingsPlans. To retrieve Machine Learning Savings Plans price lists, use MachineLearningSavingsPlans. 
    */
  var ServiceCode: typings.awsSdk.clientsPricingMod.ServiceCode
}
object ListPriceListsRequest {
  
  inline def apply(CurrencyCode: CurrencyCode, EffectiveDate: js.Date, ServiceCode: ServiceCode): ListPriceListsRequest = {
    val __obj = js.Dynamic.literal(CurrencyCode = CurrencyCode.asInstanceOf[js.Any], EffectiveDate = EffectiveDate.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPriceListsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPriceListsRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDate(value: js.Date): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionCode(value: RegionCode): Self = StObject.set(x, "RegionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "RegionCode", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
