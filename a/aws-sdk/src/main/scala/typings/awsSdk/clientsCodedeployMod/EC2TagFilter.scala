package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2TagFilter extends StObject {
  
  /**
    * The tag filter key.
    */
  var Key: js.UndefOr[typings.awsSdk.clientsCodedeployMod.Key] = js.undefined
  
  /**
    * The tag filter type:    KEY_ONLY: Key only.    VALUE_ONLY: Value only.    KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[EC2TagFilterType] = js.undefined
  
  /**
    * The tag filter value.
    */
  var Value: js.UndefOr[typings.awsSdk.clientsCodedeployMod.Value] = js.undefined
}
object EC2TagFilter {
  
  inline def apply(): EC2TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2TagFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setType(value: EC2TagFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
