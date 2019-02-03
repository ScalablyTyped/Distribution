package typings
package ablyLib.ablyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ably", "Rest")
@js.native
class Rest protected () extends js.Object {
  def this(options: ablyLib.ablyMod.TypesNs.ClientOptions) = this()
  def this(options: java.lang.String) = this()
  var auth: ablyLib.ablyMod.TypesNs.Auth = js.native
  var channels: ablyLib.ablyMod.TypesNs.Channels[ablyLib.ablyMod.TypesNs.Channel] = js.native
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
    callback: js.Function2[
      /* error */ ablyLib.ablyMod.TypesNs.ErrorInfo, 
      /* response */ ablyLib.ablyMod.TypesNs.HttpPaginatedResponse, 
      scala.Unit
    ]
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
    callback: js.Function2[
      /* error */ ablyLib.ablyMod.TypesNs.ErrorInfo, 
      /* response */ ablyLib.ablyMod.TypesNs.HttpPaginatedResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def stats(): scala.Unit = js.native
  def stats(paramsOrCallback: ablyLib.ablyMod.TypesNs.paginatedResultCallback[ablyLib.ablyMod.TypesNs.Stats]): scala.Unit = js.native
  def stats(
    paramsOrCallback: ablyLib.ablyMod.TypesNs.paginatedResultCallback[ablyLib.ablyMod.TypesNs.Stats],
    callback: ablyLib.ablyMod.TypesNs.paginatedResultCallback[ablyLib.ablyMod.TypesNs.Stats]
  ): scala.Unit = js.native
  def stats(paramsOrCallback: js.Any): scala.Unit = js.native
  def stats(
    paramsOrCallback: js.Any,
    callback: ablyLib.ablyMod.TypesNs.paginatedResultCallback[ablyLib.ablyMod.TypesNs.Stats]
  ): scala.Unit = js.native
  def time(): scala.Unit = js.native
  def time(paramsOrCallback: ablyLib.ablyMod.TypesNs.timeCallback): scala.Unit = js.native
  def time(
    paramsOrCallback: ablyLib.ablyMod.TypesNs.timeCallback,
    callback: ablyLib.ablyMod.TypesNs.timeCallback
  ): scala.Unit = js.native
  def time(paramsOrCallback: js.Any): scala.Unit = js.native
  def time(paramsOrCallback: js.Any, callback: ablyLib.ablyMod.TypesNs.timeCallback): scala.Unit = js.native
}

/* static members */
@JSImport("ably", "Rest")
@js.native
object Rest extends js.Object {
  var Crypto: ablyLib.ablyMod.TypesNs.Crypto = js.native
  var Message: ablyLib.ablyMod.TypesNs.MessageStatic = js.native
  var PresenceMessage: ablyLib.ablyMod.TypesNs.PresenceMessageStatic = js.native
}

