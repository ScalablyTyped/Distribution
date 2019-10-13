package typings.applicationinsights.outLibraryTelemetryClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application Insights telemetry client provides interface to track telemetry items, register telemetry initializers and
  * and manually trigger immediate sending (flushing)
  */
@JSImport("applicationinsights/out/Library/TelemetryClient", JSImport.Namespace)
@js.native
/**
  * Constructs a new client of the client
  * @param setupString the Connection String or Instrumentation Key to use (read from environment variable if not specified)
  */
class ^ () extends TelemetryClient {
  def this(setupString: String) = this()
}

