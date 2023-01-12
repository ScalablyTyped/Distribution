package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnection extends StObject {
  
  /**
    * The identifiers of the clients for which the connection is to
    * be enabled. If the array is empty or the property is not
    * specified, no clients are enabled.
    */
  var enabled_clients: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * True if the connection is domain level.
    */
  var is_domain_connection: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines the realms for which the connection will be used
    * (ie: email domains). If the array is empty or the property is
    * not specified, the connection name will be added as realm.
    */
  var realms: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateConnection {
  
  inline def apply(): UpdateConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnection] (val x: Self) extends AnyVal {
    
    inline def setEnabled_clients(value: js.Array[String]): Self = StObject.set(x, "enabled_clients", value.asInstanceOf[js.Any])
    
    inline def setEnabled_clientsUndefined: Self = StObject.set(x, "enabled_clients", js.undefined)
    
    inline def setEnabled_clientsVarargs(value: String*): Self = StObject.set(x, "enabled_clients", js.Array(value*))
    
    inline def setIs_domain_connection(value: Boolean): Self = StObject.set(x, "is_domain_connection", value.asInstanceOf[js.Any])
    
    inline def setIs_domain_connectionUndefined: Self = StObject.set(x, "is_domain_connection", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRealms(value: js.Array[String]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setRealmsUndefined: Self = StObject.set(x, "realms", js.undefined)
    
    inline def setRealmsVarargs(value: String*): Self = StObject.set(x, "realms", js.Array(value*))
  }
}
