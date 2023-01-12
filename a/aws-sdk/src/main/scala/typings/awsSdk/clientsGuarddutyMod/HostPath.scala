package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostPath extends StObject {
  
  /**
    * Path of the file or directory on the host that the volume maps to.
    */
  var Path: js.UndefOr[String] = js.undefined
}
object HostPath {
  
  inline def apply(): HostPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostPath] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
