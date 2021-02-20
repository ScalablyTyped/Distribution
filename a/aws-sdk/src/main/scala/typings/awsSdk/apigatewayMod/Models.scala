package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Models extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfModel] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object Models {
  
  @scala.inline
  def apply(): Models = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Models]
  }
  
  @scala.inline
  implicit class ModelsMutableBuilder[Self <: Models] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfModel): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Model*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
