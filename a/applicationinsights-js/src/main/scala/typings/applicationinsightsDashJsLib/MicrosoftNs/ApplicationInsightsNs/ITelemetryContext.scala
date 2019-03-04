package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITelemetryContext extends js.Object {
  /**
    * The object describing a component tracked by this object.
    */
  var application: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IApplication
  /**
    * The object describing a device tracked by this object.
    */
  var device: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IDevice
  /**
    * The object describing internal settings.
    */
  var internal: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IInternal
  /**
    * The object describing a location tracked by this object.
    */
  var location: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ILocation
  /**
    * The object describing a operation tracked by this object.
    */
  var operation: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IOperation
  /**
    * The object describing sampling settings.
    */
  var sample: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISample
  /**
    * The object describing a session tracked by this object.
    */
  var session: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISession
  /**
    * The object describing a user tracked by this object.
    */
  var user: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IUser
  /**
    * Adds telemetry initializer to the collection. Telemetry initializers will be called one by one
    * before telemetry item is pushed for sending and in the order they were added.
    */
  def addTelemetryInitializer(telemetryInitializer: js.Function1[/* envelope */ IEnvelope, scala.Boolean | scala.Unit]): js.Any
  /**
    * Tracks telemetry object.
    */
  def track(envelope: IEnvelope): js.Any
}

object ITelemetryContext {
  @scala.inline
  def apply(
    addTelemetryInitializer: js.Function1[js.Function1[/* envelope */ IEnvelope, scala.Boolean | scala.Unit], js.Any],
    application: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IApplication,
    device: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IDevice,
    internal: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IInternal,
    location: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ILocation,
    operation: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IOperation,
    sample: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISample,
    session: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISession,
    track: js.Function1[IEnvelope, js.Any],
    user: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs.IUser
  ): ITelemetryContext = {
    val __obj = js.Dynamic.literal(addTelemetryInitializer = addTelemetryInitializer, application = application, device = device, internal = internal, location = location, operation = operation, sample = sample, session = session, track = track, user = user)
  
    __obj.asInstanceOf[ITelemetryContext]
  }
}

