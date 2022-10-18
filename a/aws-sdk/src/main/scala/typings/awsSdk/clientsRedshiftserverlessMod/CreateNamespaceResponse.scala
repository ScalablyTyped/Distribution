package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamespaceResponse extends StObject {
  
  /**
    * The created namespace object.
    */
  var namespace: js.UndefOr[Namespace] = js.undefined
}
object CreateNamespaceResponse {
  
  inline def apply(): CreateNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamespaceResponse]
  }
  
  extension [Self <: CreateNamespaceResponse](x: Self) {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
