package typings.awsCryptoIe11Detection.msSubtleCryptoMod

import typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacAlgorithm extends js.Object {
  
  var hash: HashAlgorithm = js.native
  
  var name: HMAC = js.native
}
object HmacAlgorithm {
  
  @scala.inline
  def apply(hash: HashAlgorithm, name: HMAC): HmacAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacAlgorithm]
  }
  
  @scala.inline
  implicit class HmacAlgorithmOps[Self <: HmacAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: HashAlgorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: HMAC): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
