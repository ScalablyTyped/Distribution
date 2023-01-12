package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModalStackedMapKeyValuePair extends StObject {
  
  var key: IModalInstanceService
  
  var value: Any
}
object IModalStackedMapKeyValuePair {
  
  inline def apply(key: IModalInstanceService, value: Any): IModalStackedMapKeyValuePair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStackedMapKeyValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModalStackedMapKeyValuePair] (val x: Self) extends AnyVal {
    
    inline def setKey(value: IModalInstanceService): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
