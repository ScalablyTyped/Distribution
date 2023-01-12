package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DwValidFlagsMask extends StObject {
  
  val dwValidFlagsMask: Double
  
  val dwWindowStateFlags: Double
}
object DwValidFlagsMask {
  
  inline def apply(dwValidFlagsMask: Double, dwWindowStateFlags: Double): DwValidFlagsMask = {
    val __obj = js.Dynamic.literal(dwValidFlagsMask = dwValidFlagsMask.asInstanceOf[js.Any], dwWindowStateFlags = dwWindowStateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwValidFlagsMask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DwValidFlagsMask] (val x: Self) extends AnyVal {
    
    inline def setDwValidFlagsMask(value: Double): Self = StObject.set(x, "dwValidFlagsMask", value.asInstanceOf[js.Any])
    
    inline def setDwWindowStateFlags(value: Double): Self = StObject.set(x, "dwWindowStateFlags", value.asInstanceOf[js.Any])
  }
}
