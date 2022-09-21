package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.utilMod.FromMap
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeJsonBytesToObj[T](bytes: Buffer, `type`: FromMap[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeJsonBytesToObj")(bytes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def validateAndSerializeToJsonBytes(o: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndSerializeToJsonBytes")(o.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
