package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * A tag key, such as Stage or Name. A tag key cannot be empty. The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : / 
    */
  var Key: TagKey
  
  /**
    * An optional tag value, such as Production or test-owcm-server. The value can be a maximum of 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : / 
    */
  var Value: TagValue
}
object Tag {
  
  inline def apply(Key: TagKey, Value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
