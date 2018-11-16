package typings
package angularDashGoogleDashAnalyticsLib.angularMod.googleNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @summary Interface for {@link AnalyticsService}.
     * @interface
     */
@js.native
trait AnalyticsService extends js.Object {
  /**
         * @summary If logging is enabled then all outbound calls are accessible via an in-memory array.
         * This is useful for troubleshooting and seeing the order of outbound calls with parameters.
         */
  var log: js.Array[js.Object] = js.native
  /**
         * @summary If in offline mode then all calls are queued to an in-memory array for future processing.
         * All calls queued to the offlineQueue are not outbound calls yet and hence do not show up in the log.
         */
  var offlineQueue: js.Array[js.Object] = js.native
  /**
         * @summary Manually create universal analytics (analytics.js) script tag
         */
  def createAnalyticsScriptTag(): scala.Unit = js.native
  /**
         * @summary Manually create classic analytics (ga.js) script tag
         */
  def createScriptTag(): scala.Unit = js.native
  /**
         * @summary Returns the current URL that would be sent if a `trackPage` call was made.
         * @return {string} The URL
         */
  def getUrl(): java.lang.String = js.native
  /**
         * @summary While in offline mode, no calls to the ga function or pushes to the gaq array are made.
         * This will queue all calls for later sending once offline mode is reset to false.
         */
  def offline(offlineMode: scala.Boolean): scala.Unit = js.native
  /**
         * @summary If delayScriptTag(true) was set during configuration then manual script tag injection is required. 
         * @return {boolean} True if scripts were registered.
         */
  def registerScriptTags(): scala.Boolean = js.native
  /**
         * @summary If delayScriptTag(true) was set during configuration then manual tracker setup is required.
         * @return {boolean} True if trackers were registered.
         */
  def registerTrackers(): scala.Boolean = js.native
  /**
         * @summary Allows for advanced configuration and definitions in univeral analytics only. This is a no-op when using classic analytics.
         */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
         * @summary Allows for advanced configuration and definitions in univeral analytics only. This is a no-op when using classic analytics.
         */
  def set(key: java.lang.String, value: js.Any, accountName: java.lang.String): scala.Unit = js.native
  /**
         * @summary Create a new event
         */
  def trackEvent(category: java.lang.String, action: java.lang.String, label: java.lang.String): scala.Unit = js.native
  /**
         * @summary Create a new event
         */
  def trackEvent(category: java.lang.String, action: java.lang.String, label: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
         * @summary Create a new event
         */
  def trackEvent(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: js.Any,
    nonInteractionFlag: scala.Boolean
  ): scala.Unit = js.native
  /**
         * @summary Create a new event
         */
  def trackEvent(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: js.Any,
    nonInteractionFlag: scala.Boolean,
    dimensions: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def trackException(descrption: java.lang.String, isFatal: scala.Boolean): scala.Unit = js.native
  /**
         * @summary Creates a new page view event
         * @param  {string} pageURL URL of page view
         * @param  {string} title Page Title
         * @param  {Object}  dimensions Additional dimensions and metrics
         */
  def trackPage(pageURL: java.lang.String): scala.Unit = js.native
  /**
         * @summary Creates a new page view event
         * @param  {string} pageURL URL of page view
         * @param  {string} title Page Title
         * @param  {Object}  dimensions Additional dimensions and metrics
         */
  def trackPage(pageURL: java.lang.String, title: java.lang.String): scala.Unit = js.native
  /**
         * @summary Creates a new page view event
         * @param  {string} pageURL URL of page view
         * @param  {string} title Page Title
         * @param  {Object}  dimensions Additional dimensions and metrics
         */
  def trackPage(
    pageURL: java.lang.String,
    title: java.lang.String,
    dimensions: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
}

