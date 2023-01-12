package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagKeyOnly extends StObject {
  
  /**
    * The name of the key.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
}
object TagKeyOnly {
  
  inline def apply(): TagKeyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKeyOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagKeyOnly] (val x: Self) extends AnyVal {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
