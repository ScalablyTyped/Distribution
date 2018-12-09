package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.net.http.client.Client")
@js.native
class Client () extends js.Object {
  def this(options: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options) = this()
  def delete(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def delete(
    url: java.lang.String,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def get(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def get(
    url: java.lang.String,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def options(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def options(
    url: java.lang.String,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def patch(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def patch(url: java.lang.String, data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def patch(
    url: java.lang.String,
    data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def post(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def post(url: java.lang.String, data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def post(
    url: java.lang.String,
    data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def put(url: java.lang.String): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def put(url: java.lang.String, data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
  def put(
    url: java.lang.String,
    data: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Data,
    options: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options
  ): js.Promise[adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[java.lang.String]] = js.native
  def request(
    config: (adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options with (adoneLib.Anon_ResponseType | adoneLib.Anon_ResponseTypeBuffer | adoneLib.Anon_ResponseTypeJson | adoneLib.Anon_ResponseTypeStream)) | adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Options,
    args: js.Any*
  ): js.Promise[
    adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Response[js.Object | java.lang.String]
  ] = js.native
}

