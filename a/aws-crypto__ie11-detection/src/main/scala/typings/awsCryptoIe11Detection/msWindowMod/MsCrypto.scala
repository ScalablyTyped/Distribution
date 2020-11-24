package typings.awsCryptoIe11Detection.msWindowMod

import typings.awsCryptoIe11Detection.msSubtleCryptoMod.MsSubtleCrypto
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsCrypto extends js.Object {
  
  def getRandomValues(toFill: Uint8Array): Unit = js.native
  
  var subtle: MsSubtleCrypto = js.native
}
object MsCrypto {
  
  @scala.inline
  def apply(getRandomValues: Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsCrypto]
  }
  
  @scala.inline
  implicit class MsCryptoOps[Self <: MsCrypto] (val x: Self) extends AnyVal {
    
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
    def setGetRandomValues(value: Uint8Array => Unit): Self = this.set("getRandomValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtle(value: MsSubtleCrypto): Self = this.set("subtle", value.asInstanceOf[js.Any])
  }
}
