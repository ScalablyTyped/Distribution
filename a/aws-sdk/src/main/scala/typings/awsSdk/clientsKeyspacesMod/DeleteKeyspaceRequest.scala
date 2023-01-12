package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeyspaceRequest extends StObject {
  
  /**
    * The name of the keyspace to be deleted.
    */
  var keyspaceName: KeyspaceName
}
object DeleteKeyspaceRequest {
  
  inline def apply(keyspaceName: KeyspaceName): DeleteKeyspaceRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyspaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteKeyspaceRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
  }
}
