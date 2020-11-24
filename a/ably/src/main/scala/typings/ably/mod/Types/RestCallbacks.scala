package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestCallbacks extends RestBase {
  
  var auth: AuthCallbacks = js.native
  
  var channels: Channels[ChannelCallbacks] = js.native
  
  var push: PushCallbacks = js.native
  
  def request(method: String, path: String): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: js.Any
  ): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Any,
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Any, headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Any,
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.UndefOr[scala.Nothing], body: js.Array[_]): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Array[_],
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Array[_],
    headers: js.Any
  ): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Array[_],
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.UndefOr[scala.Nothing], headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.UndefOr[scala.Nothing],
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Any,
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any, headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Any,
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_]): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Array[_],
    headers: js.UndefOr[scala.Nothing],
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_], headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Array[_],
    headers: js.Any,
    callback: StandardCallback[HttpPaginatedResponse]
  ): Unit = js.native
  
  def stats(): Unit = js.native
  def stats(paramsOrCallback: js.UndefOr[scala.Nothing], callback: paginatedResultCallback[Stats]): Unit = js.native
  def stats(paramsOrCallback: js.Any): Unit = js.native
  def stats(paramsOrCallback: js.Any, callback: paginatedResultCallback[Stats]): Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats]): Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats], callback: paginatedResultCallback[Stats]): Unit = js.native
  
  def time(): Unit = js.native
  def time(callback: timeCallback): Unit = js.native
}
