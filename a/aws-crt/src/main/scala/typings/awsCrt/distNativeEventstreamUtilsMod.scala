package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeEventstreamUtilsMod {
  
  @JSImport("aws-crt/dist/native/eventstream_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MAX_INT16")
  @js.native
  val MAX_INT16: Double = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MAX_INT32")
  @js.native
  val MAX_INT32: Double = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MAX_INT64")
  @js.native
  val MAX_INT64: js.BigInt = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MAX_INT8")
  @js.native
  val MAX_INT8: Double = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MIN_INT16")
  @js.native
  val MIN_INT16: Double = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MIN_INT32")
  @js.native
  val MIN_INT32: Double = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MIN_INT64")
  @js.native
  val MIN_INT64: js.BigInt = js.native
  
  @JSImport("aws-crt/dist/native/eventstream_utils", "MIN_INT8")
  @js.native
  val MIN_INT8: Double = js.native
  
  inline def marshalInt64BigintAsBuffer(value: js.BigInt): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("marshalInt64BigintAsBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def unmarshalInt64BigintFromBuffer(buffer: js.typedarray.ArrayBuffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalInt64BigintFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
}
