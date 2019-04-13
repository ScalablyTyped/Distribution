package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The package name associated with the app that's recording the event.
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
    * Custom attributes that are associated with the event you're adding or updating.
    */
  var Attributes: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[__string] = js.undefined
  /**
    * The name of the custom event that you're recording.
    */
  var EventType: js.UndefOr[__string] = js.undefined
  /**
    * Custom metrics related to the event.
    */
  var Metrics: js.UndefOr[MapOf__double] = js.undefined
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[__string] = js.undefined
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[Session] = js.undefined
  /**
    * The date and time when the event occurred, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[__string] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    AppPackageName: __string = null,
    AppTitle: __string = null,
    AppVersionCode: __string = null,
    Attributes: MapOf__string = null,
    ClientSdkVersion: __string = null,
    EventType: __string = null,
    Metrics: MapOf__double = null,
    SdkName: __string = null,
    Session: Session = null,
    Timestamp: __string = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (AppPackageName != null) __obj.updateDynamic("AppPackageName")(AppPackageName)
    if (AppTitle != null) __obj.updateDynamic("AppTitle")(AppTitle)
    if (AppVersionCode != null) __obj.updateDynamic("AppVersionCode")(AppVersionCode)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (SdkName != null) __obj.updateDynamic("SdkName")(SdkName)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[Event]
  }
}

