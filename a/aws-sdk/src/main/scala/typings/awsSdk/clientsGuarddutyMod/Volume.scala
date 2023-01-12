package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * Represents a pre-existing file or directory on the host machine that the volume maps to.
    */
  var HostPath: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.HostPath] = js.undefined
  
  /**
    * Volume name.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    inline def setHostPath(value: HostPath): Self = StObject.set(x, "HostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "HostPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
