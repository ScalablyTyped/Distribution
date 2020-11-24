package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcRouteMatch extends js.Object {
  
  /**
    * An object that represents the data to match from the request.
    */
  var metadata: js.UndefOr[GrpcRouteMetadataList] = js.native
  
  /**
    * The method name to match from the request. If you specify a name, you must also specify a serviceName.
    */
  var methodName: js.UndefOr[MethodName] = js.native
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.native
}
object GrpcRouteMatch {
  
  @scala.inline
  def apply(): GrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcRouteMatch]
  }
  
  @scala.inline
  implicit class GrpcRouteMatchOps[Self <: GrpcRouteMatch] (val x: Self) extends AnyVal {
    
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
    def setMetadataVarargs(value: GrpcRouteMetadata*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: GrpcRouteMetadataList): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMethodName(value: MethodName): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
