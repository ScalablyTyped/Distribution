package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Options
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofclient extends js.Object {
  var Cancel: Instantiable1[/* message */ String, typings.adone.adoneNs.netNs.httpNs.clientNs.Cancel] = js.native
  var CancelToken: TypeofClassCancelToken = js.native
  var Client: Instantiable1[
    js.UndefOr[/* options */ Options], 
    typings.adone.adoneNs.netNs.httpNs.clientNs.Client
  ] = js.native
  val INs: js.Any = js.native
  @JSName("request")
  val request_Original: Request = js.native
  def create(): Request = js.native
  def create(options: Options): Request = js.native
  def isCancel(obj: js.Any): /* is adone.adone.net.http.client.Cancel */ Boolean = js.native
  def request(config: Options, args: js.Any*): js.Promise[js.Object] = js.native
}

