package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestCallbacks extends RestBase {
  var auth: AuthCallbacks = js.native
  var channels: Channels[ChannelCallbacks] = js.native
  var push: PushCallbacks = js.native
  def request(method: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any): scala.Unit = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Any): scala.Unit = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Any, headers: js.Any): scala.Unit = js.native
  def request(
    method: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    body: js.Any,
    headers: js.Any,
    callback: js.Function2[/* error */ ErrorInfo, /* response */ HttpPaginatedResponse, scala.Unit]
  ): scala.Unit = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Array[_]): scala.Unit = js.native
  def request(
    method: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    body: js.Array[_],
    headers: js.Any
  ): scala.Unit = js.native
  def request(
    method: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    body: js.Array[_],
    headers: js.Any,
    callback: js.Function2[/* error */ ErrorInfo, /* response */ HttpPaginatedResponse, scala.Unit]
  ): scala.Unit = js.native
  def stats(): scala.Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats]): scala.Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats], callback: paginatedResultCallback[Stats]): scala.Unit = js.native
  def stats(paramsOrCallback: js.Any): scala.Unit = js.native
  def stats(paramsOrCallback: js.Any, callback: paginatedResultCallback[Stats]): scala.Unit = js.native
  def time(): scala.Unit = js.native
  def time(callback: timeCallback): scala.Unit = js.native
}

