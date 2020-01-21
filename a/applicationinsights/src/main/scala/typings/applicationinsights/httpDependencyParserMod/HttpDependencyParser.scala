package typings.applicationinsights.httpDependencyParserMod

import typings.applicationinsights.dependencyTelemetryMod.DependencyTelemetry
import typings.applicationinsights.requestParserMod.RequestParser
import typings.applicationinsights.telemetryMod.Telemetry
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to read data from the requst/response objects and convert them into the telemetry contract
  */
@js.native
trait HttpDependencyParser extends RequestParser {
  var correlationId: js.Any = js.native
  /**
    * Gets a dependency data contract object for a completed ClientRequest.
    */
  def getDependencyTelemetry(): DependencyTelemetry = js.native
  def getDependencyTelemetry(baseTelemetry: Telemetry): DependencyTelemetry = js.native
  def getDependencyTelemetry(baseTelemetry: Telemetry, dependencyId: String): DependencyTelemetry = js.native
  /**
    * Called when the ClientRequest emits an error event.
    */
  def onError(error: Error): Unit = js.native
  /**
    * Called when the ClientRequest emits a response event.
    */
  def onResponse(
    response: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify http.ClientResponse */ js.Any
  ): Unit = js.native
}

