package typings.ably.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Types {
  
  type CapabilityOp_ = typings.ably.mod.Types.capabilityOp
  
  type ChannelEvent = typings.ably.mod.Types.ChannelEvent.FAILED | typings.ably.mod.Types.ChannelEvent.INITIALIZED | typings.ably.mod.Types.ChannelEvent.SUSPENDED | typings.ably.mod.Types.ChannelEvent.ATTACHED | typings.ably.mod.Types.ChannelEvent.ATTACHING | typings.ably.mod.Types.ChannelEvent.DETACHED | typings.ably.mod.Types.ChannelEvent.DETACHING | typings.ably.mod.Types.ChannelEvent.UPDATE
  
  type ChannelModes = js.Array[typings.ably.mod.Types.ChannelMode]
  
  type ChannelParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ChannelState = typings.ably.mod.Types.ChannelState.FAILED | typings.ably.mod.Types.ChannelState.INITIALIZED | typings.ably.mod.Types.ChannelState.SUSPENDED | typings.ably.mod.Types.ChannelState.ATTACHED | typings.ably.mod.Types.ChannelState.ATTACHING | typings.ably.mod.Types.ChannelState.DETACHED | typings.ably.mod.Types.ChannelState.DETACHING
  
  type CipherKey = js.Any
  
  type CipherKeyParam = typings.std.ArrayBuffer | typings.std.Uint8Array | java.lang.String
  
  type ConnectionEvent = typings.ably.mod.Types.ConnectionEvent.INITIALIZED | typings.ably.mod.Types.ConnectionEvent.CONNECTED | typings.ably.mod.Types.ConnectionEvent.CONNECTING | typings.ably.mod.Types.ConnectionEvent.DISCONNECTED | typings.ably.mod.Types.ConnectionEvent.SUSPENDED | typings.ably.mod.Types.ConnectionEvent.CLOSED | typings.ably.mod.Types.ConnectionEvent.CLOSING | typings.ably.mod.Types.ConnectionEvent.FAILED | typings.ably.mod.Types.ConnectionEvent.UPDATE
  
  type ConnectionState = typings.ably.mod.Types.ConnectionState.INITIALIZED | typings.ably.mod.Types.ConnectionState.CONNECTED | typings.ably.mod.Types.ConnectionState.CONNECTING | typings.ably.mod.Types.ConnectionState.DISCONNECTED | typings.ably.mod.Types.ConnectionState.SUSPENDED | typings.ably.mod.Types.ConnectionState.CLOSED | typings.ably.mod.Types.ConnectionState.CLOSING | typings.ably.mod.Types.ConnectionState.FAILED
  
  type HTTPMethods = typings.ably.mod.Types.HTTPMethods.GET | typings.ably.mod.Types.HTTPMethods.POST
  
  type PresenceAction = typings.ably.mod.Types.PresenceAction.ABSENT | typings.ably.mod.Types.PresenceAction.PRESENT | typings.ably.mod.Types.PresenceAction.ENTER | typings.ably.mod.Types.PresenceAction.LEAVE | typings.ably.mod.Types.PresenceAction.UPDATE
  
  // Common Listeners
  type StandardCallback[T] = js.Function2[
    /* err */ typings.ably.mod.Types.ErrorInfo | scala.Null, 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type StatsIntervalGranularity = typings.ably.mod.Types.StatsIntervalGranularity.MINUTE | typings.ably.mod.Types.StatsIntervalGranularity.HOUR | typings.ably.mod.Types.StatsIntervalGranularity.DAY | typings.ably.mod.Types.StatsIntervalGranularity.MONTH
  
  type channelEventCallback = js.Function1[/* changeStateChange */ typings.ably.mod.Types.ChannelStateChange, scala.Unit]
  
  type connectionEventCallback = js.Function1[
    /* connectionStateChange */ typings.ably.mod.Types.ConnectionStateChange, 
    scala.Unit
  ]
  
  type errorCallback = js.Function1[/* error */ js.UndefOr[typings.ably.mod.Types.ErrorInfo], scala.Unit]
  
  type fromEncoded[T] = js.Function2[
    /* JsonObject */ js.Any, 
    /* channelOptions */ js.UndefOr[typings.ably.mod.Types.ChannelOptions], 
    T
  ]
  
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[typings.ably.mod.Types.ChannelOptions], 
    js.Array[T]
  ]
  
  type messageCallback[T] = js.Function1[/* message */ T, scala.Unit]
  
  type paginatedResultCallback[T] = typings.ably.mod.Types.StandardCallback[typings.ably.mod.Types.PaginatedResult[T]]
  
  type realtimePresenceGetCallback = typings.ably.mod.Types.StandardCallback[js.Array[typings.ably.mod.Types.PresenceMessage]]
  
  type timeCallback = typings.ably.mod.Types.StandardCallback[scala.Double]
  
  type tokenDetailsCallback = typings.ably.mod.Types.StandardCallback[typings.ably.mod.Types.TokenDetails]
  
  type tokenRequestCallback = typings.ably.mod.Types.StandardCallback[typings.ably.mod.Types.TokenRequest]
}
