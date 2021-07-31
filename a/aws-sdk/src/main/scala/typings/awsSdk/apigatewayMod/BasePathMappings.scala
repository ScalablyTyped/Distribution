package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePathMappings extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfBasePathMapping] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object BasePathMappings {
  
  @scala.inline
  def apply(): BasePathMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePathMappings]
  }
  
  @scala.inline
  implicit class BasePathMappingsMutableBuilder[Self <: BasePathMappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfBasePathMapping): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BasePathMapping*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
