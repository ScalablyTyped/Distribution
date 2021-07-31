package typings.awsSdk.apigatewayMod

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
  
  @scala.inline
  def apply(): ApiKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeys]
  }
  
  @scala.inline
  implicit class ApiKeysMutableBuilder[Self <: ApiKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfApiKey): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ApiKey*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
