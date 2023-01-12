package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionHeaderParameter extends StObject {
  
  /**
    * Specified whether the value is a secret.
    */
  var IsValueSecret: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key for the parameter.
    */
  var Key: js.UndefOr[HeaderKey] = js.undefined
  
  /**
    * The value associated with the key.
    */
  var Value: js.UndefOr[HeaderValue] = js.undefined
}
object ConnectionHeaderParameter {
  
  inline def apply(): ConnectionHeaderParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHeaderParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionHeaderParameter] (val x: Self) extends AnyVal {
    
    inline def setIsValueSecret(value: Boolean): Self = StObject.set(x, "IsValueSecret", value.asInstanceOf[js.Any])
    
    inline def setIsValueSecretUndefined: Self = StObject.set(x, "IsValueSecret", js.undefined)
    
    inline def setKey(value: HeaderKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: HeaderValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
