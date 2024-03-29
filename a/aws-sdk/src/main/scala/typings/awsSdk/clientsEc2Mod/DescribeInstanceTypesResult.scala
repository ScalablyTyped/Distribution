package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypesResult extends StObject {
  
  /**
    * The instance type. For more information, see Instance types in the Amazon EC2 User Guide.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeInfoList] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeInstanceTypesResult {
  
  inline def apply(): DescribeInstanceTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceTypesResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceTypes(value: InstanceTypeInfoList): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceTypeInfo*): Self = StObject.set(x, "InstanceTypes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
