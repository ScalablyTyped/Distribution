package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualServicesOutput extends js.Object {
  
  /**
    * The nextToken value to include in a future ListVirtualServices request. When the results of a ListVirtualServices request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of existing virtual services for the specified service mesh.
    */
  var virtualServices: VirtualServiceList = js.native
}
object ListVirtualServicesOutput {
  
  @scala.inline
  def apply(virtualServices: VirtualServiceList): ListVirtualServicesOutput = {
    val __obj = js.Dynamic.literal(virtualServices = virtualServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualServicesOutput]
  }
  
  @scala.inline
  implicit class ListVirtualServicesOutputOps[Self <: ListVirtualServicesOutput] (val x: Self) extends AnyVal {
    
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
    def setVirtualServicesVarargs(value: VirtualServiceRef*): Self = this.set("virtualServices", js.Array(value :_*))
    
    @scala.inline
    def setVirtualServices(value: VirtualServiceList): Self = this.set("virtualServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
