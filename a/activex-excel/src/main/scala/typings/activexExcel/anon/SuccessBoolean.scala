package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessBoolean extends StObject {
  
  val Success: Boolean
}
object SuccessBoolean {
  
  inline def apply(Success: Boolean): SuccessBoolean = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuccessBoolean] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
