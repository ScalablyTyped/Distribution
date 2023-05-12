package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DisconnectionListener = js.Function1[/* eventData */ DisconnectionEvent, Unit]

type HeaderValue = js.UndefOr[
(/* BooleanTrue, BooleanFalse */ Double) | (/* byte, int16, int32, timestamp */ String) | (/* string */ Payload)]

type MessageListener = js.Function1[/* eventData */ MessageEvent, Unit]

type Payload = String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type StreamEndedListener = js.Function1[/* eventData */ StreamEndedEvent, Unit]
