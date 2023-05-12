package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserProperty extends StObject {
  
  /**
    * A key to be specified in UserProperty.
    */
  var key: UserPropertyKey
  
  /**
    * A value to be specified in UserProperty.
    */
  var value: UserPropertyValue
}
object UserProperty {
  
  inline def apply(key: UserPropertyKey, value: UserPropertyValue): UserProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserProperty] (val x: Self) extends AnyVal {
    
    inline def setKey(value: UserPropertyKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: UserPropertyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
