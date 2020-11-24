package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnection extends js.Object {
  
  /**
    * The identifiers of the clients for which the connection is to
    * be enabled. If the array is empty or the property is not
    * specified, no clients are enabled.
    */
  var enabled_clients: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * True if the connection is domain level.
    */
  var is_domain_connection: js.UndefOr[Boolean] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines the realms for which the connection will be used
    * (ie: email domains). If the array is empty or the property is
    * not specified, the connection name will be added as realm.
    */
  var realms: js.UndefOr[js.Array[String]] = js.native
}
object UpdateConnection {
  
  @scala.inline
  def apply(): UpdateConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnection]
  }
  
  @scala.inline
  implicit class UpdateConnectionOps[Self <: UpdateConnection] (val x: Self) extends AnyVal {
    
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
    def setEnabled_clientsVarargs(value: String*): Self = this.set("enabled_clients", js.Array(value :_*))
    
    @scala.inline
    def setEnabled_clients(value: js.Array[String]): Self = this.set("enabled_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled_clients: Self = this.set("enabled_clients", js.undefined)
    
    @scala.inline
    def setIs_domain_connection(value: Boolean): Self = this.set("is_domain_connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_domain_connection: Self = this.set("is_domain_connection", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRealmsVarargs(value: String*): Self = this.set("realms", js.Array(value :_*))
    
    @scala.inline
    def setRealms(value: js.Array[String]): Self = this.set("realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealms: Self = this.set("realms", js.undefined)
  }
}
