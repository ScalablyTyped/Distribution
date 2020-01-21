package typings.awsCryptoIe11Detection.msSubtleCryptoMod

import typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HmacAlgorithm]
  }
}

