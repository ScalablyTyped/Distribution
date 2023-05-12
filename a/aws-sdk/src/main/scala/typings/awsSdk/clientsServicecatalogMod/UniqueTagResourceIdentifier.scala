package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueTagResourceIdentifier extends StObject {
  
  /**
    *  A unique key that's attached to a resource. 
    */
  var Key: js.UndefOr[UniqueTagKey] = js.undefined
  
  /**
    *  A unique value that's attached to a resource. 
    */
  var Value: js.UndefOr[UniqueTagValue] = js.undefined
}
object UniqueTagResourceIdentifier {
  
  inline def apply(): UniqueTagResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueTagResourceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueTagResourceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setKey(value: UniqueTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: UniqueTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
