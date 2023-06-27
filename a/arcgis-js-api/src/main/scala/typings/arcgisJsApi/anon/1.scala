package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `type`: fill
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setType(value: fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
