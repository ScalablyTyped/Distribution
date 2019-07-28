package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.IApplication
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.IDevice
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.IInternal
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.ILocation
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.IOperation
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISample
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.ISession
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ContextNs.IUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITelemetryContext extends js.Object {
  /**
    * The object describing a component tracked by this object.
    */
  var application: IApplication
  /**
    * The object describing a device tracked by this object.
    */
  var device: IDevice
  /**
    * The object describing internal settings.
    */
  var internal: IInternal
  /**
    * The object describing a location tracked by this object.
    */
  var location: ILocation
  /**
    * The object describing a operation tracked by this object.
    */
  var operation: IOperation
  /**
    * The object describing sampling settings.
    */
  var sample: ISample
  /**
    * The object describing a session tracked by this object.
    */
  var session: ISession
  /**
    * The object describing a user tracked by this object.
    */
  var user: IUser
  /**
    * Adds telemetry initializer to the collection. Telemetry initializers will be called one by one
    * before telemetry item is pushed for sending and in the order they were added.
    */
  def addTelemetryInitializer(telemetryInitializer: js.Function1[/* envelope */ IEnvelope, Boolean | Unit]): js.Any
  /**
    * Tracks telemetry object.
    */
  def track(envelope: IEnvelope): js.Any
}

object ITelemetryContext {
  @scala.inline
  def apply(
    addTelemetryInitializer: js.Function1[/* envelope */ IEnvelope, Boolean | Unit] => js.Any,
    application: IApplication,
    device: IDevice,
    internal: IInternal,
    location: ILocation,
    operation: IOperation,
    sample: ISample,
    session: ISession,
    track: IEnvelope => js.Any,
    user: IUser
  ): ITelemetryContext = {
    val __obj = js.Dynamic.literal(addTelemetryInitializer = js.Any.fromFunction1(addTelemetryInitializer), application = application, device = device, internal = internal, location = location, operation = operation, sample = sample, session = session, track = js.Any.fromFunction1(track), user = user)
  
    __obj.asInstanceOf[ITelemetryContext]
  }
}

