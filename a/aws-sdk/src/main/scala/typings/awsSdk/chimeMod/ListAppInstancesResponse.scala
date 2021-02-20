package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstancesResponse extends StObject {
  
  /**
    * The information for each app instance.
    */
  var AppInstances: js.UndefOr[AppInstanceList] = js.native
  
  /**
    * The token passed by previous API requests until the maximum number of app instances is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListAppInstancesResponse {
  
  @scala.inline
  def apply(): ListAppInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstancesResponse]
  }
  
  @scala.inline
  implicit class ListAppInstancesResponseMutableBuilder[Self <: ListAppInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstances(value: AppInstanceList): Self = StObject.set(x, "AppInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstancesUndefined: Self = StObject.set(x, "AppInstances", js.undefined)
    
    @scala.inline
    def setAppInstancesVarargs(value: AppInstanceSummary*): Self = StObject.set(x, "AppInstances", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
