package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagOptionInput extends StObject {
  
  /**
    * The TagOption key.
    */
  var Key: TagOptionKey
  
  /**
    * The TagOption value.
    */
  var Value: TagOptionValue
}
object CreateTagOptionInput {
  
  inline def apply(Key: TagOptionKey, Value: TagOptionValue): CreateTagOptionInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagOptionInput]
  }
  
  extension [Self <: CreateTagOptionInput](x: Self) {
    
    inline def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
