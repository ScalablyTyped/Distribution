package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppInsights extends js.Object {
  var config: IConfig = js.native
  var context: ITelemetryContext = js.native
  var downloadAndSetup: js.UndefOr[js.Function1[/* config */ IConfig, _]] = js.native
  var queue: js.Array[js.Function0[Unit]] = js.native
  /**
    * The custom error handler for Application Insights
    * @param {string} message - The error message
    * @param {string} url - The url where the error was raised
    * @param {number} lineNumber - The line number where the error was raised
    * @param {number} columnNumber - The column number for the line where the error was raised
    * @param {Error}  error - The Error object
    */
  def _onerror(message: String, url: String, lineNumber: Double, columnNumber: Double, error: Error): js.Any = js.native
  /**
    * Clears the authenticated user id and the account id from the user context.
    */
  def clearAuthenticatedUserContext(): js.Any = js.native
  /**
    * Immediately send all queued telemetry.
    */
  def flush(): js.Any = js.native
  /**
    * Sets the autheticated user id and the account id in this session.
    * User auth id and account id should be of type string. They should not contain commas, semi-colons, equal signs, spaces, or vertical-bars.
    *
    * @param authenticatedUserId {string} - The authenticated user id. A unique and persistent string that represents each authenticated user in the service.
    * @param accountId {string} - An optional string to represent the account associated with the authenticated user.
    */
  def setAuthenticatedUserContext(authenticatedUserId: String): js.Any = js.native
  def setAuthenticatedUserContext(authenticatedUserId: String, accountId: String): js.Any = js.native
  def setAuthenticatedUserContext(authenticatedUserId: String, accountId: String, storeInCookie: Boolean): js.Any = js.native
  /**
    * Start timing an extended event. Call `stopTrackEvent` to log the event when it ends.
    * @param   name    A string that identifies this event uniquely within the document.
    */
  def startTrackEvent(name: String): js.Any = js.native
  /**
    * Starts the timer for tracking a page load time. Use this instead of `trackPageView` if you want to control when the page view timer starts and stops,
    * but don't want to calculate the duration yourself. This method doesn't send any telemetry. Call `stopTrackPage` to log the end of the page view
    * and send the event.
    * @param   name  A string that idenfities this item, unique within this HTML document. Defaults to the document title.
    */
  def startTrackPage(): js.Any = js.native
  def startTrackPage(name: String): js.Any = js.native
  /**
    * Log an extended event that you started timing with `startTrackEvent`.
    * @param   name    The string you used to identify this event in `startTrackEvent`.
    * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
    * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
    */
  def stopTrackEvent(name: String): js.Any = js.native
  def stopTrackEvent(name: String, properties: StringDictionary[String]): js.Any = js.native
  def stopTrackEvent(name: String, properties: StringDictionary[String], measurements: StringDictionary[Double]): js.Any = js.native
  /**
    * Stops the timer that was started by calling `startTrackPage` and sends the pageview load time telemetry with the specified properties and measurements.
    * The duration of the page view will be the time between calling `startTrackPage` and `stopTrackPage`.
    * @param   name  The string you used as the name in `startTrackPage`. Defaults to the document title.
    * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
    * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
    * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
    */
  def stopTrackPage(): js.Any = js.native
  def stopTrackPage(name: String): js.Any = js.native
  def stopTrackPage(name: String, url: String): js.Any = js.native
  def stopTrackPage(name: String, url: String, properties: StringDictionary[String]): js.Any = js.native
  def stopTrackPage(
    name: String,
    url: String,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double]
  ): js.Any = js.native
  /**
    * Log a dependency call
    * @param   id    unique id, this is used by the backend o correlate server requests. Use Util.newId() to generate a unique Id.
    * @param   method    represents request verb (GET, POST, etc.)
    * @param   absoluteUrl   absolute url used to make the dependency request
    * @param   pathName  the path part of the absolute url
    * @param   totalTime total request time
    * @param   success   indicates if the request was sessessful
    * @param   resultCode    response code returned by the dependency request
    * @param   properties    map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
    * @param   measurements  map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
    */
  def trackDependency(
    id: String,
    method: String,
    absoluteUrl: String,
    pathName: String,
    totalTime: Double,
    success: Boolean,
    resultCode: Double
  ): js.Any = js.native
  def trackDependency(
    id: String,
    method: String,
    absoluteUrl: String,
    pathName: String,
    totalTime: Double,
    success: Boolean,
    resultCode: Double,
    properties: StringDictionary[String]
  ): js.Any = js.native
  def trackDependency(
    id: String,
    method: String,
    absoluteUrl: String,
    pathName: String,
    totalTime: Double,
    success: Boolean,
    resultCode: Double,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double]
  ): js.Any = js.native
  /**
    * Log a user action or other occurrence.
    * @param   name    A string to identify this event in the portal.
    * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
    * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
    */
  def trackEvent(name: String): js.Any = js.native
  def trackEvent(name: String, properties: StringDictionary[String]): js.Any = js.native
  def trackEvent(name: String, properties: StringDictionary[String], measurements: StringDictionary[Double]): js.Any = js.native
  /**
    * Log an exception you have caught.
    * @param   exception   An Error from a catch clause, or the string error message.
    * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
    * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
    * @param   severityLevel   AI.SeverityLevel - severity level
    */
  def trackException(exception: Error): js.Any = js.native
  def trackException(exception: Error, handledAt: String): js.Any = js.native
  def trackException(exception: Error, handledAt: String, properties: StringDictionary[String]): js.Any = js.native
  def trackException(
    exception: Error,
    handledAt: String,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double]
  ): js.Any = js.native
  def trackException(
    exception: Error,
    handledAt: String,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double],
    severityLevel: SeverityLevel
  ): js.Any = js.native
  /**
    * Log a numeric value that is not associated with a specific event. Typically used to send regular reports of performance indicators.
    * To send a single measurement, use just the first two parameters. If you take measurements very frequently, you can reduce the
    * telemetry bandwidth by aggregating multiple measurements and sending the resulting average at intervals.
    * @param   name    A string that identifies the metric.
    * @param   average Number representing either a single measurement, or the average of several measurements.
    * @param   sampleCount The number of measurements represented by the average. Defaults to 1.
    * @param   min The smallest measurement in the sample. Defaults to the average.
    * @param   max The largest measurement in the sample. Defaults to the average.
    */
  def trackMetric(name: String, average: Double): js.Any = js.native
  def trackMetric(name: String, average: Double, sampleCount: Double): js.Any = js.native
  def trackMetric(name: String, average: Double, sampleCount: Double, min: Double): js.Any = js.native
  def trackMetric(name: String, average: Double, sampleCount: Double, min: Double, max: Double): js.Any = js.native
  def trackMetric(
    name: String,
    average: Double,
    sampleCount: Double,
    min: Double,
    max: Double,
    properties: StringDictionary[String]
  ): js.Any = js.native
  /**
    * Logs that a page or other item was viewed.
    * @param   name  The string you used as the name in `startTrackPage`. Defaults to the document title.
    * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
    * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
    * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
    * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
    */
  def trackPageView(): js.Any = js.native
  def trackPageView(name: String): js.Any = js.native
  def trackPageView(name: String, url: String): js.Any = js.native
  def trackPageView(name: String, url: String, properties: StringDictionary[String]): js.Any = js.native
  def trackPageView(
    name: String,
    url: String,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double]
  ): js.Any = js.native
  def trackPageView(
    name: String,
    url: String,
    properties: StringDictionary[String],
    measurements: StringDictionary[Double],
    duration: Double
  ): js.Any = js.native
  /**
    * Log a diagnostic message.
    * @param    message A message string
    * @param    properties  map[string, string] - additional data used to filter traces in the portal. Defaults to empty.
    */
  def trackTrace(message: String): js.Any = js.native
  def trackTrace(message: String, properties: StringDictionary[String]): js.Any = js.native
  def trackTrace(message: String, properties: StringDictionary[String], severityLevel: SeverityLevel): js.Any = js.native
}

