package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyListEntry extends StObject {
  
  /**
    * ARN of the key.
    */
  var KeyArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Unique identifier of the key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object KeyListEntry {
  
  inline def apply(): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyListEntry] (val x: Self) extends AnyVal {
    
    inline def setKeyArn(value: ArnType): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "KeyArn", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
