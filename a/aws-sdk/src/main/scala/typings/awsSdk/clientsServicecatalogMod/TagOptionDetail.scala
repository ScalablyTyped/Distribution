package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOptionDetail extends StObject {
  
  /**
    * The TagOption active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  
  /**
    * The TagOption identifier.
    */
  var Id: js.UndefOr[TagOptionId] = js.undefined
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  
  /**
    * The Amazon Web Services account Id of the owner account that created the TagOption.
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Owner] = js.undefined
  
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}
object TagOptionDetail {
  
  inline def apply(): TagOptionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagOptionDetail] (val x: Self) extends AnyVal {
    
    inline def setActive(value: TagOptionActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
