package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONInput extends StObject {
  
  /**
    * The type of JSON. Valid values: Document, Lines.
    */
  var Type: js.UndefOr[JSONType] = js.undefined
}
object JSONInput {
  
  inline def apply(): JSONInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONInput] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSONType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
