package typings.asn1js.mod

import typings.asn1js.anon.IsIndefiniteForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalLengthBlockParams extends js.Object {
  
  var lenBlock: js.UndefOr[IsIndefiniteForm] = js.native
}
object LocalLengthBlockParams {
  
  @scala.inline
  def apply(): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
  
  @scala.inline
  implicit class LocalLengthBlockParamsOps[Self <: LocalLengthBlockParams] (val x: Self) extends AnyVal {
    
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
    def setLenBlock(value: IsIndefiniteForm): Self = this.set("lenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLenBlock: Self = this.set("lenBlock", js.undefined)
  }
}
