package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EKSOnDeviceServiceConfiguration extends StObject {
  
  /**
    * The version of EKS Anywhere on the Snow Family device.
    */
  var EKSAnywhereVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Kubernetes version for EKS Anywhere on the Snow Family device.
    */
  var KubernetesVersion: js.UndefOr[String] = js.undefined
}
object EKSOnDeviceServiceConfiguration {
  
  inline def apply(): EKSOnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EKSOnDeviceServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EKSOnDeviceServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEKSAnywhereVersion(value: String): Self = StObject.set(x, "EKSAnywhereVersion", value.asInstanceOf[js.Any])
    
    inline def setEKSAnywhereVersionUndefined: Self = StObject.set(x, "EKSAnywhereVersion", js.undefined)
    
    inline def setKubernetesVersion(value: String): Self = StObject.set(x, "KubernetesVersion", value.asInstanceOf[js.Any])
    
    inline def setKubernetesVersionUndefined: Self = StObject.set(x, "KubernetesVersion", js.undefined)
  }
}
