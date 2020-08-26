package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.IApplication
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.IDevice
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.IInternal
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.ILocation
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.IOperation
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.ISample
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.ISession
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context.IUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITelemetryContext extends js.Object {
  /**
    * The object describing a component tracked by this object.
    */
  var application: IApplication = js.native
  /**
    * The object describing a device tracked by this object.
    */
  var device: IDevice = js.native
  /**
    * The object describing internal settings.
    */
  var internal: IInternal = js.native
  /**
    * The object describing a location tracked by this object.
    */
  var location: ILocation = js.native
  /**
    * The object describing a operation tracked by this object.
    */
  var operation: IOperation = js.native
  /**
    * The object describing sampling settings.
    */
  var sample: ISample = js.native
  /**
    * The object describing a session tracked by this object.
    */
  var session: ISession = js.native
  /**
    * The object describing a user tracked by this object.
    */
  var user: IUser = js.native
  /**
    * Adds telemetry initializer to the collection. Telemetry initializers will be called one by one
    * before telemetry item is pushed for sending and in the order they were added.
    */
  def addTelemetryInitializer(telemetryInitializer: js.Function1[/* envelope */ IEnvelope, Boolean | Unit]): js.Any = js.native
  /**
    * Tracks telemetry object.
    */
  def track(envelope: IEnvelope): js.Any = js.native
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
  @scala.inline
  implicit class ITelemetryContextOps[Self <: ITelemetryContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddTelemetryInitializer(value: js.Function1[/* envelope */ IEnvelope, Boolean | Unit] => js.Any): Self = this.set("addTelemetryInitializer", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: IDevice): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: IInternal): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: IOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSample(value: ISample): Self = this.set("sample", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: ISession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: IEnvelope => js.Any): Self = this.set("track", js.Any.fromFunction1(value))
    @scala.inline
    def setUser(value: IUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

