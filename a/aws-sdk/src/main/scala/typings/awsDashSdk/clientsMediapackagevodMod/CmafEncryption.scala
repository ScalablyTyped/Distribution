package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafEncryption extends js.Object {
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackagevodMod.SpekeKeyProvider = js.native
}

object CmafEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): CmafEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CmafEncryption]
  }
}

