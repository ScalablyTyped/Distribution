package typings.awsCryptoSha256Js

import typings.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Sha256 ()
    extends typings.awsCryptoSha256Js.jsSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
