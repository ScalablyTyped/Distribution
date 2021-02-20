package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalStackedMapKeyValuePair extends StObject {
  
  var key: IModalInstanceService = js.native
  
  var value: js.Any = js.native
}
object IModalStackedMapKeyValuePair {
  
  @scala.inline
  def apply(key: IModalInstanceService, value: js.Any): IModalStackedMapKeyValuePair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStackedMapKeyValuePair]
  }
  
  @scala.inline
  implicit class IModalStackedMapKeyValuePairMutableBuilder[Self <: IModalStackedMapKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: IModalInstanceService): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
