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
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetInstanceTypesFromInstanceRequirementsResult {
  
  inline def apply(): GetInstanceTypesFromInstanceRequirementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypesFromInstanceRequirementsResult]
  }
  
  extension [Self <: GetInstanceTypesFromInstanceRequirementsResult](x: Self) {
    
    inline def setInstanceTypes(value: InstanceTypeInfoFromInstanceRequirementsSet): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceTypeInfoFromInstanceRequirements*): Self = StObject.set(x, "InstanceTypes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
