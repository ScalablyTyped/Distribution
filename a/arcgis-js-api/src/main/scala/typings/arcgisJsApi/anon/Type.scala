package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: group
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
