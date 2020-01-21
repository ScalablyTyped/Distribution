package typings.applicationinsights.nodeClientMod

import typings.applicationinsights.nodeHttpDependencyTelemetryMod.NodeHttpDependencyTelemetry
import typings.applicationinsights.nodeHttpRequestTelemetryMod.NodeHttpRequestTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application Insights Telemetry Client for Node.JS. Provides the Application Insights TelemetryClient API
  * in addition to Node-specific helper functions.
  * Construct a new TelemetryClient to have an instance with a different configuration than the default client.
  * In most cases, `appInsights.defaultClient` should be used instead.
  */
@js.native
trait NodeClient
  extends typings.applicationinsights.telemetryClientMod.^ {
  /**
    * Log DependencyTelemetry from outgoing HTTP request. This method will instrument the outgoing request and append
    * the specified headers and will log the telemetry when outgoing request is complete
    * @param telemetry Object encapsulating outgoing request information
    */
  def trackNodeHttpDependency(telemetry: NodeHttpDependencyTelemetry): Unit = js.native
  /**
    * Log RequestTelemetry from HTTP request and response. This method will `follow` the request to completion.
    * Use trackNodeHttpRequestSync function to log telemetry immediately without waiting for request completion
    * @param telemetry Object encapsulating incoming request and response information
    */
  def trackNodeHttpRequest(telemetry: NodeHttpRequestTelemetry): Unit = js.native
  /**
    * Log RequestTelemetry from HTTP request and response. This method will log immediately without waitng for request completion
    * and it requires duration parameter to be specified on NodeHttpRequestTelemetry object.
    * Use trackNodeHttpRequest function to log the telemetry after request completion
    * @param telemetry Object encapsulating incoming request, response and duration information
    */
  def trackNodeHttpRequestSync(telemetry: NodeHttpRequestTelemetry): Unit = js.native
}

