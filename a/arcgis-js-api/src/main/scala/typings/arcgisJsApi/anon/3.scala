package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var `type`: line
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
