package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def comet: typings.ably.ablyStrings.comet = "comet".asInstanceOf[typings.ably.ablyStrings.comet]
  
  @scala.inline
  def jsonp: typings.ably.ablyStrings.jsonp = "jsonp".asInstanceOf[typings.ably.ablyStrings.jsonp]
  
  @scala.inline
  def web_socket: typings.ably.ablyStrings.web_socket = "web_socket".asInstanceOf[typings.ably.ablyStrings.web_socket]
  
  @scala.inline
  def xhr_polling: typings.ably.ablyStrings.xhr_polling = "xhr_polling".asInstanceOf[typings.ably.ablyStrings.xhr_polling]
  
  @scala.inline
  def xhr_streaming: typings.ably.ablyStrings.xhr_streaming = "xhr_streaming".asInstanceOf[typings.ably.ablyStrings.xhr_streaming]
}
