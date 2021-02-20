package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApis extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRestApi] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object RestApis {
  
  @scala.inline
  def apply(): RestApis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApis]
  }
  
  @scala.inline
  implicit class RestApisMutableBuilder[Self <: RestApis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfRestApi): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RestApi*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
