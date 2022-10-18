package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelHierarchyDefinition extends StObject {
  
  /**
    * The ID of an asset model for this hierarchy.
    */
  var childAssetModelId: ID
  
  /**
    * The name of the asset model hierarchy definition (as specified in the CreateAssetModel or UpdateAssetModel API operation).
    */
  var name: Name
}
object AssetModelHierarchyDefinition {
  
  inline def apply(childAssetModelId: ID, name: Name): AssetModelHierarchyDefinition = {
    val __obj = js.Dynamic.literal(childAssetModelId = childAssetModelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelHierarchyDefinition]
  }
  
  extension [Self <: AssetModelHierarchyDefinition](x: Self) {
    
    inline def setChildAssetModelId(value: ID): Self = StObject.set(x, "childAssetModelId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
