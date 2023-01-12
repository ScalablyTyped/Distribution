package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItem extends StObject {
  
  /**
    * A unique ID for a RelatedItem.  Don't specify this parameter when you add a RelatedItem by using the UpdateRelatedItems API action. 
    */
  var generatedId: js.UndefOr[GeneratedId] = js.undefined
  
  /**
    * Details about the related item.
    */
  var identifier: ItemIdentifier
  
  /**
    * The title of the related item.
    */
  var title: js.UndefOr[RelatedItemTitleString] = js.undefined
}
object RelatedItem {
  
  inline def apply(identifier: ItemIdentifier): RelatedItem = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedItem] (val x: Self) extends AnyVal {
    
    inline def setGeneratedId(value: GeneratedId): Self = StObject.set(x, "generatedId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedIdUndefined: Self = StObject.set(x, "generatedId", js.undefined)
    
    inline def setIdentifier(value: ItemIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: RelatedItemTitleString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
