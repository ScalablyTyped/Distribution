package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeotriggerNotificationOptionsProperties extends StObject {
  
  /**
    * An optional Arcade expression which can be used to configure notification information when the Geotrigger condition is met.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html#expressionInfo)
    */
  var expressionInfo: js.UndefOr[geotriggersInfoExpressionInfoProperties] = js.undefined
  
  /**
    * An optional list of strings indicating the set of possible actions resulting from this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html#requestedActions)
    */
  var requestedActions: js.UndefOr[js.Array[String]] = js.undefined
}
object GeotriggerNotificationOptionsProperties {
  
  inline def apply(): GeotriggerNotificationOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeotriggerNotificationOptionsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeotriggerNotificationOptionsProperties] (val x: Self) extends AnyVal {
    
    inline def setExpressionInfo(value: geotriggersInfoExpressionInfoProperties): Self = StObject.set(x, "expressionInfo", value.asInstanceOf[js.Any])
    
    inline def setExpressionInfoUndefined: Self = StObject.set(x, "expressionInfo", js.undefined)
    
    inline def setRequestedActions(value: js.Array[String]): Self = StObject.set(x, "requestedActions", value.asInstanceOf[js.Any])
    
    inline def setRequestedActionsUndefined: Self = StObject.set(x, "requestedActions", js.undefined)
    
    inline def setRequestedActionsVarargs(value: String*): Self = StObject.set(x, "requestedActions", js.Array(value*))
  }
}
