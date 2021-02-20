package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultDate extends StObject {
  
  var date: js.Any = js.native
  
  var defaultDate: js.Any = js.native
}
object DefaultDate {
  
  @scala.inline
  def apply(date: js.Any, defaultDate: js.Any): DefaultDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDate]
  }
  
  @scala.inline
  implicit class DefaultDateMutableBuilder[Self <: DefaultDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDate(value: js.Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
  }
}
