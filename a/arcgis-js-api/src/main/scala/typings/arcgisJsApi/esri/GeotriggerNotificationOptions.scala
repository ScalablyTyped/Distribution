package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeotriggerNotificationOptions
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * An optional Arcade expression which can be used to configure notification information when the Geotrigger condition is met.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html#expressionInfo)
    */
  var expressionInfo: geotriggersInfoExpressionInfo = js.native
  
  /**
    * An optional list of strings indicating the set of possible actions resulting from this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html#requestedActions)
    */
  var requestedActions: js.Array[String] = js.native
}
