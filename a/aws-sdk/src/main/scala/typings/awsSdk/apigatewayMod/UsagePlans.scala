package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlans extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfUsagePlan] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object UsagePlans {
  
  @scala.inline
  def apply(): UsagePlans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlans]
  }
  
  @scala.inline
  implicit class UsagePlansMutableBuilder[Self <: UsagePlans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfUsagePlan): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: UsagePlan*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
