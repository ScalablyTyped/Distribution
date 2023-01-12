package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainerVolumeMount extends StObject {
  
  /**
    * The path on the container where the volume is mounted.
    */
  var mountPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name the volume mount. This must match the name of one of the volumes in the pod.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If this value is true, the container has read-only access to the volume. Otherwise, the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object EksContainerVolumeMount {
  
  inline def apply(): EksContainerVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksContainerVolumeMount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksContainerVolumeMount] (val x: Self) extends AnyVal {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
