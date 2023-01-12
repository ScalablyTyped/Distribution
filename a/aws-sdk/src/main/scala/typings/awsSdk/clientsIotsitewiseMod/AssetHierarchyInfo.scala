package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetHierarchyInfo extends StObject {
  
  /**
    * The ID of the child asset in this asset relationship.
    */
  var childAssetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The ID of the parent asset in this asset relationship.
    */
  var parentAssetId: js.UndefOr[ID] = js.undefined
}
object AssetHierarchyInfo {
  
  inline def apply(): AssetHierarchyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetHierarchyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetHierarchyInfo] (val x: Self) extends AnyVal {
    
    inline def setChildAssetId(value: ID): Self = StObject.set(x, "childAssetId", value.asInstanceOf[js.Any])
    
    inline def setChildAssetIdUndefined: Self = StObject.set(x, "childAssetId", js.undefined)
    
    inline def setParentAssetId(value: ID): Self = StObject.set(x, "parentAssetId", value.asInstanceOf[js.Any])
    
    inline def setParentAssetIdUndefined: Self = StObject.set(x, "parentAssetId", js.undefined)
  }
}
