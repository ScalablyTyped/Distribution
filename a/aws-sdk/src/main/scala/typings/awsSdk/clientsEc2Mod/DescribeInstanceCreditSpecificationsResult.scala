package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceCreditSpecificationsResult extends StObject {
  
  /**
    * Information about the credit option for CPU usage of an instance.
    */
  var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInstanceCreditSpecificationsResult {
  
  inline def apply(): DescribeInstanceCreditSpecificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceCreditSpecificationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceCreditSpecificationsResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceCreditSpecifications(value: InstanceCreditSpecificationList): Self = StObject.set(x, "InstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "InstanceCreditSpecifications", js.undefined)
    
    inline def setInstanceCreditSpecificationsVarargs(value: InstanceCreditSpecification*): Self = StObject.set(x, "InstanceCreditSpecifications", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
