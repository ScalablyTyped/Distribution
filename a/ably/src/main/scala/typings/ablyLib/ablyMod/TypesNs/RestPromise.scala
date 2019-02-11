package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestPromise extends RestBase {
  var auth: AuthPromise = js.native
  var channels: Channels[ChannelPromise] = js.native
  var push: PushPromise = js.native
  def request(method: java.lang.String, path: java.lang.String): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Any, headers: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: java.lang.String, path: java.lang.String, params: js.Any, body: js.Array[_]): js.Promise[HttpPaginatedResponse] = js.native
  def request(
    method: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    body: js.Array[_],
    headers: js.Any
  ): js.Promise[HttpPaginatedResponse] = js.native
  def stats(): js.Promise[PaginatedResult[Stats]] = js.native
  def stats(params: js.Any): js.Promise[PaginatedResult[Stats]] = js.native
  def time(): js.Promise[scala.Double] = js.native
}

