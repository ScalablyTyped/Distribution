package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`enter-contains-and-exit-does-not-contain`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-contains-and-exit-does-not-intersect`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-intersects-and-exit-does-not-intersect`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-or-exit`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-geometry-with-accuracy`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-geometry`
import typings.arcgisJsApi.arcgisJsApiStrings.enter
import typings.arcgisJsApi.arcgisJsApiStrings.exit
import typings.arcgisJsApi.arcgisJsApiStrings.fence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FenceGeotrigger
  extends StObject
     with Accessor {
  
  /**
    * The rule that determines whether a fence polygon has been entered or exited by the geometry from a feed.
    *
    * @default enter-contains-and-exit-does-not-intersect
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#enterExitRule)
    */
  var enterExitRule: `enter-contains-and-exit-does-not-contain` | `enter-contains-and-exit-does-not-intersect` | `enter-intersects-and-exit-does-not-intersect` = js.native
  
  /**
    * The feed for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#feed)
    */
  var feed: DeviceLocationFeed = js.native
  
  /**
    * Indicates how the geotrigger will use accuracy information from a feed.
    *
    * @default use-geometry
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#feedAccuracyMode)
    */
  var feedAccuracyMode: `use-geometry` | `use-geometry-with-accuracy` = js.native
  
  /**
    * Indicates the type of event that will trigger notifications for the Fence Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#fenceNotificationRule)
    */
  var fenceNotificationRule: enter | `enter-or-exit` | exit = js.native
  
  /**
    * An object defining the fences to use for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#fenceParameters)
    */
  var fenceParameters: FeatureFenceParameters = js.native
  
  /**
    * The name for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#name)
    */
  var name: String = js.native
  
  /**
    * Options that control the notification information sent to a client app when a Geotrigger condition is met.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#notificationOptions)
    */
  var notificationOptions: GeotriggerNotificationOptions = js.native
  
  /**
    * String indicating the Geotrigger condition type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#type)
    */
  val `type`: fence = js.native
}
