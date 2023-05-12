package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypesFromInstanceRequirementsResult extends StObject {
  
  /**
    * The instance types with the specified instance attributes.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeInfoFromInstanceRequirementsSet] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetInstanceTypesFromInstanceRequirementsResult {
  
  inline def apply(): GetInstanceTypesFromInstanceRequirementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypesFromInstanceRequirementsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceTypesFromInstanceRequirementsResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceTypes(value: InstanceTypeInfoFromInstanceRequirementsSet): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceTypeInfoFromInstanceRequirements*): Self = StObject.set(x, "InstanceTypes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
