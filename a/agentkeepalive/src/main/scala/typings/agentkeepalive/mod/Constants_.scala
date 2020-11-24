package typings.agentkeepalive.mod

import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constants_ extends js.Object {
  
  var CREATE_HTTPS_CONNECTION: Symbol = js.native
  
  var CREATE_ID: Symbol = js.native
  
  var CURRENT_ID: Symbol = js.native
  
  var INIT_SOCKET: Symbol = js.native
  
  var SOCKET_CREATED_TIME: Symbol = js.native
  
  var SOCKET_NAME: Symbol = js.native
  
  var SOCKET_REQUEST_COUNT: Symbol = js.native
  
  var SOCKET_REQUEST_FINISHED_COUNT: Symbol = js.native
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
  
  @scala.inline
  implicit class Constants_Ops[Self <: Constants_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCREATE_HTTPS_CONNECTION(value: Symbol): Self = this.set("CREATE_HTTPS_CONNECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATE_ID(value: Symbol): Self = this.set("CREATE_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCURRENT_ID(value: Symbol): Self = this.set("CURRENT_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINIT_SOCKET(value: Symbol): Self = this.set("INIT_SOCKET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_CREATED_TIME(value: Symbol): Self = this.set("SOCKET_CREATED_TIME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_NAME(value: Symbol): Self = this.set("SOCKET_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_REQUEST_COUNT(value: Symbol): Self = this.set("SOCKET_REQUEST_COUNT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_REQUEST_FINISHED_COUNT(value: Symbol): Self = this.set("SOCKET_REQUEST_FINISHED_COUNT", value.asInstanceOf[js.Any])
  }
}
