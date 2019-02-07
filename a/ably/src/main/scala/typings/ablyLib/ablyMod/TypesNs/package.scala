package typings
package ablyLib.ablyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  type ChannelEvent = ablyLib.ablyMod.TypesNs.ChannelEventNs.FAILED | ablyLib.ablyMod.TypesNs.ChannelEventNs.INITIALIZED | ablyLib.ablyMod.TypesNs.ChannelEventNs.SUSPENDED | ablyLib.ablyMod.TypesNs.ChannelEventNs.ATTACHED | ablyLib.ablyMod.TypesNs.ChannelEventNs.ATTACHING | ablyLib.ablyMod.TypesNs.ChannelEventNs.DETACHED | ablyLib.ablyMod.TypesNs.ChannelEventNs.DETACHING | ablyLib.ablyMod.TypesNs.ChannelEventNs.UPDATE
  type ChannelState = ablyLib.ablyMod.TypesNs.ChannelStateNs.FAILED | ablyLib.ablyMod.TypesNs.ChannelStateNs.INITIALIZED | ablyLib.ablyMod.TypesNs.ChannelStateNs.SUSPENDED | ablyLib.ablyMod.TypesNs.ChannelStateNs.ATTACHED | ablyLib.ablyMod.TypesNs.ChannelStateNs.ATTACHING | ablyLib.ablyMod.TypesNs.ChannelStateNs.DETACHED | ablyLib.ablyMod.TypesNs.ChannelStateNs.DETACHING
  type ConnectionEvent = ablyLib.ablyMod.TypesNs.ConnectionEventNs.INITIALIZED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.CONNECTED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.CONNECTING | ablyLib.ablyMod.TypesNs.ConnectionEventNs.DISCONNECTED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.SUSPENDED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.CLOSED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.CLOSING | ablyLib.ablyMod.TypesNs.ConnectionEventNs.FAILED | ablyLib.ablyMod.TypesNs.ConnectionEventNs.UPDATE
  type ConnectionState = ablyLib.ablyMod.TypesNs.ConnectionStateNs.INITIALIZED | ablyLib.ablyMod.TypesNs.ConnectionStateNs.CONNECTED | ablyLib.ablyMod.TypesNs.ConnectionStateNs.CONNECTING | ablyLib.ablyMod.TypesNs.ConnectionStateNs.DISCONNECTED | ablyLib.ablyMod.TypesNs.ConnectionStateNs.SUSPENDED | ablyLib.ablyMod.TypesNs.ConnectionStateNs.CLOSED | ablyLib.ablyMod.TypesNs.ConnectionStateNs.CLOSING | ablyLib.ablyMod.TypesNs.ConnectionStateNs.FAILED
  type DevicePushState = ablyLib.ablyLibStrings.ACTIVE | ablyLib.ablyLibStrings.FAILING | ablyLib.ablyLibStrings.FAILED
  type HTTPMethods = ablyLib.ablyMod.TypesNs.HTTPMethodsNs.GET | ablyLib.ablyMod.TypesNs.HTTPMethodsNs.POST
  type PresenceAction = ablyLib.ablyMod.TypesNs.PresenceActionNs.ABSENT | ablyLib.ablyMod.TypesNs.PresenceActionNs.PRESENT | ablyLib.ablyMod.TypesNs.PresenceActionNs.ENTER | ablyLib.ablyMod.TypesNs.PresenceActionNs.LEAVE | ablyLib.ablyMod.TypesNs.PresenceActionNs.UPDATE
  type StatsIntervalGranularity = ablyLib.ablyMod.TypesNs.StatsIntervalGranularityNs.MINUTE | ablyLib.ablyMod.TypesNs.StatsIntervalGranularityNs.HOUR | ablyLib.ablyMod.TypesNs.StatsIntervalGranularityNs.DAY | ablyLib.ablyMod.TypesNs.StatsIntervalGranularityNs.MONTH
  type channelEventCallback = js.Function1[/* changeStateChange */ ChannelStateChange, scala.Unit]
  type connectionEventCallback = js.Function1[/* connectionStateChange */ ConnectionStateChange, scala.Unit]
  type errorCallback = js.Function1[/* error */ ErrorInfo, scala.Unit]
  type fromEncoded[T] = js.Function2[/* JsonObject */ js.Any, /* channelOptions */ js.UndefOr[ChannelOptions], T]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, scala.Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[/* error */ ErrorInfo, /* results */ PaginatedResult[T], scala.Unit]
  type realtimePresenceGetCallback = js.Function2[/* error */ ErrorInfo, /* messages */ js.Array[PresenceMessage], scala.Unit]
  type standardCallback = js.Function2[/* error */ ErrorInfo, /* results */ js.Any, scala.Unit]
  type timeCallback = js.Function2[/* error */ ErrorInfo, /* time */ scala.Double, scala.Unit]
  type tokenDetailsCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenDetails, scala.Unit]
  type tokenRequestCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenRequest, scala.Unit]
}
