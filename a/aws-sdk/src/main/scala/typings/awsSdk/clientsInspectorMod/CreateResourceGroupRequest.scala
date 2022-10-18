package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceGroupRequest extends StObject {
  
  /**
    * A collection of keys and an array of possible values, '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'. For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
    */
  var resourceGroupTags: ResourceGroupTags
}
object CreateResourceGroupRequest {
  
  inline def apply(resourceGroupTags: ResourceGroupTags): CreateResourceGroupRequest = {
    val __obj = js.Dynamic.literal(resourceGroupTags = resourceGroupTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupRequest]
  }
  
  extension [Self <: CreateResourceGroupRequest](x: Self) {
    
    inline def setResourceGroupTags(value: ResourceGroupTags): Self = StObject.set(x, "resourceGroupTags", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupTagsVarargs(value: ResourceGroupTag*): Self = StObject.set(x, "resourceGroupTags", js.Array(value*))
  }
}
