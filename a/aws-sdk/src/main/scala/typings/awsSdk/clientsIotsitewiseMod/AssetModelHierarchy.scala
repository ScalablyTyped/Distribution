package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelHierarchy extends StObject {
  
  /**
    * The ID of the asset model. All assets in this hierarchy must be instances of the childAssetModelId asset model.
    */
  var childAssetModelId: ID
  
  /**
    * The ID of the asset model hierarchy. This ID is a hierarchyId.
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The name of the asset model hierarchy that you specify by using the CreateAssetModel or UpdateAssetModel API operation.
    */
  var name: Name
}
object AssetModelHierarchy {
  
  inline def apply(childAssetModelId: ID, name: Name): AssetModelHierarchy = {
    val __obj = js.Dynamic.literal(childAssetModelId = childAssetModelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetModelHierarchy] (val x: Self) extends AnyVal {
    
    inline def setChildAssetModelId(value: ID): Self = StObject.set(x, "childAssetModelId", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
