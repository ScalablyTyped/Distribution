package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestPromise extends RestBase {
  var auth: AuthPromise = js.native
  var channels: Channels[ChannelPromise] = js.native
  var push: PushPromise = js.native
  def request(method: String, path: String): js.Promise[HttpPaginatedResponse] = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: js.Any
  ): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Any, headers: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Array[_]): js.Promise[HttpPaginatedResponse] = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Array[_],
    headers: js.Any
  ): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any, body: js.UndefOr[scala.Nothing], headers: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any, headers: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_]): js.Promise[HttpPaginatedResponse] = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_], headers: js.Any): js.Promise[HttpPaginatedResponse] = js.native
  def stats(): js.Promise[PaginatedResult[Stats]] = js.native
  def stats(params: js.Any): js.Promise[PaginatedResult[Stats]] = js.native
  def time(): js.Promise[Double] = js.native
}

