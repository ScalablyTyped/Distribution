package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagOptionsFilters extends StObject {
  
  /**
    * The active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}
object ListTagOptionsFilters {
  
  inline def apply(): ListTagOptionsFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsFilters]
  }
  
  extension [Self <: ListTagOptionsFilters](x: Self) {
    
    inline def setActive(value: TagOptionActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
