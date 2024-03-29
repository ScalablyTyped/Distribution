package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroupTag extends StObject {
  
  /**
    * A tag key.
    */
  var key: TagKey
  
  /**
    * The value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}
object ResourceGroupTag {
  
  inline def apply(key: TagKey): ResourceGroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceGroupTag] (val x: Self) extends AnyVal {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
