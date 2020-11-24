package typings.awsCryptoIe11Detection.msSubtleCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashAlgorithm extends js.Object {
  
  var name: Ie11DigestAlgorithm = js.native
}
object HashAlgorithm {
  
  @scala.inline
  def apply(name: Ie11DigestAlgorithm): HashAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithm]
  }
  
  @scala.inline
  implicit class HashAlgorithmOps[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setName(value: Ie11DigestAlgorithm): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
