package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppInsights extends js.Object {
  var config: IConfig = js.native
  var context: ITelemetryContext = js.native
  var downloadAndSetup: js.UndefOr[js.Function1[/* config */ IConfig, _]] = js.native
  var queue: js.Array[js.Function0[scala.Unit]] = js.native
  /**
           * The custom error handler for Application Insights
           * @param {string} message - The error message
           * @param {string} url - The url where the error was raised
           * @param {number} lineNumber - The line number where the error was raised
           * @param {number} columnNumber - The column number for the line where the error was raised
           * @param {Error}  error - The Error object
           */
  def _onerror(
    message: java.lang.String,
    url: java.lang.String,
    lineNumber: scala.Double,
    columnNumber: scala.Double,
    error: stdLib.Error
  ): js.Any = js.native
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
  def setAuthenticatedUserContext(authenticatedUserId: java.lang.String): js.Any = js.native
  /**
           * Sets the autheticated user id and the account id in this session.
           * User auth id and account id should be of type string. They should not contain commas, semi-colons, equal signs, spaces, or vertical-bars.
           *
           * @param authenticatedUserId {string} - The authenticated user id. A unique and persistent string that represents each authenticated user in the service.
           * @param accountId {string} - An optional string to represent the account associated with the authenticated user.
           */
  def setAuthenticatedUserContext(authenticatedUserId: java.lang.String, accountId: java.lang.String): js.Any = js.native
  /**
           * Sets the autheticated user id and the account id in this session.
           * User auth id and account id should be of type string. They should not contain commas, semi-colons, equal signs, spaces, or vertical-bars.
           *
           * @param authenticatedUserId {string} - The authenticated user id. A unique and persistent string that represents each authenticated user in the service.
           * @param accountId {string} - An optional string to represent the account associated with the authenticated user.
           */
  def setAuthenticatedUserContext(authenticatedUserId: java.lang.String, accountId: java.lang.String, storeInCookie: scala.Boolean): js.Any = js.native
  /**
           * Start timing an extended event. Call {@link stopTrackEvent} to log the event when it ends.
           * @param   name    A string that identifies this event uniquely within the document.
           */
  def startTrackEvent(name: java.lang.String): js.Any = js.native
  /**
           * Starts timing how long the user views a page or other item. Call this when the page opens.
           * This method doesn't send any telemetry. Call {@link stopTrackTelemetry} to log the page when it closes.
           * @param   name  A string that idenfities this item, unique within this HTML document. Defaults to the document title.
           */
  def startTrackPage(): js.Any = js.native
  /**
           * Starts timing how long the user views a page or other item. Call this when the page opens.
           * This method doesn't send any telemetry. Call {@link stopTrackTelemetry} to log the page when it closes.
           * @param   name  A string that idenfities this item, unique within this HTML document. Defaults to the document title.
           */
  def startTrackPage(name: java.lang.String): js.Any = js.native
  /**
           * Log an extended event that you started timing with {@link startTrackEvent}.
           * @param   name    The string you used to identify this event in startTrackEvent.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackEvent(name: java.lang.String): js.Any = js.native
  /**
           * Log an extended event that you started timing with {@link startTrackEvent}.
           * @param   name    The string you used to identify this event in startTrackEvent.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackEvent(name: java.lang.String, properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  /**
           * Log an extended event that you started timing with {@link startTrackEvent}.
           * @param   name    The string you used to identify this event in startTrackEvent.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackEvent(
    name: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  /**
           * Logs how long a page or other item was visible, after {@link startTrackPage}. Call this when the page closes.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackPage(): js.Any = js.native
  /**
           * Logs how long a page or other item was visible, after {@link startTrackPage}. Call this when the page closes.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackPage(name: java.lang.String): js.Any = js.native
  /**
           * Logs how long a page or other item was visible, after {@link startTrackPage}. Call this when the page closes.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackPage(name: java.lang.String, url: java.lang.String): js.Any = js.native
  /**
           * Logs how long a page or other item was visible, after {@link startTrackPage}. Call this when the page closes.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackPage(
    name: java.lang.String,
    url: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
           * Logs how long a page or other item was visible, after {@link startTrackPage}. Call this when the page closes.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def stopTrackPage(
    name: java.lang.String,
    url: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
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
    id: java.lang.String,
    method: java.lang.String,
    absoluteUrl: java.lang.String,
    pathName: java.lang.String,
    totalTime: scala.Double,
    success: scala.Boolean,
    resultCode: scala.Double
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
    id: java.lang.String,
    method: java.lang.String,
    absoluteUrl: java.lang.String,
    pathName: java.lang.String,
    totalTime: scala.Double,
    success: scala.Boolean,
    resultCode: scala.Double,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
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
    id: java.lang.String,
    method: java.lang.String,
    absoluteUrl: java.lang.String,
    pathName: java.lang.String,
    totalTime: scala.Double,
    success: scala.Boolean,
    resultCode: scala.Double,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  /**
           * Log a user action or other occurrence.
           * @param   name    A string to identify this event in the portal.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def trackEvent(name: java.lang.String): js.Any = js.native
  /**
           * Log a user action or other occurrence.
           * @param   name    A string to identify this event in the portal.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def trackEvent(name: java.lang.String, properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  /**
           * Log a user action or other occurrence.
           * @param   name    A string to identify this event in the portal.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           */
  def trackEvent(
    name: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  /**
           * Log an exception you have caught.
           * @param   exception   An Error from a catch clause, or the string error message.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   severityLevel   AI.SeverityLevel - severity level
           */
  def trackException(exception: stdLib.Error): js.Any = js.native
  /**
           * Log an exception you have caught.
           * @param   exception   An Error from a catch clause, or the string error message.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   severityLevel   AI.SeverityLevel - severity level
           */
  def trackException(exception: stdLib.Error, handledAt: java.lang.String): js.Any = js.native
  /**
           * Log an exception you have caught.
           * @param   exception   An Error from a catch clause, or the string error message.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   severityLevel   AI.SeverityLevel - severity level
           */
  def trackException(
    exception: stdLib.Error,
    handledAt: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
           * Log an exception you have caught.
           * @param   exception   An Error from a catch clause, or the string error message.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   severityLevel   AI.SeverityLevel - severity level
           */
  def trackException(
    exception: stdLib.Error,
    handledAt: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  /**
           * Log an exception you have caught.
           * @param   exception   An Error from a catch clause, or the string error message.
           * @param   properties  map[string, string] - additional data used to filter events and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this event, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   severityLevel   AI.SeverityLevel - severity level
           */
  def trackException(
    exception: stdLib.Error,
    handledAt: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double],
    severityLevel: applicationinsightsDashJsLib.AINs.SeverityLevel
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
  def trackMetric(name: java.lang.String, average: scala.Double): js.Any = js.native
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
  def trackMetric(name: java.lang.String, average: scala.Double, sampleCount: scala.Double): js.Any = js.native
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
  def trackMetric(name: java.lang.String, average: scala.Double, sampleCount: scala.Double, min: scala.Double): js.Any = js.native
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
  def trackMetric(
    name: java.lang.String,
    average: scala.Double,
    sampleCount: scala.Double,
    min: scala.Double,
    max: scala.Double
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
  def trackMetric(
    name: java.lang.String,
    average: scala.Double,
    sampleCount: scala.Double,
    min: scala.Double,
    max: scala.Double,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(name: java.lang.String): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(name: java.lang.String, url: java.lang.String): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(
    name: java.lang.String,
    url: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(
    name: java.lang.String,
    url: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  /**
           * Logs that a page or other item was viewed.
           * @param   name  The string you used as the name in startTrackPage. Defaults to the document title.
           * @param   url   String - a relative or absolute URL that identifies the page or other item. Defaults to the window location.
           * @param   properties  map[string, string] - additional data used to filter pages and metrics in the portal. Defaults to empty.
           * @param   measurements    map[string, number] - metrics associated with this page, displayed in Metrics Explorer on the portal. Defaults to empty.
           * @param   duration    number - the number of milliseconds it took to load the page. Defaults to undefined. If set to default value, page load time is calculated internally.
           */
  def trackPageView(
    name: java.lang.String,
    url: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    measurements: ScalablyTyped.runtime.StringDictionary[scala.Double],
    duration: scala.Double
  ): js.Any = js.native
  /**
           * Log a diagnostic message.
           * @param    message A message string
           * @param    properties  map[string, string] - additional data used to filter traces in the portal. Defaults to empty.
           */
  def trackTrace(message: java.lang.String): js.Any = js.native
  /**
           * Log a diagnostic message.
           * @param    message A message string
           * @param    properties  map[string, string] - additional data used to filter traces in the portal. Defaults to empty.
           */
  def trackTrace(message: java.lang.String, properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Any = js.native
  /**
           * Log a diagnostic message.
           * @param    message A message string
           * @param    properties  map[string, string] - additional data used to filter traces in the portal. Defaults to empty.
           */
  def trackTrace(
    message: java.lang.String,
    properties: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    severityLevel: applicationinsightsDashJsLib.AINs.SeverityLevel
  ): js.Any = js.native
}

