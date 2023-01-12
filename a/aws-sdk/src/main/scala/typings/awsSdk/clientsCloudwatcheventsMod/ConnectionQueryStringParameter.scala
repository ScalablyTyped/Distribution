package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionQueryStringParameter extends StObject {
  
  /**
    * Specifies whether the value is secret.
    */
  var IsValueSecret: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key for a query string parameter.
    */
  var Key: js.UndefOr[QueryStringKey] = js.undefined
  
  /**
    * The value associated with the key for the query string parameter.
    */
  var Value: js.UndefOr[QueryStringValue] = js.undefined
}
object ConnectionQueryStringParameter {
  
  inline def apply(): ConnectionQueryStringParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionQueryStringParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionQueryStringParameter] (val x: Self) extends AnyVal {
    
    inline def setIsValueSecret(value: Boolean): Self = StObject.set(x, "IsValueSecret", value.asInstanceOf[js.Any])
    
    inline def setIsValueSecretUndefined: Self = StObject.set(x, "IsValueSecret", js.undefined)
    
    inline def setKey(value: QueryStringKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: QueryStringValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
