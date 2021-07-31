package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagRef extends StObject {
  
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
    */
  var key: TagKey
  
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
    */
  var value: TagValue
}
object TagRef {
  
  @scala.inline
  def apply(key: TagKey, value: TagValue): TagRef = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRef]
  }
  
  @scala.inline
  implicit class TagRefMutableBuilder[Self <: TagRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
