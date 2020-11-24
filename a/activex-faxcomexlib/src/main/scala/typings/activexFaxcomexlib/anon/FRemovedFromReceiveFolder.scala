package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FRemovedFromReceiveFolder extends js.Object {
  
  val bstrMessageId: String = js.native
  
  val fRemovedFromReceiveFolder: Boolean = js.native
  
  val pFaxAccount: FaxAccount = js.native
}
object FRemovedFromReceiveFolder {
  
  @scala.inline
  def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): FRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FRemovedFromReceiveFolder]
  }
  
  @scala.inline
  implicit class FRemovedFromReceiveFolderOps[Self <: FRemovedFromReceiveFolder] (val x: Self) extends AnyVal {
    
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
    def setBstrMessageId(value: String): Self = this.set("bstrMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRemovedFromReceiveFolder(value: Boolean): Self = this.set("fRemovedFromReceiveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = this.set("pFaxAccount", value.asInstanceOf[js.Any])
  }
}
