package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * The on-premises instance tag filter key.
    */
  var Key: js.UndefOr[typings.awsSdk.clientsCodedeployMod.Key] = js.undefined
  
  /**
    * The on-premises instance tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[TagFilterType] = js.undefined
  
  /**
    * The on-premises instance tag filter value.
    */
  var Value: js.UndefOr[typings.awsSdk.clientsCodedeployMod.Value] = js.undefined
}
object TagFilter {
  
  inline def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  extension [Self <: TagFilter](x: Self) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setType(value: TagFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
