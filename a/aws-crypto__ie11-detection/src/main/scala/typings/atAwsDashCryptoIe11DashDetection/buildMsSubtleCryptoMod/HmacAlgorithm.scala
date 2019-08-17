package typings.atAwsDashCryptoIe11DashDetection.buildMsSubtleCryptoMod

import typings.atAwsDashCryptoIe11DashDetection.atAwsDashCryptoIe11DashDetectionStrings.HMAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacAlgorithm extends js.Object {
  var hash: HashAlgorithm
  var name: HMAC
}

object HmacAlgorithm {
  @scala.inline
  def apply(hash: HashAlgorithm, name: HMAC): HmacAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash, name = name)
  
    __obj.asInstanceOf[HmacAlgorithm]
  }
}

