package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MChooseLocationOptions(res: ChooseLocationData): Unit
}
object ChooseLocationOptions {
  
  inline def apply(success: ChooseLocationData => Unit): ChooseLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseLocationOptions]
  }
  
  extension [Self <: ChooseLocationOptions](x: Self) {
    
    inline def setSuccess(value: ChooseLocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
