package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNamespaceResponse extends StObject {
  
  /**
    * A list of tag instances.
    */
  var namespace: Namespace
}
object UpdateNamespaceResponse {
  
  inline def apply(namespace: Namespace): UpdateNamespaceResponse = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNamespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNamespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
