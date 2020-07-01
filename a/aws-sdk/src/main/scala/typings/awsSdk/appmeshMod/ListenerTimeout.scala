package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTimeout extends js.Object {
  var grpc: js.UndefOr[GrpcTimeout] = js.native
  var http: js.UndefOr[HttpTimeout] = js.native
  var http2: js.UndefOr[HttpTimeout] = js.native
  var tcp: js.UndefOr[TcpTimeout] = js.native
}

object ListenerTimeout {
  @scala.inline
  def apply(
    grpc: GrpcTimeout = null,
    http: HttpTimeout = null,
    http2: HttpTimeout = null,
    tcp: TcpTimeout = null
  ): ListenerTimeout = {
    val __obj = js.Dynamic.literal()
    if (grpc != null) __obj.updateDynamic("grpc")(grpc.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (http2 != null) __obj.updateDynamic("http2")(http2.asInstanceOf[js.Any])
    if (tcp != null) __obj.updateDynamic("tcp")(tcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTimeout]
  }
}

