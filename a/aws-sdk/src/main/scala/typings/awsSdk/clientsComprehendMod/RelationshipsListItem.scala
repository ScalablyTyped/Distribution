package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipsListItem extends StObject {
  
  /**
    * Identifers of the child blocks.
    */
  var Ids: js.UndefOr[StringList] = js.undefined
  
  /**
    * Only supported relationship is a child relationship.
    */
  var Type: js.UndefOr[RelationshipType] = js.undefined
}
object RelationshipsListItem {
  
  inline def apply(): RelationshipsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipsListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipsListItem] (val x: Self) extends AnyVal {
    
    inline def setIds(value: StringList): Self = StObject.set(x, "Ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "Ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "Ids", js.Array(value*))
    
    inline def setType(value: RelationshipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
