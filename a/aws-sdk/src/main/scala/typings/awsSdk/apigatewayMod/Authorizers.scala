package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizers extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfAuthorizer] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object Authorizers {
  
  @scala.inline
  def apply(): Authorizers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authorizers]
  }
  
  @scala.inline
  implicit class AuthorizersMutableBuilder[Self <: Authorizers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfAuthorizer): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Authorizer*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
