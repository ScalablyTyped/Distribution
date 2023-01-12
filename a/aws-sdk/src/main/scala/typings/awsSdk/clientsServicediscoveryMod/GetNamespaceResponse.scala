package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceResponse extends StObject {
  
  /**
    * A complex type that contains information about the specified namespace.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Namespace] = js.undefined
}
object GetNamespaceResponse {
  
  inline def apply(): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNamespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
