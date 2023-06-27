package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var `type`: text
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
