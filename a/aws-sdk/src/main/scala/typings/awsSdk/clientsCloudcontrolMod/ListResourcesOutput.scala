package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListResources again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[HandlerNextToken] = js.undefined
  
  /**
    * Information about the specified resources, including primary identifier and resource model.
    */
  var ResourceDescriptions: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ResourceDescriptions] = js.undefined
  
  /**
    * The name of the resource type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.TypeName] = js.undefined
}
object ListResourcesOutput {
  
  inline def apply(): ListResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesOutput]
  }
  
  extension [Self <: ListResourcesOutput](x: Self) {
    
    inline def setNextToken(value: HandlerNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceDescriptions(value: ResourceDescriptions): Self = StObject.set(x, "ResourceDescriptions", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptionsUndefined: Self = StObject.set(x, "ResourceDescriptions", js.undefined)
    
    inline def setResourceDescriptionsVarargs(value: ResourceDescription*): Self = StObject.set(x, "ResourceDescriptions", js.Array(value*))
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
