package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksEmptyDir extends StObject {
  
  /**
    * The medium to store the volume. The default value is an empty string, which uses the storage of the node.  ""   (Default) Use the disk storage of the node.  "Memory"  Use the tmpfs volume that's backed by the RAM of the node. Contents of the volume are lost when the node reboots, and any storage on the volume counts against the container's memory limit.  
    */
  var medium: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum size of the volume. By default, there's no maximum size defined.
    */
  var sizeLimit: js.UndefOr[Quantity] = js.undefined
}
object EksEmptyDir {
  
  inline def apply(): EksEmptyDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksEmptyDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksEmptyDir] (val x: Self) extends AnyVal {
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSizeLimit(value: Quantity): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
  }
}
