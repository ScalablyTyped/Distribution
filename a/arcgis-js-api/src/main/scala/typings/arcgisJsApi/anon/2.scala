package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `type`: icon
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icon")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setType(value: icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
