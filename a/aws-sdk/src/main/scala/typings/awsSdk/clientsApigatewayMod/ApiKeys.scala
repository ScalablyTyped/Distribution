package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeys extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfApiKey] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * A list of warning messages logged during the import of API keys when the failOnWarnings option is set to true.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}
object ApiKeys {
  
  inline def apply(): ApiKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiKeys] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListOfApiKey): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ApiKey*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
