package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofclient extends js.Object {
  var Cancel: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, adoneLib.adoneNs.netNs.httpNs.clientNs.Cancel] = js.native
  var CancelToken: TypeofClassCancelToken = js.native
  var Client: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options], 
    adoneLib.adoneNs.netNs.httpNs.clientNs.Client
  ] = js.native
  val INs: js.Any = js.native
  @JSName("request")
  val request_Original: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Request = js.native
  def create(): adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Request = js.native
  def create(options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options): adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Request = js.native
  def isCancel(obj: js.Any): /* is adone.adone.net.http.client.Cancel */ scala.Boolean = js.native
  def request(config: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options, args: js.Any*): js.Promise[js.Object] = js.native
}

