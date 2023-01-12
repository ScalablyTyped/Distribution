package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksHostPath extends StObject {
  
  /**
    * The path of the file or directory on the host to mount into containers on the pod.
    */
  var path: js.UndefOr[String] = js.undefined
}
object EksHostPath {
  
  inline def apply(): EksHostPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksHostPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksHostPath] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
