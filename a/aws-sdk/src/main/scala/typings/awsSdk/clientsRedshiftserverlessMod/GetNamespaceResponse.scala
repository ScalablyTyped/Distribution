package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceResponse extends StObject {
  
  /**
    * The returned namespace object.
    */
  var namespace: Namespace
}
object GetNamespaceResponse {
  
  inline def apply(namespace: Namespace): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNamespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
