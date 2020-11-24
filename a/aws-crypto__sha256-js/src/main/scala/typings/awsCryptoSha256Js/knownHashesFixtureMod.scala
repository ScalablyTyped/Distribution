package typings.awsCryptoSha256Js

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-js/build/knownHashes.fixture", JSImport.Namespace)
@js.native
object knownHashesFixtureMod extends js.Object {
  
  val hashTestVectors: js.Array[js.Tuple2[Uint8Array, Uint8Array]] = js.native
  
  val hmacTestVectors: js.Array[js.Tuple3[Uint8Array, Uint8Array, Uint8Array]] = js.native
}
