package typings.applicationinsightsDashJs.Microsoft.ApplicationInsights

import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.IApplication
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.IDevice
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.IInternal
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.ILocation
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.IOperation
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.ISample
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.ISession
import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context.IUser
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
    val __obj = js.Dynamic.literal(addTelemetryInitializer = js.Any.fromFunction1(addTelemetryInitializer), application = application.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], track = js.Any.fromFunction1(track), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITelemetryContext]
  }
}

