package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePair extends StObject {
  
  /**
    * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more specific tag values.
    */
  var key: js.UndefOr[string] = js.undefined
  
  /**
    * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value can be an empty string.
    */
  var value: js.UndefOr[string] = js.undefined
}
object KeyValuePair {
  
  inline def apply(): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuePair]
  }
  
  extension [Self <: KeyValuePair](x: Self) {
    
    inline def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: string): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
