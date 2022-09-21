package typings.awsCrt

import typings.awsCrt.cryptoMod.Hashable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checksumsMod {
  
  @JSImport("aws-crt/dist/native/checksums", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def crc32(data: Hashable): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def crc32(data: Hashable, previous: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def crc32c(data: Hashable): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32c")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def crc32c(data: Hashable, previous: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32c")(data.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Double]
}
