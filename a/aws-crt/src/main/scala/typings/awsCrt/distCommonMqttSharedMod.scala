package typings.awsCrt

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMqttSharedMod {
  
  @JSImport("aws-crt/dist/common/mqtt_shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/common/mqtt_shared", "DEFAULT_KEEP_ALIVE")
  @js.native
  val DEFAULT_KEEP_ALIVE: Double = js.native
  
  inline def normalizePayload(payload: Any): Buffer | String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize_payload")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer | String]
}
