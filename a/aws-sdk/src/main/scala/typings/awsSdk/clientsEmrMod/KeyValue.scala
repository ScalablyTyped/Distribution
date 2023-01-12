package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValue extends StObject {
  
  /**
    * The unique identifier of a key-value pair.
    */
  var Key: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The value part of the identified key.
    */
  var Value: js.UndefOr[XmlString] = js.undefined
}
object KeyValue {
  
  inline def apply(): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    inline def setKey(value: XmlString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: XmlString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
