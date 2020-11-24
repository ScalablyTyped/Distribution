package typings.activexLibreoffice.com_.sun.star.connection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This permission represents access to a network via sockets. A {@link SocketPermission} consists of a host specification and a set of actions
  * specifying ways to connect to that host. The host is specified as `;     host = (hostname | IPaddress)[:portrange];     portrange = portnumber |
  * -portnumber | portnumber-[portnumber];     ` The host is expressed as a DNS name, as a numerical IP address, or as `"localhost"` (for the local
  * machine). The wildcard `"*"` may be included once in a DNS name host specification. If it is included, it must be in the leftmost position, as in
  * `"*.sun.com"` . ;  The port or portrange is optional. A port specification of the form `"N-"` , where `N` is a port number, signifies all ports
  * numbered `N` and above, while a specification of the form `"-N"` indicates all ports numbered `N` and below.
  *
  * The possible ways to connect to the host are `accept``connect``listen``resolve`;  The `"listen"` action is only meaningful when used with
  * `"localhost"` . The `"resolve"` (resolve host/ip name service lookups) action is implied when any of the other actions are present. ;  As an example
  * of the creation and meaning of SocketPermissions, note that if the following permission `SocketPermission("foo.bar.com:7777", "connect,accept");; ` is
  * granted, it allows to connect to port 7777 on foo.bar.com, and to accept connections on that port. ;  Similarly, if the following permission
  * `SocketPermission("localhost:1024-", "accept,connect,listen");; ` is granted, it allows that code to accept connections on, connect to, or listen on
  * any port between 1024 and 65535 on the local host.
  * @since OOo 1.1.2
  */
@js.native
trait SocketPermission extends js.Object {
  
  /** comma separated actions list */
  var Actions: String = js.native
  
  /** target host with optional portrange */
  var Host: String = js.native
}
object SocketPermission {
  
  @scala.inline
  def apply(Actions: String, Host: String): SocketPermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketPermission]
  }
  
  @scala.inline
  implicit class SocketPermissionOps[Self <: SocketPermission] (val x: Self) extends AnyVal {
    
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
    def setActions(value: String): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
  }
}
