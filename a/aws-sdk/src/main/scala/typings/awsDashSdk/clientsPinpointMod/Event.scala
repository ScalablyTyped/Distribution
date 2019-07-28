package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The package name of the app that's recording the event.
    */
  var AppPackageName: js.UndefOr[__string] = js.undefined
  /**
    * The title of the app that's recording the event.
    */
  var AppTitle: js.UndefOr[__string] = js.undefined
  /**
    * The version number of the app that's recording the event.
    */
  var AppVersionCode: js.UndefOr[__string] = js.undefined
  /**
    * One or more custom attributes that are associated with the event.
    */
  var Attributes: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[__string] = js.undefined
  /**
    * The name of the event.
    */
  var EventType: __string
  /**
    * One or more custom metrics that are associated with the event.
    */
  var Metrics: js.UndefOr[MapOf__double] = js.undefined
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[__string] = js.undefined
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Session] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the event occurred.
    */
  var Timestamp: __string
}

object Event {
  @scala.inline
  def apply(
    EventType: __string,
    Timestamp: __string,
    AppPackageName: __string = null,
    AppTitle: __string = null,
    AppVersionCode: __string = null,
    Attributes: MapOf__string = null,
    ClientSdkVersion: __string = null,
    Metrics: MapOf__double = null,
    SdkName: __string = null,
    Session: Session = null
  ): Event = {
    val __obj = js.Dynamic.literal(EventType = EventType, Timestamp = Timestamp)
    if (AppPackageName != null) __obj.updateDynamic("AppPackageName")(AppPackageName)
    if (AppTitle != null) __obj.updateDynamic("AppTitle")(AppTitle)
    if (AppVersionCode != null) __obj.updateDynamic("AppVersionCode")(AppVersionCode)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (SdkName != null) __obj.updateDynamic("SdkName")(SdkName)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[Event]
  }
}

