package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeotriggerNotificationOptionsConstructor
  extends StObject
     with /**
  * Options that control the notification information sent to a client app client when a Geotrigger condition is met.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html)
  */
Instantiable0[GeotriggerNotificationOptions]
     with Instantiable1[
      /* properties */ GeotriggerNotificationOptionsProperties, 
      GeotriggerNotificationOptions
    ] {
  
  def fromJSON(json: Any): GeotriggerNotificationOptions = js.native
}
