package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributeValuesResponse extends StObject {
  
  /**
    * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetAttributeValuesResponse {
  
  inline def apply(): GetAttributeValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeValuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttributeValuesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeValues(value: AttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
    
    inline def setAttributeValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValues", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
