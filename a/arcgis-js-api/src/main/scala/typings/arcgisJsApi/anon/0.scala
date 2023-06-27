package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.extrude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: extrude
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("extrude")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setType(value: extrude): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
