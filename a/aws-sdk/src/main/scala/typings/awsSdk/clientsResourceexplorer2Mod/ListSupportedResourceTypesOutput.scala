package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSupportedResourceTypesOutput extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of resource types supported by Resource Explorer.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
}
object ListSupportedResourceTypesOutput {
  
  inline def apply(): ListSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSupportedResourceTypesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSupportedResourceTypesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceTypes(value: ResourceTypeList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: SupportedResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
