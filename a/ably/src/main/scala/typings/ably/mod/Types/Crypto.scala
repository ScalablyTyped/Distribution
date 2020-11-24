package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crypto extends js.Object {
  
  def generateRandomKey(callback: StandardCallback[CipherKey]): Unit = js.native
  
  def getDefaultParams(params: CipherParamOptions, callback: StandardCallback[CipherParams]): Unit = js.native
}
object Crypto {
  
  @scala.inline
  def apply(
    generateRandomKey: StandardCallback[CipherKey] => Unit,
    getDefaultParams: (CipherParamOptions, StandardCallback[CipherParams]) => Unit
  ): Crypto = {
    val __obj = js.Dynamic.literal(generateRandomKey = js.Any.fromFunction1(generateRandomKey), getDefaultParams = js.Any.fromFunction2(getDefaultParams))
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit class CryptoOps[Self <: Crypto] (val x: Self) extends AnyVal {
    
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
    def setGenerateRandomKey(value: StandardCallback[CipherKey] => Unit): Self = this.set("generateRandomKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultParams(value: (CipherParamOptions, StandardCallback[CipherParams]) => Unit): Self = this.set("getDefaultParams", js.Any.fromFunction2(value))
  }
}
