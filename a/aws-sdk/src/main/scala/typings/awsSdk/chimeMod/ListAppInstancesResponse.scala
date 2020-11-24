package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstancesResponse extends js.Object {
  
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
  implicit class ListAppInstancesResponseOps[Self <: ListAppInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppInstancesVarargs(value: AppInstanceSummary*): Self = this.set("AppInstances", js.Array(value :_*))
    
    @scala.inline
    def setAppInstances(value: AppInstanceList): Self = this.set("AppInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstances: Self = this.set("AppInstances", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
