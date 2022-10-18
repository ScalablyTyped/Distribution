package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetRelationshipSummary extends StObject {
  
  /**
    * The assets that are related through an asset hierarchy. This object is present if the relationshipType is HIERARCHY.
    */
  var hierarchyInfo: js.UndefOr[AssetHierarchyInfo] = js.undefined
  
  /**
    * The relationship type of the assets in this relationship. This value is one of the following:    HIERARCHY – The assets are related through an asset hierarchy. If you specify this relationship type, this asset relationship includes the hierarchyInfo object.  
    */
  var relationshipType: AssetRelationshipType
}
object AssetRelationshipSummary {
  
  inline def apply(relationshipType: AssetRelationshipType): AssetRelationshipSummary = {
    val __obj = js.Dynamic.literal(relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetRelationshipSummary]
  }
  
  extension [Self <: AssetRelationshipSummary](x: Self) {
    
    inline def setHierarchyInfo(value: AssetHierarchyInfo): Self = StObject.set(x, "hierarchyInfo", value.asInstanceOf[js.Any])
    
    inline def setHierarchyInfoUndefined: Self = StObject.set(x, "hierarchyInfo", js.undefined)
    
    inline def setRelationshipType(value: AssetRelationshipType): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
  }
}
