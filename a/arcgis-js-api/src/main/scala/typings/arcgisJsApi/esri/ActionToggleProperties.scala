package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionToggleProperties
  extends StObject
     with ActionBaseProperties {
  
  /**
    * Indicates the value of whether the action is toggled on/off.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#value)
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object ActionToggleProperties {
  
  inline def apply(): ActionToggleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionToggleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionToggleProperties] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
