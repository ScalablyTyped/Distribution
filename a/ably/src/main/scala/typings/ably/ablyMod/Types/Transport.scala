package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ably.ablyStrings.web_socket
  - typings.ably.ablyStrings.xhr_streaming
  - typings.ably.ablyStrings.xhr_polling
  - typings.ably.ablyStrings.jsonp
  - typings.ably.ablyStrings.comet
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def comet: typings.ably.ablyStrings.comet = this.cast("comet")
  @scala.inline
  def jsonp: typings.ably.ablyStrings.jsonp = this.cast("jsonp")
  @scala.inline
  def web_socket: typings.ably.ablyStrings.web_socket = this.cast("web_socket")
  @scala.inline
  def xhr_polling: typings.ably.ablyStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typings.ably.ablyStrings.xhr_streaming = this.cast("xhr_streaming")
}

