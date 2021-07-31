package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRouteMatch extends StObject {
  
  /**
    * An object that represents the data to match from the request.
    */
  var metadata: js.UndefOr[GrpcRouteMetadataList] = js.undefined
  
  /**
    * The method name to match from the request. If you specify a name, you must also specify a serviceName.
    */
  var methodName: js.UndefOr[MethodName] = js.undefined
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.undefined
}
object GrpcRouteMatch {
  
  @scala.inline
  def apply(): GrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcRouteMatch]
  }
  
  @scala.inline
  implicit class GrpcRouteMatchMutableBuilder[Self <: GrpcRouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: GrpcRouteMetadataList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: GrpcRouteMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    @scala.inline
    def setMethodName(value: MethodName): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
