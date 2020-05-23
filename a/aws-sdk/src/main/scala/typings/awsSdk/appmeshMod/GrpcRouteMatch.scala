package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRouteMatch extends js.Object {
  /**
    * An object that represents the data to match from the request.
    */
  var metadata: js.UndefOr[GrpcRouteMetadataList] = js.native
  /**
    * The method name to match from the request. If you specify a name, you must also specify
    a serviceName.
    */
  var methodName: js.UndefOr[MethodName] = js.native
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.native
}

object GrpcRouteMatch {
  @scala.inline
  def apply(
    metadata: GrpcRouteMetadataList = null,
    methodName: MethodName = null,
    serviceName: ServiceName = null
  ): GrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRouteMatch]
  }
}

