package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksVolume extends StObject {
  
  /**
    * Specifies the configuration of a Kubernetes emptyDir volume. For more information, see emptyDir in the Kubernetes documentation.
    */
  var emptyDir: js.UndefOr[EksEmptyDir] = js.undefined
  
  /**
    * Specifies the configuration of a Kubernetes hostPath volume. For more information, see hostPath in the Kubernetes documentation.
    */
  var hostPath: js.UndefOr[EksHostPath] = js.undefined
  
  /**
    * The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see DNS subdomain names in the Kubernetes documentation.
    */
  var name: String
  
  /**
    * Specifies the configuration of a Kubernetes secret volume. For more information, see secret in the Kubernetes documentation.
    */
  var secret: js.UndefOr[EksSecret] = js.undefined
}
object EksVolume {
  
  inline def apply(name: String): EksVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksVolume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksVolume] (val x: Self) extends AnyVal {
    
    inline def setEmptyDir(value: EksEmptyDir): Self = StObject.set(x, "emptyDir", value.asInstanceOf[js.Any])
    
    inline def setEmptyDirUndefined: Self = StObject.set(x, "emptyDir", js.undefined)
    
    inline def setHostPath(value: EksHostPath): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: EksSecret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
