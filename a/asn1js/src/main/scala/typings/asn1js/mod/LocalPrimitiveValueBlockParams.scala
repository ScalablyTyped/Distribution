package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalPrimitiveValueBlockParams extends LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
}
object LocalPrimitiveValueBlockParams {
  
  @scala.inline
  def apply(): LocalPrimitiveValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalPrimitiveValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalPrimitiveValueBlockParamsOps[Self <: LocalPrimitiveValueBlockParams] (val x: Self) extends AnyVal {
    
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
    def setIsHexOnly(value: scala.Boolean): Self = this.set("isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHexOnly: Self = this.set("isHexOnly", js.undefined)
    
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = this.set("valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueHex: Self = this.set("valueHex", js.undefined)
  }
}
