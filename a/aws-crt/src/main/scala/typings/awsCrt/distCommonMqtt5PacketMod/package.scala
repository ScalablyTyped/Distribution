package typings.awsCrt.distCommonMqtt5PacketMod

import typings.awsCrt.distCommonMqtt5PacketMod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isSuccessfulConnectReasonCode(reasonCode: ConnectReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulConnectReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSuccessfulDisconnectReasonCode(reasonCode: DisconnectReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulDisconnectReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSuccessfulPubackReasonCode(reasonCode: PubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulPubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSuccessfulSubackReasonCode(reasonCode: SubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulSubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSuccessfulUnsubackReasonCode(reasonCode: UnsubackReasonCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulUnsubackReasonCode")(reasonCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type BinaryData = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type Payload = String | (Record[String, Any]) | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
