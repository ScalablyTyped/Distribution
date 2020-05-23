package typings.agentkeepalive.mod

import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants_ extends js.Object {
  var CREATE_HTTPS_CONNECTION: Symbol
  var CREATE_ID: Symbol
  var CURRENT_ID: Symbol
  var INIT_SOCKET: Symbol
  var SOCKET_CREATED_TIME: Symbol
  var SOCKET_NAME: Symbol
  var SOCKET_REQUEST_COUNT: Symbol
  var SOCKET_REQUEST_FINISHED_COUNT: Symbol
}

object Constants_ {
  @scala.inline
  def apply(
    CREATE_HTTPS_CONNECTION: Symbol,
    CREATE_ID: Symbol,
    CURRENT_ID: Symbol,
    INIT_SOCKET: Symbol,
    SOCKET_CREATED_TIME: Symbol,
    SOCKET_NAME: Symbol,
    SOCKET_REQUEST_COUNT: Symbol,
    SOCKET_REQUEST_FINISHED_COUNT: Symbol
  ): Constants_ = {
    val __obj = js.Dynamic.literal(CREATE_HTTPS_CONNECTION = CREATE_HTTPS_CONNECTION.asInstanceOf[js.Any], CREATE_ID = CREATE_ID.asInstanceOf[js.Any], CURRENT_ID = CURRENT_ID.asInstanceOf[js.Any], INIT_SOCKET = INIT_SOCKET.asInstanceOf[js.Any], SOCKET_CREATED_TIME = SOCKET_CREATED_TIME.asInstanceOf[js.Any], SOCKET_NAME = SOCKET_NAME.asInstanceOf[js.Any], SOCKET_REQUEST_COUNT = SOCKET_REQUEST_COUNT.asInstanceOf[js.Any], SOCKET_REQUEST_FINISHED_COUNT = SOCKET_REQUEST_FINISHED_COUNT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants_]
  }
}

