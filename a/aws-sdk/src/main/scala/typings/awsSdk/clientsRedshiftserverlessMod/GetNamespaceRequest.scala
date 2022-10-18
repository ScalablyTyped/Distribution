package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceRequest extends StObject {
  
  /**
    * The name of the namespace to retrieve information for.
    */
  var namespaceName: NamespaceName
}
object GetNamespaceRequest {
  
  inline def apply(namespaceName: NamespaceName): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceRequest]
  }
  
  extension [Self <: GetNamespaceRequest](x: Self) {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
  }
}
