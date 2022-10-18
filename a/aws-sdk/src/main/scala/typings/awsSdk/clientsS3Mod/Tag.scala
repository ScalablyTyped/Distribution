package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * Name of the object key.
    */
  var Key: ObjectKey
  
  /**
    * Value of the tag.
    */
  var Value: typings.awsSdk.clientsS3Mod.Value
}
object Tag {
  
  inline def apply(Key: ObjectKey, Value: Value): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
