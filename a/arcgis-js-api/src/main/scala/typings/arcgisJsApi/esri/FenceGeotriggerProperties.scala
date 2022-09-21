package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`enter-contains-and-exit-does-not-contain`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-contains-and-exit-does-not-intersect`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-intersects-and-exit-does-not-intersect`
import typings.arcgisJsApi.arcgisJsApiStrings.`enter-or-exit`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-geometry-with-accuracy`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-geometry`
import typings.arcgisJsApi.arcgisJsApiStrings.enter
import typings.arcgisJsApi.arcgisJsApiStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FenceGeotriggerProperties extends StObject {
  
  /**
    * The rule that determines whether a fence polygon has been entered or exited by the geometry from a feed.
    *
    * @default enter-contains-and-exit-does-not-intersect
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#enterExitRule)
    */
  var enterExitRule: js.UndefOr[
    `enter-contains-and-exit-does-not-contain` | `enter-contains-and-exit-does-not-intersect` | `enter-intersects-and-exit-does-not-intersect`
  ] = js.undefined
  
  /**
    * The feed for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#feed)
    */
  var feed: js.UndefOr[DeviceLocationFeedProperties] = js.undefined
  
  /**
    * Indicates how the geotrigger will use accuracy information from a feed.
    *
    * @default use-geometry
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#feedAccuracyMode)
    */
  var feedAccuracyMode: js.UndefOr[`use-geometry` | `use-geometry-with-accuracy`] = js.undefined
  
  /**
    * Indicates the type of event that will trigger notifications for the Fence Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#fenceNotificationRule)
    */
  var fenceNotificationRule: js.UndefOr[enter | `enter-or-exit` | exit] = js.undefined
  
  /**
    * An object defining the fences to use for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#fenceParameters)
    */
  var fenceParameters: js.UndefOr[FeatureFenceParametersProperties] = js.undefined
  
  /**
    * The name for this Geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Options that control the notification information sent to a client app when a Geotrigger condition is met.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html#notificationOptions)
    */
  var notificationOptions: js.UndefOr[GeotriggerNotificationOptionsProperties] = js.undefined
}
object FenceGeotriggerProperties {
  
  inline def apply(): FenceGeotriggerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FenceGeotriggerProperties]
  }
  
  extension [Self <: FenceGeotriggerProperties](x: Self) {
    
    inline def setEnterExitRule(
      value: `enter-contains-and-exit-does-not-contain` | `enter-contains-and-exit-does-not-intersect` | `enter-intersects-and-exit-does-not-intersect`
    ): Self = StObject.set(x, "enterExitRule", value.asInstanceOf[js.Any])
    
    inline def setEnterExitRuleUndefined: Self = StObject.set(x, "enterExitRule", js.undefined)
    
    inline def setFeed(value: DeviceLocationFeedProperties): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setFeedAccuracyMode(value: `use-geometry` | `use-geometry-with-accuracy`): Self = StObject.set(x, "feedAccuracyMode", value.asInstanceOf[js.Any])
    
    inline def setFeedAccuracyModeUndefined: Self = StObject.set(x, "feedAccuracyMode", js.undefined)
    
    inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    inline def setFenceNotificationRule(value: enter | `enter-or-exit` | exit): Self = StObject.set(x, "fenceNotificationRule", value.asInstanceOf[js.Any])
    
    inline def setFenceNotificationRuleUndefined: Self = StObject.set(x, "fenceNotificationRule", js.undefined)
    
    inline def setFenceParameters(value: FeatureFenceParametersProperties): Self = StObject.set(x, "fenceParameters", value.asInstanceOf[js.Any])
    
    inline def setFenceParametersUndefined: Self = StObject.set(x, "fenceParameters", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationOptions(value: GeotriggerNotificationOptionsProperties): Self = StObject.set(x, "notificationOptions", value.asInstanceOf[js.Any])
    
    inline def setNotificationOptionsUndefined: Self = StObject.set(x, "notificationOptions", js.undefined)
  }
}
