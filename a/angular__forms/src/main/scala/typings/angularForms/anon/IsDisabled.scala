package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var isDisabled: `1`
  
  var model: `2`
  
  var name: `3`
}
object IsDisabled {
  
  inline def apply(isDisabled: `1`, model: `2`, name: `3`): IsDisabled = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDisabled] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: `1`): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: `2`): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: `3`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
