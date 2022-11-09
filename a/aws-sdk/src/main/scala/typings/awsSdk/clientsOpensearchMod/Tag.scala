package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The tag key. Tag keys must be unique for the domain to which they are attached.
    */
  var Key: TagKey
  
  /**
    * The value assigned to the corresponding tag key. Tag values can be null and don't have to be unique in a tag set. For example, you can have a key value pair in a tag set of project : Trinity and cost-center : Trinity 
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
