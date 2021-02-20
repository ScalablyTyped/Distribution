package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _FILETIME extends StObject {
  
  val dwHighDateTime: Double = js.native
  
  val dwLowDateTime: Double = js.native
}
object _FILETIME {
  
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): _FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FILETIME]
  }
  
  @scala.inline
  implicit class _FILETIMEMutableBuilder[Self <: _FILETIME] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDwHighDateTime(value: Double): Self = StObject.set(x, "dwHighDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwLowDateTime(value: Double): Self = StObject.set(x, "dwLowDateTime", value.asInstanceOf[js.Any])
  }
}
