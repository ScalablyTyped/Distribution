package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * The key that's associated with the tag. 
    */
  var Key: ResourceTagKey
  
  /**
    * The value that's associated with the tag. 
    */
  var Value: ResourceTagValue
}
object ResourceTag {
  
  inline def apply(Key: ResourceTagKey, Value: ResourceTagValue): ResourceTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  
  extension [Self <: ResourceTag](x: Self) {
    
    inline def setKey(value: ResourceTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ResourceTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
