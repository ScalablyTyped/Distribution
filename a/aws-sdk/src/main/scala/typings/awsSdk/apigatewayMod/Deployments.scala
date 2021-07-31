package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployments extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDeployment] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object Deployments {
  
  @scala.inline
  def apply(): Deployments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployments]
  }
  
  @scala.inline
  implicit class DeploymentsMutableBuilder[Self <: Deployments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfDeployment): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Deployment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
