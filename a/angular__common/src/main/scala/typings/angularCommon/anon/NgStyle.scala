package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgStyle extends StObject {
  
  var ngStyle: `19`
}
object NgStyle {
  
  inline def apply(ngStyle: `19`): NgStyle = {
    val __obj = js.Dynamic.literal(ngStyle = ngStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgStyle] (val x: Self) extends AnyVal {
    
    inline def setNgStyle(value: `19`): Self = StObject.set(x, "ngStyle", value.asInstanceOf[js.Any])
  }
}
