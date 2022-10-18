package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksInfo extends StObject {
  
  /**
    * The namespaces of the EKS cluster.
    */
  var namespace: js.UndefOr[KubernetesNamespace] = js.undefined
}
object EksInfo {
  
  inline def apply(): EksInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksInfo]
  }
  
  extension [Self <: EksInfo](x: Self) {
    
    inline def setNamespace(value: KubernetesNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
