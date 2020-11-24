package typings.ably.mod.Types

import typings.ably.ablyStrings.aes
import typings.ably.ablyStrings.cbc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// user should not be interacting with it - output of getDefaultParams should be used opaquely
@js.native
trait CipherParamOptions extends js.Object {
  
  var algorithm: js.UndefOr[aes] = js.native
  
  var key: CipherKeyParam = js.native
  
  var keyLength: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[cbc] = js.native
}
object CipherParamOptions {
  
  @scala.inline
  def apply(key: CipherKeyParam): CipherParamOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherParamOptions]
  }
  
  @scala.inline
  implicit class CipherParamOptionsOps[Self <: CipherParamOptions] (val x: Self) extends AnyVal {
    
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
    def setKey(value: CipherKeyParam): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: aes): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
    
    @scala.inline
    def setMode(value: cbc): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
