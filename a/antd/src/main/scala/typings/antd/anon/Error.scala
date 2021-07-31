package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.UndefOr[typings.std.Error | Null] = js.undefined
  
  var info: ComponentStack
}
object Error {
  
  @scala.inline
  def apply(info: ComponentStack): Error = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: ComponentStack): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
