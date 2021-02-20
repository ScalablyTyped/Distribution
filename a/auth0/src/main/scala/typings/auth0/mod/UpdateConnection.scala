package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnection extends StObject {
  
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
  implicit class UpdateConnectionMutableBuilder[Self <: UpdateConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled_clients(value: js.Array[String]): Self = StObject.set(x, "enabled_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled_clientsUndefined: Self = StObject.set(x, "enabled_clients", js.undefined)
    
    @scala.inline
    def setEnabled_clientsVarargs(value: String*): Self = StObject.set(x, "enabled_clients", js.Array(value :_*))
    
    @scala.inline
    def setIs_domain_connection(value: Boolean): Self = StObject.set(x, "is_domain_connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_domain_connectionUndefined: Self = StObject.set(x, "is_domain_connection", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRealms(value: js.Array[String]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmsUndefined: Self = StObject.set(x, "realms", js.undefined)
    
    @scala.inline
    def setRealmsVarargs(value: String*): Self = StObject.set(x, "realms", js.Array(value :_*))
  }
}
