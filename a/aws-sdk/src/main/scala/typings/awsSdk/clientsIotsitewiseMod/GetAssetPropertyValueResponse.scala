package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetPropertyValueResponse extends StObject {
  
  /**
    * The current asset property value.
    */
  var propertyValue: js.UndefOr[AssetPropertyValue] = js.undefined
}
object GetAssetPropertyValueResponse {
  
  inline def apply(): GetAssetPropertyValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssetPropertyValueResponse] (val x: Self) extends AnyVal {
    
    inline def setPropertyValue(value: AssetPropertyValue): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
