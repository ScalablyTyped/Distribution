package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceResponse extends StObject {
  
  /**
    * The deleted namespace object.
    */
  var namespace: Namespace
}
object DeleteNamespaceResponse {
  
  inline def apply(namespace: Namespace): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNamespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
