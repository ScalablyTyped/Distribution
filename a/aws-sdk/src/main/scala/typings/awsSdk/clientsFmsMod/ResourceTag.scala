package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * The resource tag key.
    */
  var Key: ResourceTagKey
  
  /**
    * The resource tag value.
    */
  var Value: js.UndefOr[ResourceTagValue] = js.undefined
}
object ResourceTag {
  
  inline def apply(Key: ResourceTagKey): ResourceTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceTag] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ResourceTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ResourceTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
