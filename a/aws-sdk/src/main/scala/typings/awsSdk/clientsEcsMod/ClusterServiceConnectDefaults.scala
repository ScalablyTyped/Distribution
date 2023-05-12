package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterServiceConnectDefaults extends StObject {
  
  /**
    * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace. When you create a service and don't specify a Service Connect configuration, this namespace is used.
    */
  var namespace: js.UndefOr[String] = js.undefined
}
object ClusterServiceConnectDefaults {
  
  inline def apply(): ClusterServiceConnectDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterServiceConnectDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterServiceConnectDefaults] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
