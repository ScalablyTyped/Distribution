package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DwValidFlagsMask extends StObject {
  
  val dwValidFlagsMask: Double = js.native
  
  val dwWindowStateFlags: Double = js.native
}
object DwValidFlagsMask {
  
  @scala.inline
  def apply(dwValidFlagsMask: Double, dwWindowStateFlags: Double): DwValidFlagsMask = {
    val __obj = js.Dynamic.literal(dwValidFlagsMask = dwValidFlagsMask.asInstanceOf[js.Any], dwWindowStateFlags = dwWindowStateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwValidFlagsMask]
  }
  
  @scala.inline
  implicit class DwValidFlagsMaskMutableBuilder[Self <: DwValidFlagsMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDwValidFlagsMask(value: Double): Self = StObject.set(x, "dwValidFlagsMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwWindowStateFlags(value: Double): Self = StObject.set(x, "dwWindowStateFlags", value.asInstanceOf[js.Any])
  }
}
