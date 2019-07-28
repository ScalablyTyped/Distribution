package typings.adone.adoneNs.netNs.httpNs.clientNs

import typings.adone.Anon_BufferResponseType
import typings.adone.Anon_Json
import typings.adone.Anon_ResponseType
import typings.adone.Anon_ResponseTypeStream
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Data
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Options
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.net.http.client.Client")
@js.native
class Client () extends js.Object {
  def this(options: Options) = this()
  def delete(url: String): js.Promise[Response[js.Object | String]] = js.native
  def delete(
    url: String,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def get(url: String): js.Promise[Response[js.Object | String]] = js.native
  def get(
    url: String,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def options(url: String): js.Promise[Response[js.Object | String]] = js.native
  def options(
    url: String,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def patch(url: String): js.Promise[Response[js.Object | String]] = js.native
  def patch(url: String, data: Data): js.Promise[Response[js.Object | String]] = js.native
  def patch(
    url: String,
    data: Data,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def post(url: String): js.Promise[Response[js.Object | String]] = js.native
  def post(url: String, data: Data): js.Promise[Response[js.Object | String]] = js.native
  def post(
    url: String,
    data: Data,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def put(url: String): js.Promise[Response[js.Object | String]] = js.native
  def put(url: String, data: Data): js.Promise[Response[js.Object | String]] = js.native
  def put(
    url: String,
    data: Data,
    options: (Options with (Anon_BufferResponseType | Anon_ResponseType | Anon_ResponseTypeStream)) | Options
  ): js.Promise[Response[String]] = js.native
  def request(
    config: (Options with (Anon_BufferResponseType | Anon_Json | Anon_ResponseType | Anon_ResponseTypeStream)) | Options,
    args: js.Any*
  ): js.Promise[Response[js.Object | String]] = js.native
}

